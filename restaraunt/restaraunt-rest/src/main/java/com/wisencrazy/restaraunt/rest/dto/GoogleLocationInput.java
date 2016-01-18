package com.wisencrazy.restaraunt.rest.dto;

import java.io.Serializable;

public class GoogleLocationInput implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -107309105055903277L;

	private String areaSid;
	
	private String stateSid;

	public String getAreaSid() {
		return areaSid;
	}

	public void setAreaSid(String areaSid) {
		this.areaSid = areaSid;
	}

	public String getStateSid() {
		return stateSid;
	}

	public void setStateSid(String stateSid) {
		this.stateSid = stateSid;
	}
}
