package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the country database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CountryDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String countryName;

	//bi-directional many-to-one association to Address
	private List<AddressDTO> addresses;

	//bi-directional many-to-one association to Job
	private List<JobDTO> jobs;

	private List<AppuserDTO> users;
	
	public CountryDTO() {
	}

	public CountryDTO(String countryName) {
		super();
		this.countryName = countryName;
	
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	public List<JobDTO> getJobs() {
		return jobs;
	}

	public void setJobs(List<JobDTO> jobs) {
		this.jobs = jobs;
	}

	public List<AppuserDTO> getUsers() {
		return users;
	}

	public void setUsers(List<AppuserDTO> users) {
		this.users = users;
	}

}