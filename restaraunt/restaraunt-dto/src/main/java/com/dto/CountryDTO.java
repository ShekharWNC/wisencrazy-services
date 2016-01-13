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


}