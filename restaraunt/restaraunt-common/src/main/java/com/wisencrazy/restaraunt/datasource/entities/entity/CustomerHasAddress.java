package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the customer_has_address database table.
 * 
 */
@Entity
@Table(name="customer_has_address")
public class CustomerHasAddress implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6846576122653261388L;
	@EmbeddedId
	private
	CustomerHasAddressPK addressPK;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customer_address_id", referencedColumnName = "id", insertable = false, updatable = false)
	private CustomerAddress customerAddress;
	
	public CustomerHasAddress() {
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public CustomerHasAddressPK getAddressPK() {
		return addressPK;
	}

	public void setAddressPK(CustomerHasAddressPK addressPK) {
		this.addressPK = addressPK;
	}

}