package com.dto;

import java.sql.Timestamp;
import java.util.List;
public class OrderDTO extends AbsCommonDTO {
		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8315588192531475994L;

	private Integer restroId;
	
	private Integer customerId;
	
	private Timestamp orderedOn;
	
	private Timestamp deliveredOn;
	
	private Float totalAmount;
	
	private Float taxes;
	
	private Integer deliveryCharges;
	
	private Float discounts;
	
	private Float billedAmount;
	
	private RestarauntOrderDTO restaraunt;

	private CustomerReviewDTO customer;
	
	private CustomerAddressDTO customerAddress;

	private List<OrderHasItemsDTO> orderHasItems;
	
	public Integer getRestroId() {
		return restroId;
	}

	public void setRestroId(Integer restroId) {
		this.restroId = restroId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Timestamp getOrderedOn() {
		return orderedOn;
	}

	public void setOrderedOn(Timestamp orderedOn) {
		this.orderedOn = orderedOn;
	}

	public Timestamp getDeliveredOn() {
		return deliveredOn;
	}

	public void setDeliveredOn(Timestamp deliveredOn) {
		this.deliveredOn = deliveredOn;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Float getTaxes() {
		return taxes;
	}

	public void setTaxes(Float taxes) {
		this.taxes = taxes;
	}

	public Integer getDeliveryCharges() {
		return deliveryCharges;
	}

	public void setDeliveryCharges(Integer deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public Float getDiscounts() {
		return discounts;
	}

	public void setDiscounts(Float discounts) {
		this.discounts = discounts;
	}

	public Float getBilledAmount() {
		return billedAmount;
	}

	public void setBilledAmount(Float billedAmount) {
		this.billedAmount = billedAmount;
	}

	public RestarauntOrderDTO getRestaraunt() {
		return restaraunt;
	}

	public void setRestaraunt(RestarauntOrderDTO restaraunt) {
		this.restaraunt = restaraunt;
	}

	public CustomerAddressDTO getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddressDTO customerAddress) {
		this.customerAddress = customerAddress;
	}

	public CustomerReviewDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerReviewDTO customer) {
		this.customer = customer;
	}

	public List<OrderHasItemsDTO> getOrderHasItems() {
		return orderHasItems;
	}

	public void setOrderHasItems(List<OrderHasItemsDTO> orderHasItems) {
		this.orderHasItems = orderHasItems;
	}

}
