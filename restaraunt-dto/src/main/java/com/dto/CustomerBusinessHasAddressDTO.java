package com.dto;


public class CustomerBusinessHasAddressDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private CustomerAddressDTO customerAddress;

	public CustomerBusinessHasAddressDTO() {
	}

	public CustomerAddressDTO getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(CustomerAddressDTO customerAddress) {
		this.customerAddress = customerAddress;
	}
}