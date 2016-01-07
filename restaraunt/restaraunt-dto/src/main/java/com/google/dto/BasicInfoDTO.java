package com.google.dto;

import java.io.Serializable;

public class BasicInfoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4944417747628254480L;

	private String familyName;
	
	private String givenName;

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
}
