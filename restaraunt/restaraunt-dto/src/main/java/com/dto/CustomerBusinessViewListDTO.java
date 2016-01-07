package com.dto;
public class CustomerBusinessViewListDTO extends CommonDTO {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String DirectoryCategory;
	 private String displayName;
	 private String companySid;
	 private String phone;
	 private String photoUrl;
	 private String title;
	 private String emailId;
	 private String href;
	 private String role;
	public String getDirectoryCategory() {
		return DirectoryCategory;
	}
	public void setDirectoryCategory(String directoryCategory) {
		DirectoryCategory = directoryCategory;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
}
