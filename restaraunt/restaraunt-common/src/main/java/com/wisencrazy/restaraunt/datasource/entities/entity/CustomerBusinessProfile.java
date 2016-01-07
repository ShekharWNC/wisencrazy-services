package com.wisencrazy.restaraunt.datasource.entities.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the customer_business_profile database table.
 * 
 */
@Entity
@Table(name="customer_business_profile")
public class CustomerBusinessProfile extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="company_id")
	private Company company;

	@Column(name="contact_email_information")
	private String contactEmailId;

	private String keyword;

	private String overview;

	@Column(name="service_description")
	private String serviceDescription;

	private String tagline;

	private String website;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="customer_business_profile_id")
	private List<CustomerBusinessProfileHasPrimaryContact> customerBusinessProfileHasPrimaryContact;
	
	@ManyToOne
	@JoinColumn(name = "appuser_id", nullable = false)
	private Appuser appuser;

	public CustomerBusinessProfile() {
	}
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getContactEmailId() {
		return this.contactEmailId;
	}

	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getOverview() {
		return this.overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getTagline() {
		return this.tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<CustomerBusinessProfileHasPrimaryContact> getCustomerBusinessProfileHasPrimaryContact() {
		return this.customerBusinessProfileHasPrimaryContact;
	}

	public void setCustomerBusinessProfileHasPrimaryContact(List<CustomerBusinessProfileHasPrimaryContact> customerBusinessProfileHasPrimaryContact) {
		this.customerBusinessProfileHasPrimaryContact = customerBusinessProfileHasPrimaryContact;
	}

	public Appuser getAppuser() {
		return appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

}
