package com.dto;


public class CustomerHasContactDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String conatactType;

	private String contactNumber;

	public CustomerHasContactDTO() {
	}

	public String getConatactType() {
		return this.conatactType;
	}

	public void setConatactType(String conatactType) {
		this.conatactType = conatactType;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}