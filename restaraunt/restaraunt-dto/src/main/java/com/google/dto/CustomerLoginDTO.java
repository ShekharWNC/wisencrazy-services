package com.google.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.constants.EnumConstants.GoogleConstants;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerLoginDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String emailId;
	
	private String password;
	
	private GoogleConstants extension;
	
	private String accessToken;
	
	private String token;
	
	private String deviceId;
	
	private String deviceType;
	
	private String mobileId;
	
	private String deviceName;
	
	private String primaryContact;
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public GoogleConstants getExtension() {
		return extension;
	}

	public void setExtension(GoogleConstants extension) {
		this.extension = extension;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	
}
