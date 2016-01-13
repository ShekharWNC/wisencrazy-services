package com.dto;

import java.util.List;

import com.dto.constants.EnumConstants.SignupType;

public class CustomerDTO extends CustomerSignupDTO {
	private static final long serialVersionUID = 1L;
	
	public enum CustomerType{
		INDIVIDUAL, GROUP
	}


	private CustomerType customerType;

	private String location;
	
	private SignupType signupType;

	private List<CustomerHasAddressDTO> customerHasAddresses;
	
	private String photoUrl;

	public CustomerDTO() {
	}

    
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	


	public List<CustomerHasAddressDTO> getCustomerHasAddresses() {
		return this.customerHasAddresses;
	}

	public void setCustomerHasAddresses(List<CustomerHasAddressDTO> customerHasAddresses) {
		this.customerHasAddresses = customerHasAddresses;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}


	public String getPhotoUrl() {
		return photoUrl;
	}


	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}