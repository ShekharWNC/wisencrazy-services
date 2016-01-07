package com.dto;

import javax.persistence.Column;

public class CustomerBusinessHasContactDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	@Column(name="conatact_type")
	private String conatactType;

	@Column(name="contact_number")
	private String contactNumber;

	public CustomerBusinessHasContactDTO() {
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