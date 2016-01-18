package com.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class RestarauntLocationViewDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6429030088925922512L;

	private String sid;
	
	private String restroName;
	
	private String areaName;
	
	private String photoUrl;
	
	private String latitude;

	private String longitude;

	private String distance;
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getRestroName() {
		return restroName;
	}

	public void setRestroName(String restroName) {
		this.restroName = restroName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

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
	
	
}
