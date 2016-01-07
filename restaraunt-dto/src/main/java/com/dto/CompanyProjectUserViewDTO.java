package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyProjectUserViewDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6875850354452349766L;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String phone;
	    private String skills;
	    private String role;
	    private String companySid;
	    private String virtualSid;
	    private String projects;
	    private String directoryCategory;
	    private String href;
	    private String companyRole;
	    private String photoUrl;
	    private String mobile;
	    private String userType;
	    
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getSkills() {
			return skills;
		}
		public void setSkills(String skills) {
			this.skills = skills;
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
		public String getVirtualSid() {
			return virtualSid;
		}
		public void setVirtualSid(String virtualSid) {
			this.virtualSid = virtualSid;
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
		public String getCompanyRole() {
			return companyRole;
		}
		public void setCompanyRole(String companyRole) {
			this.companyRole = companyRole;
		}
		public String getProjects() {
			return projects;
		}
		public void setProjects(String projects) {
			this.projects = projects;
		}
		public String getPhotoUrl() {
			return photoUrl;
		}
		public void setPhotoUrl(String photoUrl) {
			this.photoUrl = photoUrl;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		
		
}
