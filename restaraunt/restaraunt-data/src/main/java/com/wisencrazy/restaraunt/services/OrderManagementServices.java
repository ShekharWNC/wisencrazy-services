package com.wisencrazy.restaraunt.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;

import com.dozer.mapper.DozerUtil;
import com.dto.MaxMinRecordDTO;
import com.dto.OrderDTO;
import com.dto.OrderHasItemsDTO;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.SmsServiceProvider;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.common.exception.IncorrectArgumentException;
import com.wisencrazy.common.exception.NoResultException;
import com.wisencrazy.common.exception.SmsDeliveryException;
import com.wisencrazy.restaraunt.datasource.CommonPersistenceImpl;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;
import com.wisencrazy.restaraunt.datasource.entities.entity.CustomerAddress;
import com.wisencrazy.restaraunt.datasource.entities.entity.Item;
import com.wisencrazy.restaraunt.datasource.entities.entity.ItemHasSize;
import com.wisencrazy.restaraunt.datasource.entities.entity.Order;
import com.wisencrazy.restaraunt.datasource.entities.entity.Order.DeliveryType;
import com.wisencrazy.restaraunt.datasource.entities.entity.OrderHasItems;
import com.wisencrazy.restaraunt.datasource.entities.entity.Restaraunt;
import com.wisencrazy.restaraunt.rest.dto.OrderSearchDTO;

public class OrderManagementServices {

	private Logger logger=org.slf4j.LoggerFactory.getLogger(OrderManagementServices.class);

	protected CommonPersistenceImpl commonRepoServ;
	
	protected DozerUtil dozerUtil;
	
	public OrderManagementServices(){
		try {
			logger.debug("Setting up profile");
			commonRepoServ=new CommonPersistenceImpl();
			dozerUtil=DozerUtil.getDozerUtils();
		} catch (ApplicationException e) {
			logger.error("Error while setting up Repo services");
			e.printStackTrace();
		}		
	}

	public String createOrder(OrderDTO orderDTO) throws IncorrectArgumentException,NoResultException,ApplicationException{
		//validate
		logger.debug("Incoming OrderDTO:{}",JsonUtils.toJson(orderDTO));
		if(orderDTO==null)throw new IncorrectArgumentException("Invalid Order Parameter passed");
		if(orderDTO.getCustomer()==null||CommonUtils.isEmpty(orderDTO.getCustomer().getSid()))
			throw new IncorrectArgumentException("Invalid Customer Parameter passed");
		if(orderDTO.getRestaraunt()==null || CommonUtils.isEmpty(orderDTO.getRestaraunt().getSid()))
			throw new IncorrectArgumentException("Invalid Restaraunt Parameter passed");
		if(orderDTO.getOrderHasItems()==null||orderDTO.getOrderHasItems().size()<=0)
			throw new IncorrectArgumentException("Invalid OrderHasItems passed");
		Order order=new Order();
		//validate all the NOT NULL amount
		//total_amount
		if(orderDTO.getTotalAmount()==null || orderDTO.getTotalAmount()<=0.0)
			throw new IncorrectArgumentException("Invalid Total Amount Parameter passed: Cannot be less than equal to zero");
		//billedAmount
		if(orderDTO.getBilledAmount()==null || orderDTO.getBilledAmount()<=0.0)
			throw new IncorrectArgumentException("Invalid Billed Amount Parameter passed: Cannot be less than equal to zero");
		//validate ordered on
		if(orderDTO.getOrderedOn()==null){
			logger.trace("Setting the ordered Date as new Date");
			order.setOrderedOn(new Timestamp(new Date().getTime()));
		}else
			order.setOrderedOn(orderDTO.getOrderedOn());
		order.setTotalAmount(orderDTO.getTotalAmount());
		order.setDeliveryCharges(orderDTO.getDeliveryCharges()==null?0:orderDTO.getDeliveryCharges());
		order.setTaxes(orderDTO.getTaxes());
		order.setDiscounts(orderDTO.getDiscounts());
		order.setBilledAmount(orderDTO.getBilledAmount());
		//call the discount system to check for discount
		//get the restaraunt
		Restaraunt restaraunt=null;
		try {
			restaraunt=commonRepoServ.getEntityBySid(Restaraunt.class.getName(), orderDTO.getRestaraunt().getSid());
			order.setRestroId(restaraunt.getId());
		} catch (NoResultException e) {
			logger.error("Error while fetching Restaraunt for sid {}, {}",orderDTO.getRestaraunt().getSid(),e);
			throw e;
		} catch (ApplicationException e) {
			logger.error("Error while fetching Restaraunt for sid {}, {}",orderDTO.getRestaraunt().getSid(),e);
			throw e;
		} catch (Exception e) {
			logger.error("Error while fetching Restaraunt for sid {}, {}",orderDTO.getRestaraunt().getSid(),e);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, e.getMessage(), e.getCause());
		}
		
		//get the customer
		Customer customer=null;
		try {
			customer=commonRepoServ.getEntityBySid(Customer.class.getName(), orderDTO.getCustomer().getSid());
			order.setCustomerId(customer.getId());
		} catch (NoResultException e) {
			logger.error("Error while fetching Customer for sid {}, {}",orderDTO.getCustomer().getSid(),e);
			throw e;
		} catch (ApplicationException e) {
			logger.error("Error while fetching Customer for sid {}, {}",orderDTO.getCustomer().getSid(),e);
			throw e;
		} catch (Exception e) {
			logger.error("Error while fetching Customer for sid {}, {}",orderDTO.getCustomer().getSid(),e);
			throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, e.getMessage(), e.getCause());
		}
		
		//get the customerAddress if available
		if(orderDTO.getCustomerAddress()!=null && !CommonUtils.isEmpty(orderDTO.getCustomerAddress().getSid())){
			logger.debug("Updating customerAddress");
			Integer customerAddress=null;
			try {
				customerAddress=commonRepoServ.findIdBySid(CustomerAddress.class.getName(), orderDTO.getCustomerAddress().getSid());
				order.setCustomerAddressId(customerAddress);
			} catch (Exception e) {
				logger.error("Error while fetching CustomerAddress for sid {}, {}",orderDTO.getCustomerAddress().getSid(),e);
				throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, e.getMessage(), e.getCause());
			}
		}
		//Pass the list or OrderHasItemsDTO to get the entityDTO list
//		order.setOrderHasItems(convertItemDTO2Items(orderDTO.getOrderHasItems(), order));
		//save
		order.generateUuid();
		order.setDeliveryType(DeliveryType.DE);
		logger.info("Saving Order : {}",JsonUtils.toJson(order));
		commonRepoServ.getEntityManager().getTransaction().begin();
		try {
			commonRepoServ.saveWOTransaction(order);
			saveItemDTO2Items(orderDTO.getOrderHasItems(), order);
			commonRepoServ.getEntityManager().getTransaction().commit();
			/*sendOrderSms(restaraunt, orderDTO);
			sendConfirmationSms(restaraunt, customer);*/
		} catch (ApplicationException e) {
			logger.error("Error while saving Order: {}",e);
			throw e;
		}
		
		return order.bytesToHexString();
	}

	private void sendOrderSms(Restaraunt restaraunt,OrderDTO dto){
		if(restaraunt == null || dto == null)return;
		String restroPhoneNumber=restaraunt.getPrimaryContact();
		StringBuilder message=new StringBuilder("Customer --NAME-- has placed an order");
		message.append("please click the link to view the order -  ");
		try {
			SmsServiceProvider.sendSingleSms(restroPhoneNumber, message.toString(), true, restroPhoneNumber);
		} catch (SmsDeliveryException e) {
			logger.error("Error while sending Order Sms: {}",e);
		}
		

	}
	
	private void sendConfirmationSms(Restaraunt restaraunt,Customer customer){
		if(restaraunt == null || customer == null)return;
		String customerPhoneNumber=customer.getPrimaryContact();
		StringBuilder message=new StringBuilder("Thank you for placing an order with us at ").append(restaraunt.getName());
		message.append("your order will be delivered within ").append(restaraunt.getDeliveryTime());
		try {
			SmsServiceProvider.sendSingleSms(customerPhoneNumber, message.toString(), true, customerPhoneNumber);
		} catch (SmsDeliveryException e) {
			logger.error("Error while sending Order Sms: {}",e);
		}

	}

	private void saveItemDTO2Items(List<OrderHasItemsDTO> hasItemsDTOs,Order order) throws IncorrectArgumentException,ApplicationException{
		logger.debug("Converting List {}",JsonUtils.toJson(hasItemsDTOs));
		//validate list incoming
		if(hasItemsDTOs.size()<=0 || order==null)
			throw new IncorrectArgumentException("Invalid hasItemsDTO passed.");
		//Declare new list
		List<OrderHasItems> hasItems=new ArrayList<OrderHasItems>();
		//start a for loop
		for(OrderHasItemsDTO hasItemsDTO:hasItemsDTOs){
			logger.debug("Processing orderDTO: {}",JsonUtils.toJson(hasItemsDTO));
			//validate item qty and bill
			if(hasItemsDTO.getQuantity()==0||hasItemsDTO.getItemBill()==0.0F)
				throw new IncorrectArgumentException("Invalid hasItemsDTO Quantity and ItemBill passed.");
			//Update the order object
			OrderHasItems orderHasItems=new OrderHasItems();
			orderHasItems.generateUuid();
			orderHasItems.setQuantity(hasItemsDTO.getQuantity());
			orderHasItems.setItemBill(hasItemsDTO.getItemBill());
			try {
				Integer orderId=commonRepoServ.findIdBySid(Order.class.getName(), order.bytesToHexString());
				orderHasItems.setOrderId(orderId);
			} catch (Exception e) {
				logger.error("Error while fetching Item for sid {}, {}",hasItemsDTO.getItem().getSid(),e);
				throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, e.getMessage(), e.getCause());
			}
			//get the item
			try {
				Integer item=commonRepoServ.findIdBySid(Item.class.getName(), hasItemsDTO.getItem().getSid());
				orderHasItems.setItemId(item);
			} catch (Exception e) {
				logger.error("Error while fetching Item for sid {}, {}",hasItemsDTO.getItem().getSid(),e);
				throw new ApplicationException(ApplicationConstants.GENERAL_EXCEPTION, e.getMessage(), e.getCause());
			}
			// Update itemhassize if available
			if(hasItemsDTO.getItemHasSize()!=null && CommonUtils.isEmpty(hasItemsDTO.getItemHasSize().getSid())){
				Integer itemHasSize=commonRepoServ.findIdByName(ItemHasSize.class.getName(),hasItemsDTO.getItemHasSize().getSid());
				orderHasItems.setItemHasSizeId(itemHasSize);
			}
			logger.debug("Saving Order Has items : {}",JsonUtils.toJson(orderHasItems));
			//TODO Handle the exception and delete order and its other orphans
			commonRepoServ.saveWOTransaction(orderHasItems);
		}
	}  
	
	public OrderDTO getOrderBySid(String sid) throws IncorrectArgumentException,NoResultException,ApplicationException{
		if(CommonUtils.isEmpty(sid))
			throw new IncorrectArgumentException("Invalid order Sid passed");
		OrderDTO orderDTO=null;
		try {
			orderDTO = commonRepoServ.getDtoByNamedQuery(Order.class, OrderDTO.class, Order.FIND_BY_SID, QueryParameter.with("sid", sid).parameters());
			return orderDTO;
		} catch (ApplicationException e) {
			logger.error("Error while fetching Order: {} , {}",sid,e);
			throw e;
		}
	}
	
	public List<OrderDTO> getOrdersByRestroSid(String restroSid,OrderSearchDTO searchDTO) throws IncorrectArgumentException,NoResultException,ApplicationException{
		if(CommonUtils.isEmpty(restroSid) || searchDTO==null)
			throw new IncorrectArgumentException("Invalid order Sid passed");
		List<OrderDTO> orderDTOs=new ArrayList<OrderDTO>();
		int startLimit=(searchDTO.getPageIndex()*searchDTO.getCount())-searchDTO.getCount();
		int endLimit=startLimit+searchDTO.getCount();
		try {
			List<Order> orders=commonRepoServ.findEntityListUsingNamedQueryByPagination(Order.FIND_BY_RESTARAUNT_SID, QueryParameter.with("sid", restroSid).and("fromDate", searchDTO.getFromDate()).and("toDate", searchDTO.getToDate()).parameters(), startLimit, endLimit);
			if(orders==null)
				throw new NoResultException("No order found for the query.");
			orderDTOs=dozerUtil.convertList(orders, OrderDTO.class);
			return orderDTOs;
		} catch (ApplicationException e) {
			logger.error("Error while fetching Order: {} , {}",restroSid,e);
			throw e;
		}
	}
}
