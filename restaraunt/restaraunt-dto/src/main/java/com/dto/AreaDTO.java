package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the state database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AreaDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String areaName;

//	//bi-directional many-to-one association to Country
//	private CityDTO city;

	public AreaDTO() {
	}

//	public CityDTO getCity() {
//		return city;
//	}
//
//	public void setCity(CityDTO city) {
//		this.city = city;
//	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}