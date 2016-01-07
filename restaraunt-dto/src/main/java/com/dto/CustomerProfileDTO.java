package com.dto;


public class CustomerProfileDTO extends AbsCommonDTO {
	
	private static final long serialVersionUID = 1L;
	private String version;
	private String title;
	private DepartmentDTO department;
	private CompanyDTO company;
	private AppuserDTO appuser;
	private AttachmentCommonDTO attachment;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public AppuserDTO getAppuser() {
		return appuser;
	}
	public void setAppuser(AppuserDTO appuser) {
		this.appuser = appuser;
	}
	public AttachmentCommonDTO getAttachment() {
		return attachment;
	}
	public void setAttachment(AttachmentCommonDTO attachment) {
		this.attachment = attachment;
	}
}
