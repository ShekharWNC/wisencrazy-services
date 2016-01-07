package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the company_has_address database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyHasAddressDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Address
	private AddressDTO address;

	//bi-directional many-to-one association to AddressType
	private AddressTypeDTO addressType;

	//bi-directional many-to-one association to Company
	private CompanyDTO company;

	public CompanyHasAddressDTO() {
	}


	public CompanyHasAddressDTO(AddressDTO address, AddressTypeDTO addressType,
			CompanyDTO company) {
		super();
		this.address = address;
		this.addressType = addressType;
		this.company = company;
	}
	public AddressDTO getAddress() {
		return this.address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public AddressTypeDTO getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressTypeDTO addressType) {
		this.addressType = addressType;
	}

	public CompanyDTO getCompany() {
		return this.company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "CompanyHasAddressDTO [address=" + address + ", addressType="
				+ addressType + ", company=" + company + "]";
	}

}