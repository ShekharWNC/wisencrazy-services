package com.dto;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
// TODO: Auto-generated Javadoc
/**
 * The Class DirectoryListDTO.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DirectoryListDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   private String directoryCategory;
	   private String firstName;
	   private String lastName;
	   private String emailId;
	   private String phone;
	   private String photoUrl;
	   private String companySid;
	   private String virtualAccountSid;
	   private String companyGroupSid;
	   private String companyGroupName;
	   private String role;
	   private String href;
	  
	   
	public String getCompanyGroupSid() {
		return companyGroupSid;
	}
	public void setCompanyGroupSid(String companyGroupSid) {
		this.companyGroupSid = companyGroupSid;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}
	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}
		public String getCompanyGroupName() {
		return companyGroupName;
	}
	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}