package com.dto;

import com.dto.constants.EnumConstants.SignupType;


public class BasicInfoViewDTO extends AbsCommonDTO{
	private static final long serialVersionUID = 1L;

	private String companyName;

	private String companySid;
	
	private String companyId;

	private String virtualAccountSid;
	
	private String agentType;

	private String logoUrl;
	
	private String userSid;

	private String displayName;

	private String photoUrl;

	private String projectName;

	private String projectSid;

	private String emailId;
	
	private String userRoles;
	
	private String primaryContact;
	
	private String companyRole;
	
	private String projectEmail;
	
	private boolean setupStatus;

	private String sessionId;
	
	private SignupType signupType;
	
	private boolean isShow;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getAgentType() {
		return agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getUserSid() {
		return userSid;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getCompanyRole() {
		return companyRole;
	}

	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}

	public String getProjectEmail() {
		return projectEmail;
	}

	public void setProjectEmail(String projectEmail) {
		this.projectEmail = projectEmail;
	}

	public boolean isSetupStatus() {
		return setupStatus;
	}

	public void setSetupStatus(boolean setupStatus) {
		this.setupStatus = setupStatus;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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
}
