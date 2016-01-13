package com.wisencrazy.restaraunt.datasource;

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
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer.CustomerAccountStatus;

public class ProfileManagementImpl {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(ProfileManagementImpl.class);

	private CommonPersistenceImpl profileRepoServe;
	
	DozerUtil dozerUtil;
	
	
	public ProfileManagementImpl(){
		try {
			profileRepoServe=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			e.printStackTrace();
			logger.error("Error while setting up Repo services");
		}		
	}
	
	public CustomerDTO customerSignup(CustomerSignupDTO customerSignupDTO)
			throws ApplicationException {
		logger.debug("Signup for customer : ");
		String password = null;
		CustomerDTO customer = null;
		validateCustomerDTO(customerSignupDTO);
		CustomerDTO customerDTO = dozerUtil.convert(customerSignupDTO, CustomerDTO.class);
		customerDTO.setSignupType(customerSignupDTO.getSignupType());
		password=customerSignupDTO.getPassword();
		customerDTO.setPassword(password);
		customerDTO.setPassword(CommonUtils.encryptPassword(password));
		createCustomerProfile(customerDTO);
		customer = profileRepoServe.getDtoByNamedQuery(Customer.class, CustomerDTO.class, Customer.FIND_CUSTOMER_BY_EMAIL, QueryParameter.with("email", customerSignupDTO.getEmail()).parameters());
		logger.trace("customerSignup(CustomerSignupDTO) - End");
		return customer;
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

	public void createCustomerProfile(CustomerDTO customerDTO) throws IllegalArgumentException,DuplicateEntryException,ApplicationException{
		String customerSid = null;
		logger.debug("Validation CustomerDTO: {}",JsonUtils.toJson(customerDTO));
		if(!validateCustomerDto(customerDTO)){
			logger.error("Invalidate CustomerDTO");
			throw new IllegalArgumentException();
		}
		logger.info("Checking if customer already exists");
		customerSid = getEmailIfExists(customerDTO.getEmail());
		if(customerSid == null){
			if(CommonUtils.isEmpty(customerDTO.getSid())){
				//This is when the customer is not available
				logger.debug("Creating new customer");
				saveCustomer(customerDTO);
				logger.info("Customer Created");
			}else {
				logger.warn("Customer with email id {} already exists",customerDTO.getEmail());
				throw new DuplicateEntryException();
			}
		}
	}

	
	private String saveCustomer(CustomerDTO customerDTO) throws ApplicationException {
		logger.debug("Saving Customer Info: {}",JsonUtils.toJson(customerDTO));
		Customer customer = null;
		String customerSid = null;
		String password = null;
		logger.trace("Using dozer to convert");
		customer = dozerUtil.convert(customerDTO, Customer.class);
		logger.debug("Saving Customer entity: {}",customer);
		customerSid = customerDTO.getSid();
		customer.setAccountStatus(CustomerAccountStatus.ACTIVE);
		customer.setPassword(password);
		profileRepoServe.save(customer);
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
			
			if(customerDTO.getSignupType() == null){
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
		customerSid = (String) profileRepoServe.findSingleByNamedQuery(Customer.FIND_SID_BY_EMAIL, QueryParameter.with("EMAIL", email).parameters());
		logger.info("customer already exists with this email : {}", email);
		}catch(ApplicationException applicationException){
			if(!applicationException.getLocalizedMessage().equals(ApplicationConstants.GENERAL_EXCEPTION)){
				throw applicationException;
			}
		}
		return customerSid;
	}

}
