package com.dto.core.ordermanagement;

import java.sql.Timestamp;
import java.util.List;

import com.dto.AbsCommonDTO;


/**
 * @param <T>
 * 
 */
public class OrderListDTO  extends AbsCommonDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5811524043281554862L;

	private Timestamp createdDate;

	private String orderedBy;

	private BusinessCategoryDTO businessCatogory;
	
	private double orderCost;
	
	private String projectSid;
	
	private String companySid;

	private String customerSid;
	
	private OrderStatusDTO orderStatus;
	
	private List<CoreItemDTO> orderHasItemDetails;
	
	private OrderStateDTO orderstate;
	
	public OrderListDTO() {
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getOrderedBy() {
		return this.orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public BusinessCategoryDTO getBusinessCatogory() {
		return this.businessCatogory;
	}

	public void setBusinessCatogory(BusinessCategoryDTO businessCatogory) {
		this.businessCatogory = businessCatogory;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}


	public OrderStatusDTO getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusDTO orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrderStateDTO getOrderstate() {
		return orderstate;
	}

	public void setOrderstate(OrderStateDTO orderstate) {
		this.orderstate = orderstate;
	}

	
	public List<CoreItemDTO> getOrderHasItemDetails() {
		return orderHasItemDetails;
	}

	public void setOrderHasItemDetails(List<CoreItemDTO> orderHasItemDetails) {
		this.orderHasItemDetails = orderHasItemDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderListDTO [createdDate=");
		builder.append(createdDate);
		builder.append(", orderedBy=");
		builder.append(orderedBy);
		builder.append(", businessCatogory=");
		//builder.append(businessCatogory);
		builder.append(", orderCost=");
		builder.append(orderCost);
		builder.append(", projectSid=");
		builder.append(projectSid);
		builder.append(", companySid=");
		builder.append(companySid);
		builder.append(", customerSid=");
		builder.append(customerSid);
		builder.append(", orderStatus=");
		builder.append(orderStatus);
		builder.append(", orderHasItemDetails=");
		builder.append(orderHasItemDetails);
		builder.append(", orderstate=");
		builder.append(orderstate);
		builder.append("]");
		return builder.toString();
	}

	
}