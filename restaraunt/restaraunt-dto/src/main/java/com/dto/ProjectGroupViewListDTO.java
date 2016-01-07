package com.dto;
import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectGroupViewListDTO extends AbsCommonDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String directoryCategory;
	private String emailId;
	private String firstName;
	private String lastName;
	private String virtualAccountSid;
	private String companySid;
	private String projectName;
	private String projectSid;
	private String projectGroupName;
	private String projectGroupSid;
	private String phone;
	private String photoUrl;
	private String role;
	private String href;
	
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
	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}
	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	public String getProjectGroupName() {
		return projectGroupName;
	}
	public void setProjectGroupName(String projectGroupName) {
		this.projectGroupName = projectGroupName;
	}
	public String getProjectGroupSid() {
		return projectGroupSid;
	}
	public void setProjectGroupSid(String projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
