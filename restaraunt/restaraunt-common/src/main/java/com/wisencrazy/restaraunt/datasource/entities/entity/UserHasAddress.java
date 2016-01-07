package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_address database table.
 * 
 */
@Entity
@Table(name="user_has_address")
public class UserHasAddress extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private byte status;

	//bi-directional many-to-one association to Address
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "address_id")
	private Address address;

	//bi-directional many-to-one association to AddressType
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="address_type_id")
	private AddressType addressType;

	//bi-directional many-to-one association to Appuser
	/*@ManyToOne
	@JoinColumn(name="user_id")
	private Appuser appuser;*/

	public UserHasAddress() {
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	/*public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}*/

}