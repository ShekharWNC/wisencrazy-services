package com.google.dto;

import java.io.Serializable;

public class LoginDetailsDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4232108559647103161L;
	
	public enum LoginType{
		USER, CUSTOMER
	}

	private String username;
	
	private String password;
	
	private String browser;
	
	private String host;
	
	private String token;
	
	private LoginType loginType;
	
	private Object registrationDAO;
	
	public LoginDetailsDTO() {
		super();
	}
	
	public LoginDetailsDTO(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LoginType getLoginType() {
		return loginType;
	}

	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}

	public Object getRegistrationDAO() {
		return registrationDAO;
	}

	public void setRegistrationDAO(Object registrationDAO) {
		this.registrationDAO = registrationDAO;
	}
}
