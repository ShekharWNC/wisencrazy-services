package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="restaraunt_has_timings")
public class RestarauntHasTimings implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3362620995064661760L;
	
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.";

	public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	public enum Timings{
		BR,//Breakfast
		LU,//Lunch
		DI //Dinner
	}
	
	@EmbeddedId
	private RestarauntHasTimingsPK timingsPK;
	
	@Column(name = "photo_url")
	private String photoUrl;
	
	public RestarauntHasTimingsPK getTimingsPK() {
		return timingsPK;
	}

	public void setTimingsPK(RestarauntHasTimingsPK timingsPK) {
		this.timingsPK = timingsPK;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}
