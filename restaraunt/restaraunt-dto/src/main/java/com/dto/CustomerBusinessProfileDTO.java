package com.dto;

import java.util.List;

public class CustomerBusinessProfileDTO extends AbsCommonDTO {
	
	private static final long serialVersionUID = 1L;
	
	private String version;
	
	private DepartmentDTO department;
	
	private CompanyDTO company;

	private String contactEmailId;

	private String keyword;

	private String overview;

	private String serviceDescription;

	private String tagline;

	private String website;

	private List<CustomerBusinessProfileHasPrimaryContactDTO> customerBusinessProfileHasPrimaryContact;
	
//	private AppuserDTO appuser;
	
//	private String filePath;
	
	private AttachmentCommonDTO attachment;


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public String getContactEmailId() {
		return contactEmailId;
	}

	public void setContactEmailId(String contactEmailId) {
		this.contactEmailId = contactEmailId;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<CustomerBusinessProfileHasPrimaryContactDTO> getCustomerBusinessProfileHasPrimaryContact() {
		return customerBusinessProfileHasPrimaryContact;
	}

	public void setCustomerBusinessProfileHasPrimaryContact(
			List<CustomerBusinessProfileHasPrimaryContactDTO> customerBusinessProfileHasPrimaryContact) {
		this.customerBusinessProfileHasPrimaryContact = customerBusinessProfileHasPrimaryContact;
	}

	/*public AppuserDTO getAppuser() {
		return appuser;
	}

	public void setAppuser(AppuserDTO appuser) {
		this.appuser = appuser;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}*/

	public AttachmentCommonDTO getAttachment() {
		return attachment;
	}

	public void setAttachment(AttachmentCommonDTO attachment) {
		this.attachment = attachment;
	}
}
