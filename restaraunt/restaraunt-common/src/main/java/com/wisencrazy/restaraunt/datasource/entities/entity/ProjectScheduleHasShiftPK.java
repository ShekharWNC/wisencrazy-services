package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProjectScheduleHasShiftPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "project_schedule_id")
	private int projectSchedule;

	@Column(name = "shift_id")
	private int event;

	public ProjectScheduleHasShiftPK() {
	}
	
	/*public int getProjectSchedule() {
		return projectSchedule;
	}

	public void setProjectSchedule(int projectSchedule) {
		this.projectSchedule = projectSchedule;
	}

	public int getEvent() {
		return event;
	}

	public void setEvent(int event) {
		this.event = event;
	}*/

	public int getProjectSchedule() {
		return projectSchedule;
	}

	public void setProjectSchedule(int projectSchedule) {
		this.projectSchedule = projectSchedule;
	}

	public int getEvent() {
		return event;
	}

	public void setEvent(int event) {
		this.event = event;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProjectScheduleHasShiftPK)) {
			return false;
		}
		ProjectScheduleHasShiftPK castOther = (ProjectScheduleHasShiftPK)other;
		return 
			(this.projectSchedule == castOther.projectSchedule)
			&& (this.event == castOther.event);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectSchedule;
		hash = hash * prime + this.event;
		
		return hash;
	}
}