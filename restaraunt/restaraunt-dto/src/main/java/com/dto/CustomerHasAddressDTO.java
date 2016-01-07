package com.dto;


public class CustomerHasAddressDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private CustomerAddressDTO customerAddress;

	public CustomerHasAddressDTO() {
	}

	public CustomerAddressDTO getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddressDTO customerAddress) {
		this.customerAddress = customerAddress;
	}
}