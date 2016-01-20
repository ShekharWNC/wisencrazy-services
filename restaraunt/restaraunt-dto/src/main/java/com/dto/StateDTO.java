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

//	//bi-directional many-to-one association to Country
//	private CountryDTO country;

	public StateDTO() {
	}

	public StateDTO(String stateName, CountryDTO country) {
		super();
		this.stateName = stateName;
//		this.country = country;
	}
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

//	public CountryDTO getCountry() {
//		return this.country;
//	}
//
//	public void setCountry(CountryDTO country) {
//		this.country = country;
//	}

}