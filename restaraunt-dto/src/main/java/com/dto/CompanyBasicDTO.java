package com.dto;

import java.sql.Timestamp;

public class CompanyBasicDTO extends CompanyCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String website;
	
	private String domainName;
	
	private String alternateEmailId;

	private String description;

	private String emailId;
	
	private String countrySid;
	
	private String companyStatus;
	
	private boolean setupStatus;
	
	private String companyLogoUrl;
	
	private String companyVerified;
	
	private String href;
	
	private CommonUserDTO createdBy;
	
	private CommonUserDTO updatedBy;
	
	private Boolean isActive;
	
	private Timestamp createdDate;
	
	private Timestamp updatedDate;

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getAlternateEmailId() {
		return alternateEmailId;
	}

	public void setAlternateEmailId(String alternateEmailId) {
		this.alternateEmailId = alternateEmailId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCompanyLogoUrl() {
		return companyLogoUrl;
	}

	public void setCompanyLogoUrl(String companyLogoUrl) {
		this.companyLogoUrl = companyLogoUrl;
	}

	public String getCompanyVerified() {
		return companyVerified;
	}

	public void setCompanyVerified(String companyVerified) {
		this.companyVerified = companyVerified;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public CommonUserDTO getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(CommonUserDTO createdBy) {
		this.createdBy = createdBy;
	}

	public CommonUserDTO getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(CommonUserDTO updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCountrySid() {
		return countrySid;
	}

	public void setCountrySid(String countrySid) {
		this.countrySid = countrySid;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public boolean isSetupStatus() {
		return setupStatus;
	}

	public void setSetupStatus(boolean setupStatus) {
		this.setupStatus = setupStatus;
	}
	
}
