package com.dto;

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
	
	private String primaryContact;

	private String accessToken;
	
	public SignupType signupType;
	
	public boolean isShow;
	
	private String location;

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


	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

    
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
