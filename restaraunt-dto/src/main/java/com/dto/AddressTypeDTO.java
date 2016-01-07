package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the address_type database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AddressTypeDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String addressType;

	//bi-directional many-to-one association to CompanyHasAddress
	private List<CompanyHasAddressDTO> companyHasAddresses;

	//bi-directional many-to-one association to UserHasAddress
	private List<UserHasAddressDTO> userHasAddresses;

	public AddressTypeDTO() {
	}

	
	public AddressTypeDTO(String addressType,
			List<CompanyHasAddressDTO> companyHasAddresses,
			List<UserHasAddressDTO> userHasAddresses) {
		super();
		this.addressType = addressType;
		this.companyHasAddresses = companyHasAddresses;
		this.userHasAddresses = userHasAddresses;
	}
	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public List<CompanyHasAddressDTO> getCompanyHasAddresses() {
		return this.companyHasAddresses;
	}

	public void setCompanyHasAddresses(List<CompanyHasAddressDTO> companyHasAddresses) {
		this.companyHasAddresses = companyHasAddresses;
	}

	public CompanyHasAddressDTO addCompanyHasAddress(CompanyHasAddressDTO companyHasAddress) {
		getCompanyHasAddresses().add(companyHasAddress);
		companyHasAddress.setAddressType(this);

		return companyHasAddress;
	}

	public CompanyHasAddressDTO removeCompanyHasAddress(CompanyHasAddressDTO companyHasAddress) {
		getCompanyHasAddresses().remove(companyHasAddress);
		companyHasAddress.setAddressType(null);

		return companyHasAddress;
	}

	public List<UserHasAddressDTO> getUserHasAddresses() {
		return this.userHasAddresses;
	}

	public void setUserHasAddresses(List<UserHasAddressDTO> userHasAddresses) {
		this.userHasAddresses = userHasAddresses;
	}

	public UserHasAddressDTO addUserHasAddress(UserHasAddressDTO userHasAddress) {
		getUserHasAddresses().add(userHasAddress);
		userHasAddress.setAddressType(this);

		return userHasAddress;
	}

	public UserHasAddressDTO removeUserHasAddress(UserHasAddressDTO userHasAddress) {
		getUserHasAddresses().remove(userHasAddress);
		userHasAddress.setAddressType(null);

		return userHasAddress;
	}


	@Override
	public String toString() {
		return "AddressTypeDTO [addressType=" + addressType
				+ ", companyHasAddresses=" + companyHasAddresses
				+ ", userHasAddresses=" + userHasAddresses + "]";
	}


}