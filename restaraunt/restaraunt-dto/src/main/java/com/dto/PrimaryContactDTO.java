package com.dto;

public class PrimaryContactDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String primaryContact;
	
	private String emailId;

	public PrimaryContactDTO() {
		super();
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
