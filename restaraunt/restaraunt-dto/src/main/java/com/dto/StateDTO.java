package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the state database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class StateDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String stateName;

	//bi-directional many-to-one association to Address
	private List<AddressDTO> addresses;

	//bi-directional many-to-one association to Country
	private CountryDTO country;

	public StateDTO() {
	}

	public StateDTO(String stateName, List<AddressDTO> addresses,
			CountryDTO country) {
		super();
		this.stateName = stateName;
		this.addresses = addresses;
		this.country = country;
	}
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<AddressDTO> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	public AddressDTO addAddress(AddressDTO address) {
		getAddresses().add(address);
		address.setState(this);

		return address;
	}

	public AddressDTO removeAddress(AddressDTO address) {
		getAddresses().remove(address);
		address.setState(null);

		return address;
	}

	public CountryDTO getCountry() {
		return this.country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

}