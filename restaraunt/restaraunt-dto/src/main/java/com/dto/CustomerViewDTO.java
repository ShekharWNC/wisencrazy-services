package com.dto;


public class CustomerViewDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4777437647553835036L;
	private String directoryCategory;
	private String name;
    private String emailId;
    private String title;
    private String phone;
    private String photoUrl;
    private String companySid;
    private String href;
    private String role;
    
    
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDirectoryCategory() {
		return directoryCategory;
	}
	public void setDirectoryCategory(String directoryCategory) {
		this.directoryCategory = directoryCategory;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
		
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
    
}
