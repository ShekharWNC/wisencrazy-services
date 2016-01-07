package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the project_has_calendar database table.
 * 
 */
@Entity
@Table(name="project_has_calendar")
public class ProjectHasCalendar extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Calendar
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "calendar_id", referencedColumnName = "id")
	private Calendar calendar;

	//bi-directional many-to-one association to Project
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;

	public ProjectHasCalendar() {
	}

	public Calendar getCalendar() {
		return this.calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}