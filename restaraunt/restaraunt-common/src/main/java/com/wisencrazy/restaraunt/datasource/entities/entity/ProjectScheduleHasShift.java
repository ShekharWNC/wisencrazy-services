package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the project_schedule_has_shifts database table.
 * 
 */
@Entity
//@IdClass(ProjectScheduleHasShiftPK.class)
@Table(name="project_schedule_has_shifts")
public class ProjectScheduleHasShift extends AbsCompositeEntity{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProjectScheduleHasShiftPK projectScheduleHasShiftPK;
	
	@Column(name="shift_status")
	private String shiftStatus;
	
	/*@Id
	@ManyToOne
	@JoinColumn(name = "project_schedule_id")
	private ProjectSchedule projectSchedule;*/
	
//	@Id
//	@Transient
	@ManyToOne
	@JoinColumn(name = "shift_id", insertable = false, updatable = false)
	private Event event;

	public ProjectScheduleHasShift() {
	}

	public ProjectScheduleHasShiftPK getProjectScheduleHasShiftPK() {
		return projectScheduleHasShiftPK;
	}

	public void setProjectScheduleHasShiftPK(
			ProjectScheduleHasShiftPK projectScheduleHasShiftPK) {
		this.projectScheduleHasShiftPK = projectScheduleHasShiftPK;
	}

	public String getShiftStatus() {
		return this.shiftStatus;
	}

	public void setShiftStatus(String shiftStatus) {
		this.shiftStatus = shiftStatus;
	}

	/*public ProjectSchedule getProjectSchedule() {
		return projectSchedule;
	}


	public void setProjectSchedule(ProjectSchedule projectSchedule) {
		this.projectSchedule = projectSchedule;
	}*/

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}


}