package com.wisencrazy.restaraunt.rest.dto;

import java.io.Serializable;

public class ManualLocationInput implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2145441552893761868L;

	private String latitude;
	
	private String longitude;
	
	private String distance;
	
	private boolean isKm;
	
	private String areaSid;
	
	private String stateSid;

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

	public boolean getIsKm() {
		return isKm;
	}

	public void setIsKm(boolean isKm) {
		this.isKm = isKm;
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
}
