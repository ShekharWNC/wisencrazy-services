package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the state database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CityDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cityName;

//	//bi-directional many-to-one association to Country
//	private StateDTO state;

	public CityDTO() {
	}

//	public StateDTO getState() {
//		return state;
//	}
//
//	public void setState(StateDTO state) {
//		this.state = state;
//	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}