package com.dto;

import java.sql.Timestamp;

import com.dto.constants.EnumConstants.SignupType;

public class CustomerSignupDTO extends CommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5645754406097646890L;

	public enum CustomerAccountStatus{
		ACTIVE, IN_ACTIVE, SYSTEM_GENERATED, DISABLE
	}
	
	
	private String email;
	
	private String password;
	
	private boolean passwordReset;
	private String primaryContact;
	
	
	private CustomerAccountStatus accountStatus;
	
	private String activationToken;
	
	private Timestamp activationTokenExpireOn;
	
	private String activateUrl;
	
	private String companySid;
	
	private String accessToken;
	
	public SignupType signupType;
	
	private String virtualAccountSid;
	
	private String agentEmailId;
	
	public boolean isShow;
	
	private String location;
	
	private String featureName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getPasswordReset() {
		return passwordReset;
	}

	public void setPasswordReset(boolean passwordReset) {
		this.passwordReset = passwordReset;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public CustomerAccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(CustomerAccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getActivationToken() {
		return activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public Timestamp getActivationTokenExpireOn() {
		return activationTokenExpireOn;
	}

	public void setActivationTokenExpireOn(Timestamp activationTokenExpireOn) {
		this.activationTokenExpireOn = activationTokenExpireOn;
	}
    
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActivateUrl() {
		return activateUrl;
	}

	public void setActivateUrl(String activateUrl) {
		this.activateUrl = activateUrl;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getAgentEmailId() {
		return agentEmailId;
	}

	public void setAgentEmailId(String agentEmailId) {
		this.agentEmailId = agentEmailId;
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

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

}
