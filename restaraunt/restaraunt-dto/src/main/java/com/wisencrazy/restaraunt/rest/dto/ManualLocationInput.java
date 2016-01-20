package com.wisencrazy.restaraunt.rest.dto;

import java.io.Serializable;

public class ManualLocationInput implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -107309105055903277L;

	private String areaSid;
	
	private String stateSid;
	
	private String timings;

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

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}
}
