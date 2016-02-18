package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;

@Embeddable
public class CustomerHasAddressPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3553049103013958476L;

	@Basic(optional=false)
	@NotNull
	@Column(name="customer_address_id")
	private int addressId;
	

	public CustomerHasAddressPK(Integer addressId) {
		this.addressId=addressId;
	}
	
	public CustomerHasAddressPK() {
		// TODO Auto-generated constructor stub
	}


	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	
}
