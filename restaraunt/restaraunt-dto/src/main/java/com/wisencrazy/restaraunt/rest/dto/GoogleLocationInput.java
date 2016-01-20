package com.wisencrazy.restaraunt.rest.dto;

import java.io.Serializable;

public class GoogleLocationInput implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2145441552893761868L;

	private String latitude;
	
	private String longitude;
	
	private String distance;
	
	private String areaSid;
	
	private String stateSid;
	
	private String timings;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

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
