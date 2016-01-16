package com.wisencrazy.restaraunt.account;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.CustomerDTO;
import com.dto.CustomerSignupDTO;
import com.dto.constants.EnumConstants.SignupType;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.DuplicateEntryException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer.CustomerAccountStatus;

public class CustomerSignup {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(CustomerSignup.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	
	public CustomerSignup(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			e.printStackTrace();
			logger.error("Error while setting up Repo services");
		}		
	}
	
	public CustomerDTO customerSignup(CustomerSignupDTO customerSignupDTO) throws ApplicationException{
		logger.debug("Signup for customer : ");
		String password = null;
		CustomerDTO customer = null;
		try {
			validateCustomerDTO(customerSignupDTO);
		} catch (ApplicationException e) {
			logger.error("Error while validating customer DTO: {}",e);
			throw e;
		}
		CustomerDTO customerDTO;
		try {
			customerDTO = dozerUtil.convert(customerSignupDTO, CustomerDTO.class);
		} catch (ApplicationException e) {
			logger.error("Error while converting customer DTO: {}",e);
			throw e;
		}
		customerDTO.setSignupType(customerSignupDTO.getSignupType());
		password=customerSignupDTO.getPassword();
		customerDTO.setPassword(password);
		customerDTO.setPassword(CommonUtils.encryptPassword(password));
		try {
			if(createCustomerProfile(customerDTO))
			logger.debug("Customer Signup Completed");
			customer = commonRepoServ.getDtoByNamedQuery(Customer.class, CustomerDTO.class, Customer.FIND_CUSTOMER_BY_EMAIL, QueryParameter.with("email", customerSignupDTO.getEmail()).parameters());
			return customer;
		} catch (IllegalArgumentException e) {
			logger.error("Error while creating customer DTO: {}",e);
			throw e;
		} catch (DuplicateEntryException e) {
			logger.error("Error while creating customer DTO: {}",e);
			throw e;
		} catch (ApplicationException e) {
			logger.error("Genral Error while creating customer DTO: {}",e);
			throw e;
		}
		
	}
	
	public CustomerDTO getCustomerEmail(String email) throws ApplicationException{
		logger.debug("Fetching customer with email: {}",email);
		return commonRepoServ.getDtoByNamedQuery(Customer.class, CustomerDTO.class, Customer.FIND_CUSTOMER_BY_EMAIL, QueryParameter.with("email", "email@test.com").parameters());
	}

	private void validateCustomerDTO(CustomerSignupDTO customerSignupDTO) throws ApplicationException {
		if(customerSignupDTO != null){
			logger.debug("validateCustomerWithSid for {}, {}",customerSignupDTO.getName(),customerSignupDTO.getEmail());
			if(CommonUtils.isEmpty(customerSignupDTO.getName())){
				throw new ApplicationException(ApplicationConstants.SIGNUP_NAME);
			}
			if(CommonUtils.isEmpty(customerSignupDTO.getEmail())){
				throw new ApplicationException(ApplicationConstants.SIGNUP_EMAIL);
			}
			if(customerSignupDTO.getSignupType().equals(SignupType.restaraunt) && CommonUtils.isEmpty(customerSignupDTO.getPassword())){
				throw new ApplicationException(ApplicationConstants.SIGNUP_PASSWORD);
			}
		}
	}

	public boolean createCustomerProfile(CustomerDTO customerDTO) throws IllegalArgumentException,DuplicateEntryException,ApplicationException{
		String customerSid = null;
		logger.debug("Validation CustomerDTO: {}",JsonUtils.toJson(customerDTO));
		if(!validateCustomerDto(customerDTO)){
			logger.error("Invalidate CustomerDTO");
			throw new IllegalArgumentException();
		}
		logger.debug("Checking if customer already exists");
		customerSid = getEmailIfExists(customerDTO.getEmail());
		if(customerSid == null){
			logger.debug("Customer Doesnot exists");
			//This is when the customer is not available
			logger.debug("Creating new customer");
			saveCustomer(customerDTO);
			logger.info("Customer Created");
			return true;
		}else{
			logger.warn("Customer with email id {} already exists",customerDTO.getEmail());
			throw new DuplicateEntryException();
		}
	}

	
	private String saveCustomer(CustomerDTO customerDTO) throws ApplicationException {
		logger.debug("Saving Customer Info: {}",JsonUtils.toJson(customerDTO));
		Customer customer = null;
		String customerSid = null;
		String password = null;
		logger.trace("Using dozer to convert");
		customerDTO.setSid(customerDTO.generateSid());
		customer = dozerUtil.convert(customerDTO, Customer.class);
		logger.debug("Saving Customer entity: {}",customer);
		customerSid = customerDTO.getSid();
		customer.setAccountStatus(CustomerAccountStatus.ACTIVE);
		customer.setPassword(password);
		commonRepoServ.save(customer);
		logger.debug("Customer entity saved");
		return customerSid;
	}
	
	private boolean validateCustomerDto(CustomerDTO customerDTO) throws ApplicationException {
		logger.trace("validateCustomerDto(CustomerDTO customerDTO) - start");
		if(customerDTO != null){
			/*
			 * validate customer email	
			 */
			if(customerDTO.getEmail() != null && customerDTO.getEmail().isEmpty()){
				customerDTO.setEmail(null);
				return false;
			}else {
				CommonUtils.validateEmail(customerDTO.getEmail());
			}
			if(customerDTO.getSignupType()!= null)return true;
			else if(customerDTO.getSignupType() == null){
				customerDTO.setSignupType(SignupType.restaraunt);
				return true;
			}
			return false;
		}else{
			return false;
		}
	}

	private String getEmailIfExists(String email) throws ApplicationException {
		String customerSid = null;
		try{
		customerSid = (String) commonRepoServ.findSingleByNamedQuery(Customer.FIND_SID_BY_EMAIL, QueryParameter.with("email", email).parameters());
		logger.info("customer already exists with this email : {}", email);
		}catch(ApplicationException applicationException){
			logger.error("Error while fetching customer by email id: {}",email);
		}finally {
			return customerSid;			
		}
	}

}
