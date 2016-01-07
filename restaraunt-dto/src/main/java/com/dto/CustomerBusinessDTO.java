package com.dto;

import java.util.List;

public class CustomerBusinessDTO extends CustomerBusinessCommonDTO {
	private static final long serialVersionUID = 1L;

	private CompanyDTO associatedCompany;

	private AttachmentCommonDTO photo;

	private String primaryContact;

	private String title;
	
	private String email;
	
	private CustomerCommonDTO customerPrimaryContact;

	private DepartmentDTO department;
	
	private IndustryTypeDTO industryType;

	private List<CustomerBusinessHasAddressDTO> customerBusinessHasAddresses;

	private List<CustomerBusinessHasContactDTO> customerBusinessHasContacts;

	private List<CustomerBusinessHasSocialNetworkDTO> customerBusinessHasSocialNetworks;

	public CustomerBusinessDTO() {
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

	public void setPhoto(AttachmentCommonDTO photo) {
		this.photo = photo;
	}

	public String getPrimaryContact() {
		return this.primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CustomerCommonDTO getCustomerPrimaryContact() {
		return customerPrimaryContact;
	}

	public void setCustomerPrimaryContact(CustomerCommonDTO customerPrimaryContact) {
		this.customerPrimaryContact = customerPrimaryContact;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public IndustryTypeDTO getIndustryType() {
		return industryType;
	}

	public void setIndustryType(IndustryTypeDTO industryType) {
		this.industryType = industryType;
	}

	public List<CustomerBusinessHasAddressDTO> getCustomerBusinessHasAddresses() {
		return this.customerBusinessHasAddresses;
	}

	public void setCustomerBusinessHasAddresses(List<CustomerBusinessHasAddressDTO> customerBusinessHasAddresses) {
		this.customerBusinessHasAddresses = customerBusinessHasAddresses;
	}

	public List<CustomerBusinessHasContactDTO> getCustomerBusinessHasContacts() {
		return this.customerBusinessHasContacts;
	}

	public void setCustomerBusinessHasContacts(List<CustomerBusinessHasContactDTO> customerBusinessHasContacts) {
		this.customerBusinessHasContacts = customerBusinessHasContacts;
	}

	public List<CustomerBusinessHasSocialNetworkDTO> getCustomerBusinessHasSocialNetworks() {
		return this.customerBusinessHasSocialNetworks;
	}

	public void setCustomerBusinessHasSocialNetworks(List<CustomerBusinessHasSocialNetworkDTO> customerBusinessHasSocialNetworks) {
		this.customerBusinessHasSocialNetworks = customerBusinessHasSocialNetworks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}