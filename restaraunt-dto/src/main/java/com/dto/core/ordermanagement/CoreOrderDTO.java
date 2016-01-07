package com.dto.core.ordermanagement;

import java.sql.Timestamp;

import com.dto.AbsCommonDTO;


/**
 * The dto class for the orders database table.
 * @param <T>
 * 
 */
public class CoreOrderDTO  extends AbsCommonDTO{
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
	
	private OrderStatusDTO orderStatusDTO;
	
	public CoreOrderDTO() {
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

	public OrderStatusDTO getOrderStatusDTO() {
		return orderStatusDTO;
	}

	public void setOrderStatusDTO(OrderStatusDTO orderStatusDTO) {
		this.orderStatusDTO = orderStatusDTO;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoreOrderDTO [createdDate=");
		builder.append(createdDate);
		builder.append(", orderedBy=");
		builder.append(orderedBy);
		builder.append(", businessCatogory=");
		builder.append(businessCatogory);
		builder.append(", orderCost=");
		builder.append(orderCost);
		builder.append(", projectSid=");
		builder.append(projectSid);
		builder.append(", companySid=");
		builder.append(companySid);
		builder.append(", customerSid=");
		builder.append(customerSid);
		builder.append(", orderStatusDTO=");
		builder.append(orderStatusDTO);
		builder.append("]");
		return builder.toString();
	}
	
	
}