package com.dto;

import java.util.List;

import com.dto.constants.EnumConstants.SignupType;

public class CustomerDTO extends CustomerSignupDTO {
	private static final long serialVersionUID = 1L;
	
	public enum CustomerType{
		INDIVIDUAL, GROUP
	}

	private CompanyDTO associatedCompany;

	private AttachmentCommonDTO photo;

	private String title;
	
	private CustomerType customerType;
	private String location;
	
	private List<String> customerGroupSids;
	
	private SignupType signupType;

	private List<CustomerHasAddressDTO> customerHasAddresses;


	public CustomerDTO() {
	}

	public CompanyDTO getAssociatedCompany() {
		return this.associatedCompany;
	}

	public void setAssociatedCompany(CompanyDTO associatedCompany) {
		this.associatedCompany = associatedCompany;
	}

	public AttachmentCommonDTO getPhoto() {
		return this.photo;
	}
    
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPhoto(AttachmentCommonDTO photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	
	public List<String> getCustomerGroupSids() {
		return customerGroupSids;
	}

	public void setCustomerGroupSids(List<String> customerGroupSids) {
		this.customerGroupSids = customerGroupSids;
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
}