package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The Data Transfer class for the Address entity.
 * @author eServerTeam
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AddressDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String addressLine1;

	private String addressLine2;

	private String addressLine3;

	private Boolean isActive;

	private String pin;

	//bi-directional many-to-one association to Country
	private CountryDTO country;

	//bi-directional many-to-one association to State
	private StateDTO state;
	
	private String addressDetails;

	//bi-directional many-to-one association to CompanyHasAddress
	private List<CompanyHasAddressDTO> companyHasAddresses;

	//bi-directional many-to-one association to UserHasAddress
	private List<UserHasAddressDTO> userHasAddresses;

	public AddressDTO() {
	}

	
	public AddressDTO(String addressLine1, String addressLine2,
			String addressLine3, Boolean isActive, String pin, CountryDTO country,
			StateDTO state, List<CompanyHasAddressDTO> companyHasAddresses,
			List<UserHasAddressDTO> userHasAddresses) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.isActive = isActive;
		this.pin = pin;
		this.country = country;
		this.state = state;
		this.companyHasAddresses = companyHasAddresses;
		this.userHasAddresses = userHasAddresses;
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

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public CountryDTO getCountry() {
		return this.country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public StateDTO getState() {
		return this.state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}

	public List<CompanyHasAddressDTO> getCompanyHasAddresses() {
		return this.companyHasAddresses;
	}

	public void setCompanyHasAddresses(List<CompanyHasAddressDTO> companyHasAddresses) {
		this.companyHasAddresses = companyHasAddresses;
	}

	public CompanyHasAddressDTO addCompanyHasAddress(CompanyHasAddressDTO companyHasAddress) {
		getCompanyHasAddresses().add(companyHasAddress);
		companyHasAddress.setAddress(this);

		return companyHasAddress;
	}

	public CompanyHasAddressDTO removeCompanyHasAddress(CompanyHasAddressDTO companyHasAddress) {
		getCompanyHasAddresses().remove(companyHasAddress);
		companyHasAddress.setAddress(null);

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
		userHasAddress.setAddress(this);

		return userHasAddress;
	}

	public UserHasAddressDTO removeUserHasAddress(UserHasAddressDTO userHasAddress) {
		getUserHasAddresses().remove(userHasAddress);
		userHasAddress.setAddress(null);

		return userHasAddress;
	}


	@Override
	public String toString() {
		return "AddressDTO [addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", addressLine3=" + addressLine3
				+ ", isActive=" + isActive + ", pin=" + pin + ", country="
				+ country + ", state=" + state + ", companyHasAddresses="
				+ companyHasAddresses + ", userHasAddresses="
				+ userHasAddresses + "]";
	}


	public String getAddressDetails() {
		return addressDetails;
	}


	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	

}