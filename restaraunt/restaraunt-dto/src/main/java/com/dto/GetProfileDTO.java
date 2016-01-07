package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetProfileDTO  extends AbsCommonDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String version;
	
	private String photoUrl;
	
	private String department;
	
	private String companyName;
    
    private String firstName;
    
    private String lastName;
    
    private String title;
    
    private String emailId;
    
    private String facebookUrl;
    
    private String twitterUrl;
    
    private String linkedinUrl;
    
    private String onlineStatus;
    
    private String callWebLink;
    
    private String chatWebLink;
    
    private String messageWebLink;
    
    private String sendSmsLink;
    
    private String memberSince;
    private String stateName;
    
    private List<UserHasAddressDTO> userHasAddressList;
    
    private List<UserContactDTO> userConatactDTOList;
    
	public String getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}

	public String getVersion() {
		return version;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public String getDepartment() {
		return department;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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

	public String getOnlineStatus() {
		return onlineStatus;
	}

	public String getCallWebLink() {
		return callWebLink;
	}

	public String getChatWebLink() {
		return chatWebLink;
	}

	public String getMessageWebLink() {
		return messageWebLink;
	}

	public String getSendSmsLink() {
		return sendSmsLink;
	}

	public List<UserHasAddressDTO> getUserHasAddressList() {
		return userHasAddressList;
	}

	public List<UserContactDTO> getUserConatactDTOList() {
		return userConatactDTOList;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public void setCallWebLink(String callWebLink) {
		this.callWebLink = callWebLink;
	}

	public void setChatWebLink(String chatWebLink) {
		this.chatWebLink = chatWebLink;
	}

	public void setMessageWebLink(String messageWebLink) {
		this.messageWebLink = messageWebLink;
	}

	public void setSendSmsLink(String sendSmsLink) {
		this.sendSmsLink = sendSmsLink;
	}

	public void setUserHasAddressList(List<UserHasAddressDTO> userHasAddressList) {
		this.userHasAddressList = userHasAddressList;
	}

	public void setUserConatactDTOList(List<UserContactDTO> userConatactDTOList) {
		this.userConatactDTOList = userConatactDTOList;
	}
}
