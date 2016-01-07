package com.dto;
import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyProfileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String version;
	private String companySid;
	private String userSid;
	private String department;
	private String companyName;
	private String primaryContacts;
    private String title;
    private String emailId;
    private String facebookUrl;
    private String twitterUrl;
    private String linkedinUrl;
    private String memberSince;
    private String website;
    private List<CompanyHasAddressDTO> userHasAddressList;
    private List<CompanyContactDTO> userConatactDTOList;
	public String getVersion() {
		return version;
	}
	public String getCompanySid() {
		return companySid;
	}
	public String getUserSid() {
		return userSid;
	}
	public String getDepartment() {
		return department;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getPrimaryContacts() {
		return primaryContacts;
	}
	public String getTitle() {
		return title;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getFacebookUrl() {
		return facebookUrl;
	}
	public String getTwitterUrl() {
		return twitterUrl;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public String getMemberSince() {
		return memberSince;
	}
	public String getWebsite() {
		return website;
	}
	public List<CompanyHasAddressDTO> getUserHasAddressList() {
		return userHasAddressList;
	}
	public List<CompanyContactDTO> getUserConatactDTOList() {
		return userConatactDTOList;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setPrimaryContacts(String primaryContacts) {
		this.primaryContacts = primaryContacts;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}
	public void setTwitterUrl(String twitterUrl) {
		this.twitterUrl = twitterUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setUserHasAddressList(List<CompanyHasAddressDTO> userHasAddressList) {
		this.userHasAddressList = userHasAddressList;
	}
	public void setUserConatactDTOList(List<CompanyContactDTO> userConatactDTOList) {
		this.userConatactDTOList = userConatactDTOList;
	}
    
}
