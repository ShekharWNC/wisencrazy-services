package com.dto;

public class RestarauntOrderDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1229740717330867405L;

	private String name;
	
	private String primaryContact;
	
	private String address;
	
	private String pin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
