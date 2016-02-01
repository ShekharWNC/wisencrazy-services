package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the customer_has_address database table.
 * 
 */
@Entity
@Table(name="customer_has_address")
@NamedQueries({
	@NamedQuery(name=CustomerHasAddress.FIND_BY_CUSTOMER_SID,query="select cha from CustomerHasAddress cha where hex(cha.customer.sid)=:sid")
})
public class CustomerHasAddress extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;
	
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.CustomerHasAddress.";
	public static final String FIND_BY_CUSTOMER_SID=PREFIX+"findByCustomerSid";
	
	@ManyToOne(cascade = {CascadeType.REMOVE})
	@JoinColumn(name="customer_address_id")
	private CustomerAddress customerAddress;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@Column(name="customer_address_id")
	private Integer customerAddressId;
	
	@Column(name="customer_id")
	private Integer customerId;
	

	public CustomerHasAddress() {
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(Integer customerAddressId) {
		this.customerAddressId = customerAddressId;
	}
	
}