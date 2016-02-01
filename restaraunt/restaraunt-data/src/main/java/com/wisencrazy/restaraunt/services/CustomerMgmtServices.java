package com.wisencrazy.restaraunt.services;

import java.util.List;

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
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.CustomerAddress;
import com.wisencrazy.restaraunt.datasource.entities.entity.CustomerHasAddress;
import com.wisencrazy.restaraunt.datasource.entities.entity.ItemCategory;

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
		Integer customerId=null;
		try {
			customerId=commonRepoServ.findIdBySid(Customer.class.getName(), addressDTO.getCustomerSid());
		} catch (Exception e) {
			logger.error("Error while finding Customer by Sid: {}",addressDTO.getCustomerSid());
			throw new IncorrectArgumentException("Invalid Cusomer Sid Passed");
		}
		try {
			//Begin transaction
			commonRepoServ.getEntityManager().getTransaction().begin();
			//Save the CustomerAddress into set the state and country Id hardcoded
			CustomerAddress address=dozerUtil.convert(addressDTO.getCustomerAddress(), CustomerAddress.class);
			address.setStateId(1);
			address.setCountryId(1);
			address.generateUuid();
			logger.debug("Saving Address: {}",JsonUtils.toJson(address));
			commonRepoServ.saveWOTransaction(address);
			//Save the CustomerHasAddress
			CustomerHasAddress hasAddress=new CustomerHasAddress();
			hasAddress.setCustomerId(customerId);
			hasAddress.setCustomerAddressId(address.getId());
			hasAddress.generateUuid();
			logger.debug("Saving hasAddress: {}",JsonUtils.toJson(hasAddress));
			commonRepoServ.saveWOTransaction(hasAddress);
			//Commit the transaction
			commonRepoServ.getEntityManager().getTransaction().commit();
			addressDTO.setSid(hasAddress.bytesToHexString());
		} catch (ApplicationException e) {
			logger.error("Error while saving CustomerAddress : {}",e);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION);
		}
		return addressDTO;
	}
	
	public List<CustomerHasAddressDTO> getAddressForCustomer(String customerSid) throws ApplicationException{
		if(CommonUtils.isEmpty(customerSid))return null;
		return commonRepoServ.getDtoListByNamedQuery(CustomerHasAddress.class, CustomerHasAddressDTO.class, CustomerHasAddress.FIND_BY_CUSTOMER_SID, QueryParameter.with("sid", customerSid).parameters());
	}
	
	
}
