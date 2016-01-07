package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_calendar database table.
 * 
 */
@Entity
@Table(name="user_has_calendar")
public class UserHasCalendar extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Appuser appuser;

	//bi-directional many-to-one association to Calendar
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "calendar_id")
	private Calendar calendar;

	public UserHasCalendar() {
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Calendar getCalendar() {
		return this.calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}