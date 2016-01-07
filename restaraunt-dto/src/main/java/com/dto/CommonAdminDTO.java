
package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.constants.EnumConstants.SignupType;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CommonAdminDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String emailId;
	
	private String phoneNumber;
	
	private String companyName;
	
	private String password;
	
	private String displayName;
	
	private String website;
	
	private String packageSid;
	
	private String packageName;
	
	private String licenceType;
	
	private CountryDTO country;
	
	private VirtualAccountDTO virtualAccountDTO;
	
	private ProjectDTO projectDTO;
	
	private String activateUrl;
	
	private String adminSid;
	
	private String role;
	
	private SignupType signupType;
	
	private boolean mailVerification;
	
	private boolean isShow;
	
	private String longitude;
	private String latitude;
	private String location;
	private String categorySid;
	
	private String header;
	
	private String footer;
	private List<String> associateCompanies;
	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public VirtualAccountDTO getVirtualAccountDTO() {
		return virtualAccountDTO;
	}

	public void setVirtualAccountDTO(VirtualAccountDTO virtualAccountDTO) {
		this.virtualAccountDTO = virtualAccountDTO;
	}

	public ProjectDTO getProjectDTO() {
		return projectDTO;
	}

	public void setProjectDTO(ProjectDTO projectDTO) {
		this.projectDTO = projectDTO;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public String getActivateUrl() {
		return activateUrl;
	}

	public void setActivateUrl(String activateUrl) {
		this.activateUrl = activateUrl;
	}

	public String getPackageSid() {
		return packageSid;
	}

	public void setPackageSid(String packageSid) {
		this.packageSid = packageSid;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getLicenceType() {
		return licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	public String getAdminSid() {
		return adminSid;
	}

	public void setAdminSid(String adminSid) {
		this.adminSid = adminSid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isMailVerification() {
		return mailVerification;
	}

	public void setMailVerification(boolean mailVerification) {
		this.mailVerification = mailVerification;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	public boolean getIsShow() {
		return isShow;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategorySid() {
		return categorySid;
	}

	public void setCategorySid(String categorySid) {
		this.categorySid = categorySid;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}
	
	public List<String> getAssociateCompanies() {
		return associateCompanies;
	}

	public void setAssociateCompanies(List<String> associateCompanies) {
		this.associateCompanies = associateCompanies;
	}
}
