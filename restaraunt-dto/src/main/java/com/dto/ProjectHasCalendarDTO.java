package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the project_has_calendar database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectHasCalendarDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Calendar
	private CalendarDTO calendar;

	//bi-directional many-to-one association to Project
	private ProjectDTO project;

	public ProjectHasCalendarDTO() {
	}

	public ProjectHasCalendarDTO(CalendarDTO calendar, ProjectDTO project) {
		super();
		this.calendar = calendar;
		this.project = project;
	}

	public CalendarDTO getCalendar() {
		return this.calendar;
	}

	public void setCalendar(CalendarDTO calendar) {
		this.calendar = calendar;
	}

	public ProjectDTO getProject() {
		return this.project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

}