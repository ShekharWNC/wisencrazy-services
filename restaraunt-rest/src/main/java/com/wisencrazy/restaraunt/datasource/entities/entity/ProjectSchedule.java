package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the project_schedule database table.
 * 
 */
@Entity
@Table(name="project_schedule")
public class ProjectSchedule extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

//	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="no_of_shifts")
	private String noOfShifts;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	private Project project;

	@Column(name="schedule_name")
	private String scheduleName;

	@Column(name = "schedule_repeated_by")
	private String scheduleRepeatsBy;

//	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Timestamp startDate;
	
	@Column(name = "creation_date")
	private Timestamp creationDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_schedule_id", referencedColumnName = "id")
	private List<ScheduleRepeatsOn> scheduleRepeatsOn;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="project_schedule_id", referencedColumnName = "id", insertable = false, updatable = false)
	private List<ProjectScheduleHasShift> projectScheduleHasShifts;

	public ProjectSchedule() {
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getNoOfShifts() {
		return this.noOfShifts;
	}

	public void setNoOfShifts(String noOfShifts) {
		this.noOfShifts = noOfShifts;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getScheduleName() {
		return this.scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public List<ProjectScheduleHasShift> getProjectScheduleHasShifts() {
		return this.projectScheduleHasShifts;
	}

	public void setProjectScheduleHasShifts(List<ProjectScheduleHasShift> projectScheduleHasShifts) {
		this.projectScheduleHasShifts = projectScheduleHasShifts;
	}

	public List<ScheduleRepeatsOn> getScheduleRepeatsOn() {
		return scheduleRepeatsOn;
	}

	public void setScheduleRepeatsOn(List<ScheduleRepeatsOn> scheduleRepeatsOn) {
		this.scheduleRepeatsOn = scheduleRepeatsOn;
	}

	public String getScheduleRepeatsBy() {
		return scheduleRepeatsBy;
	}

	public void setScheduleRepeatsBy(String scheduleRepeatsBy) {
		this.scheduleRepeatsBy = scheduleRepeatsBy;
	}
}