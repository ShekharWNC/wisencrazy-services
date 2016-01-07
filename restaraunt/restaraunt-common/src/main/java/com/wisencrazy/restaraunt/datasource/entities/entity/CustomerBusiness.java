package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the customer_business database table.
 * 
 */
@Entity
@Table(name="customer_business")
public class CustomerBusiness extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="associated_company_id")
	private Company associatedCompany;

	@Column(name="email_id")
	private String email;

	@Column(name = "account_name")
	private String accountName;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="photo_id")
	private Attachment photo;

	@Column(name="primary_contact")
	private String primaryContact;

	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_primary_contact_id", referencedColumnName = "id")
	private Customer customerPrimaryContact;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="customer_department_id",referencedColumnName="id")
	private Department department;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "customer_industry_id", referencedColumnName = "id")
	private IndustryType industryType;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "customer_business_id", referencedColumnName = "id", nullable = false)
	private List<CustomerBusinessHasAddress> customerBusinessHasAddresses;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "customer_business_id", referencedColumnName = "id", nullable = false)
	private List<CustomerBusinessHasContact> customerBusinessHasContacts;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "customer_business_id", referencedColumnName = "id", nullable = false)
	private List<CustomerBusinessHasSocialNetwork> customerBusinessHasSocialNetworks;

	public CustomerBusiness() {
	}

	public Company getAssociatedCompany() {
		return this.associatedCompany;
	}

	public void setAssociatedCompany(Company associatedCompany) {
		this.associatedCompany = associatedCompany;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Attachment getPhoto() {
		return this.photo;
	}

	public void setPhoto(Attachment photo) {
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

	public List<CustomerBusinessHasAddress> getCustomerBusinessHasAddresses() {
		return this.customerBusinessHasAddresses;
	}

	public void setCustomerBusinessHasAddresses(List<CustomerBusinessHasAddress> customerBusinessHasAddresses) {
		this.customerBusinessHasAddresses = customerBusinessHasAddresses;
	}

	public List<CustomerBusinessHasContact> getCustomerBusinessHasContacts() {
		return this.customerBusinessHasContacts;
	}

	public void setCustomerBusinessHasContacts(List<CustomerBusinessHasContact> customerBusinessHasContacts) {
		this.customerBusinessHasContacts = customerBusinessHasContacts;
	}

	public List<CustomerBusinessHasSocialNetwork> getCustomerBusinessHasSocialNetworks() {
		return this.customerBusinessHasSocialNetworks;
	}

	public void setCustomerBusinessHasSocialNetworks(List<CustomerBusinessHasSocialNetwork> customerBusinessHasSocialNetworks) {
		this.customerBusinessHasSocialNetworks = customerBusinessHasSocialNetworks;
	}

	public Customer getCustomerPrimaryContact() {
		return customerPrimaryContact;
	}

	public void setCustomerPrimaryContact(Customer customerPrimaryContact) {
		this.customerPrimaryContact = customerPrimaryContact;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public IndustryType getIndustryType() {
		return industryType;
	}

	public void setIndustryType(IndustryType industryType) {
		this.industryType = industryType;
	}
}