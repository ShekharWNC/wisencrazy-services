package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the timezone database table.
 * 
 */
@Entity
@Table(name="timezone")
public class Timezone extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="timezone_abbr")
	private String timezoneAbbr;

	@Column(name="timezone_name")
	private String timezoneName;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "offset_val")
	private String offSet;

	//bi-directional many-to-one association to Appuser
	/*@OneToMany(mappedBy="timezone")
	private List<Appuser> appusers;*/

	public Timezone() {
	}

	public String getTimezoneAbbr() {
		return this.timezoneAbbr;
	}

	public void setTimezoneAbbr(String timezoneAbbr) {
		this.timezoneAbbr = timezoneAbbr;
	}

	public String getTimezoneName() {
		return this.timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOffSet() {
		return offSet;
	}

	public void setOffSet(String offSet) {
		this.offSet = offSet;
	}
}