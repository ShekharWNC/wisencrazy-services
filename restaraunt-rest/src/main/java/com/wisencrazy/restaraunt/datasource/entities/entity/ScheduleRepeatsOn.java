package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "schedule_repeats_on")
public class ScheduleRepeatsOn extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "repeats_on")
	private String repeatsOn;
	
	public String getRepeatsOn() {
		return repeatsOn;
	}

	public void setRepeatsOn(String repeatsOn) {
		this.repeatsOn = repeatsOn;
	}

}
