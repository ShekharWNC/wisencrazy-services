package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;

@Entity
@Table(name="vw_restaraunt_location")
@NamedQueries({
	@NamedQuery(name=RestarauntLocationView.FIND_BY_AREA_SID,query="select rlv from RestarauntLocationView rlv where rlv.areaSid=:areaSid and timing=:timing")
})
public class RestarauntLocationView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6453948859570310170L;

	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntLocationView.";

	public static final String FIND_RESTRO_BY_DISTANCE = "select id,sid,name,area_name,photo_url,latitude,longitude,timing,(6371 * ACOS(COS(RADIANS(:latitude)) * COS(RADIANS(latitude)) * COS(RADIANS(longitude) "
			+ "- RADIANS(:longitude)) + SIN(RADIANS(:latitude)) * SIN(RADIANS(latitude)))) AS distance from vw_restaraunt_location where timing=:timing having distance <=:distance order by distance ASC";
	
	public static final String FIND_BY_AREA_SID=PREFIX+"findByAreaSid";
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="sid")
	private String sid;
	
	@Column(name="name")
	private String restroName;
	
	@Column(name="area_name")
	private String areaName;
	
	@Column(name="area_sid")
	private String areaSid;
	
	@Column(name="photo_url")
	private String photoUrl;
	
	@Column(name="latitude")
	private String latitude;

	@Column(name="longitude")
	private String longitude;
	
	@Column(name="timing")
	@Enumerated(EnumType.STRING)
	private Timings timing;
	
	@Column(name="distance")
	private String distance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Timings getTiming() {
		return timing;
	}

	public void setTiming(Timings timing) {
		this.timing = timing;
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
	
	
	
}
