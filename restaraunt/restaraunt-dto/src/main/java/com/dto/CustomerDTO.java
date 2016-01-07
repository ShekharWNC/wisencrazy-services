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
	
	/*
	 * Agent virtual account sid
	 */
	private String virtualAccountSid;

	private CustomerBusinessCommonDTO customerBusiness;

	private DepartmentDTO department;
	
	private SignupType signupType;

	private List<CustomerHasAddressDTO> customerHasAddresses;

	private List<CustomerHasContactDTO> customerHasContacts;

	private List<CustomerHasSocialNetworkDTO> customerHasSocialNetworks;
	
	private List<CustomerBusinessDTO> customerAccounts;
	
	private List<CompanyCommonDTO> customerAssociateCompanies;

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

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public CustomerBusinessCommonDTO getCustomerBusiness() {
		return this.customerBusiness;
	}

	public void setCustomerBusiness(CustomerBusinessCommonDTO customerBusiness) {
		this.customerBusiness = customerBusiness;
	}

	public DepartmentDTO getDepartment() {
		return this.department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public List<CustomerHasAddressDTO> getCustomerHasAddresses() {
		return this.customerHasAddresses;
	}

	public void setCustomerHasAddresses(List<CustomerHasAddressDTO> customerHasAddresses) {
		this.customerHasAddresses = customerHasAddresses;
	}

	public List<CustomerHasContactDTO> getCustomerHasContacts() {
		return this.customerHasContacts;
	}

	public void setCustomerHasContacts(List<CustomerHasContactDTO> customerHasContacts) {
		this.customerHasContacts = customerHasContacts;
	}

	public List<CustomerHasSocialNetworkDTO> getCustomerHasSocialNetworks() {
		return this.customerHasSocialNetworks;
	}

	public void setCustomerHasSocialNetworks(List<CustomerHasSocialNetworkDTO> customerHasSocialNetworks) {
		this.customerHasSocialNetworks = customerHasSocialNetworks;
	}

	public List<CustomerBusinessDTO> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(List<CustomerBusinessDTO> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	public List<CompanyCommonDTO> getCustomerAssociateCompanies() {
		return customerAssociateCompanies;
	}

	public void setCustomerAssociateCompanies(
			List<CompanyCommonDTO> customerAssociateCompanies) {
		this.customerAssociateCompanies = customerAssociateCompanies;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}
}