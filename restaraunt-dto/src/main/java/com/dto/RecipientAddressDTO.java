package com.dto;

import java.io.Serializable;

/**
 * 
 * @author vikash Pandey
 *
 */
public class RecipientAddressDTO implements Serializable{
	
	private static final long serialVersionUID = -6394933957132596857L;
	private String email;
	private String name;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
