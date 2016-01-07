package com.dto;

import java.io.Serializable;


public class AllCompanyInfoViewDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2623470277077858758L;

	private Integer activeUsers;

	private String appuserSid;

	private String companyContact;

	private String companyEmail;

	private String companyRole;
	
	private String companyStatus;

	private String companySid;

	private String emailId;

	private String firstName;
	
	private String lastName;

	private Integer inactiveUsers;

	private String joinDate;

	private String licenceName;
	
	private String expiration;

	private String name;

	private String primaryContact;

	private String virtualAccountSid;
	
	private String lastAccessed;

	public Integer getActiveUsers() {
		return activeUsers;
	}

	public void setActiveUsers(Integer activeUsers) {
		this.activeUsers = activeUsers;
	}

	public String getAppuserSid() {
		return appuserSid;
	}

	public void setAppuserSid(String appuserSid) {
		this.appuserSid = appuserSid;
	}

	public String getCompanyContact() {
		return companyContact;
	}

	public void setCompanyContact(String companyContact) {
		this.companyContact = companyContact;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyRole() {
		return companyRole;
	}

	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getInactiveUsers() {
		return inactiveUsers;
	}

	public void setInactiveUsers(Integer inactiveUsers) {
		this.inactiveUsers = inactiveUsers;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLicenceName() {
		return licenceName;
	}

	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getLastAccessed() {
		return lastAccessed;
	}

	public void setLastAccessed(String lastAccessed) {
		this.lastAccessed = lastAccessed;
	}
	
}
