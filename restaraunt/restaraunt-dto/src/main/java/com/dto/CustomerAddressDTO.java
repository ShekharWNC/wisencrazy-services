package com.dto;

public class CustomerAddressDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String addressLine1;

	private String addressLine2;

	private String addressLine3;

	private CountryDTO country;

	private String pin;

	private StateDTO state;

	public CustomerAddressDTO() {
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public CountryDTO getCountry() {
		return this.country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public StateDTO getState() {
		return this.state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}
}