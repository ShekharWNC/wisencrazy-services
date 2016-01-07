package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the customer_business_has_address database table.
 * 
 */
@Entity
@Table(name="customer_business_has_address")
public class CustomerBusinessHasAddress extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="customer_address_id")
	private CustomerAddress customerAddress;

	public CustomerBusinessHasAddress() {
	}

	public CustomerAddress getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
}