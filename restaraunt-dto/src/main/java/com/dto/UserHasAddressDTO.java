package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_address database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasAddressDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Address
	private AddressDTO address;

	//bi-directional many-to-one association to AddressType
	private AddressTypeDTO addressType;

	//bi-directional many-to-one association to User
	private AppuserDTO user;
	
	private Boolean status;

	public UserHasAddressDTO() {
	}

	public UserHasAddressDTO(AddressDTO address, AddressTypeDTO addressType,
			AppuserDTO user) {
		super();
		this.address = address;
		this.addressType = addressType;
		this.user = user;
	}
	public AddressDTO getAddress() {
		return this.address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public AddressTypeDTO getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressTypeDTO addressType) {
		this.addressType = addressType;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}