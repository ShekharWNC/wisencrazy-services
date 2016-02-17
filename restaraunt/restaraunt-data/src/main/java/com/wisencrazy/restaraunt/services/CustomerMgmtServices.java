package com.wisencrazy.restaraunt.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.CustomerHasAddressDTO;
import com.dto.ItemCategoryDTO;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Country;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.CustomerAddress;
import com.wisencrazy.restaraunt.datasource.entities.entity.CustomerHasAddress;
import com.wisencrazy.restaraunt.datasource.entities.entity.CustomerHasAddressPK;
import com.wisencrazy.restaraunt.datasource.entities.entity.ItemCategory;
import com.wisencrazy.restaraunt.datasource.entities.entity.State;

public class CustomerMgmtServices {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(CustomerMgmtServices.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	public CustomerMgmtServices(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			logger.error("Error while setting up Repo services");
			e.printStackTrace();
		}		
	}

	public CustomerHasAddressDTO saveCustomerHasAdrress(CustomerHasAddressDTO addressDTO)throws IncorrectArgumentException,ApplicationException{
		logger.debug("Saving CustomerHasAddress: {}",JsonUtils.toJson(addressDTO));
		//Validate input parameter
		if(addressDTO==null)throw new IncorrectArgumentException("Invalid Parameter");
		//Validate CustomerSid
		if(CommonUtils.isEmpty(addressDTO.getCustomerSid()))
			throw new IncorrectArgumentException("Customer Sid Parameter cannot be null");
		//Validate the CustomerAddress Parameter and the Pincode
		if(addressDTO.getCustomerAddress()==null || CommonUtils.isEmpty(addressDTO.getCustomerAddress().getPin()))
			throw new IncorrectArgumentException("Invalid Address Parameter");
		//Find the customerId
		Customer customer=null;
		try {
			//Begin transaction
			try {
				customer=commonRepoServ.getEntityBySid(Customer.class.getName(), addressDTO.getCustomerSid());
			} catch (Exception e) {
				logger.error("Error while finding Customer by Sid: {}",addressDTO.getCustomerSid());
				throw new IncorrectArgumentException("Invalid Cusomer Sid Passed");
			}
			//Save the CustomerAddress into set the state and country Id hardcoded
			CustomerAddress address=dozerUtil.convert(addressDTO.getCustomerAddress(), CustomerAddress.class);
			Country country=(Country) commonRepoServ.findEntityById(Country.class, 1);
			State state=(State)commonRepoServ.findEntityById(State.class, 1);
			address.setState(state);
			address.setCountry(country);
			address.generateUuid();
			logger.debug("Saving Address: {}",JsonUtils.toJson(address));
			commonRepoServ.save(address);
			logger.debug("Saved Customer Address with ID: {}",address.getId());
			//Save the CustomerHasAddress
			commonRepoServ.getEntityManager().getTransaction().begin();
			Integer addressTO=commonRepoServ.findIdBySid(CustomerAddress.class.getName(), address.bytesToHexString());
			String sqlInsert="Insert into customer_has_address values (?,?,0)";
			Query nativeQuery=commonRepoServ.getEntityManager().createNativeQuery(sqlInsert);
			nativeQuery.setParameter(1, addressTO);
			nativeQuery.setParameter(2, customer.getId());
			nativeQuery.executeUpdate();
			//Commit the transaction
			commonRepoServ.getEntityManager().getTransaction().commit();
		} catch (ApplicationException e) {
			logger.error("Error while saving CustomerAddress : {}",e);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION);
		} catch (Exception e) {
			logger.error("Error while saving CustomerAddress : {}",e);
			throw new ApplicationException(ApplicationConstants.NO_RESULT);
		}
		return addressDTO;
	}
	
	public List<CustomerHasAddressDTO> getAddressForCustomer(String customerSid) throws ApplicationException{
		logger.debug("Fetching Addresses for customerSid : {}",customerSid);
		if(CommonUtils.isEmpty(customerSid))return null;
		logger.debug("Fetching Addresses for customerSid : {}",customerSid);
		return commonRepoServ.getDtoListByNamedQuery(CustomerHasAddress.class, CustomerHasAddressDTO.class, Customer.FIND_CUSTOMER_ADDRESSES_BY_SID, QueryParameter.with("sid", customerSid).parameters());
	}
	
	
}
