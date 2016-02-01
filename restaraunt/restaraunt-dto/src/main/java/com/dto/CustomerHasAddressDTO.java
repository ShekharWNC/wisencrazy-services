package com.dto;


public class CustomerHasAddressDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private CustomerAddressDTO customerAddress;
	
	private String customerSid;

	public CustomerHasAddressDTO() {
	}

	public CustomerAddressDTO getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddressDTO customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}
}