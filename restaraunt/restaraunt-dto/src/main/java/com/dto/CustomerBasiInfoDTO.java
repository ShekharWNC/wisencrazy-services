package com.dto;

import java.io.Serializable;

public class CustomerBasiInfoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4460017405412457092L;

	private BasicInfoViewDTO appuser;
	
	private DirectoryCustomerViewDTO customer;
	
	

	public CustomerBasiInfoDTO() {
		super();
	}


	public CustomerBasiInfoDTO(BasicInfoViewDTO appuser) {
		super();
		this.appuser = appuser;
	}
	
	

	public CustomerBasiInfoDTO(DirectoryCustomerViewDTO customer) {
		super();
		this.customer = customer;
	}
	

	public CustomerBasiInfoDTO(BasicInfoViewDTO appuser,
			DirectoryCustomerViewDTO customer) {
		super();
		this.appuser = appuser;
		this.customer = customer;
	}



	public BasicInfoViewDTO getAppuser() {
		return appuser;
	}

	public void setAppuser(BasicInfoViewDTO appuser) {
		this.appuser = appuser;
	}

	public DirectoryCustomerViewDTO getCustomer() {
		return customer;
	}

	public void setCustomer(DirectoryCustomerViewDTO customer) {
		this.customer = customer;
	}
}
