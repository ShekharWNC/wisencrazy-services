package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the calendar database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CalendarDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String calendarName;
	
	private List<CalendarHasEventDTO> calendarHasEvents;

	private List<CalendarHasPermissionDTO> calendarHasPermissions;

	private List<CalendarHasPropertyDTO> calendarHasProperties;

	private List<JobHasCalendarDTO> jobHasCalendars;

	private List<ProjectHasCalendarDTO> projectHasCalendars;

	private List<UserHasCalendarDTO> userHasCalendars;

	public CalendarDTO() {
	}

	public String getCalendarName() {
		return this.calendarName;
	}

	public void setCalendarName(String calendarName) {
		this.calendarName = calendarName;
	}

	public List<CalendarHasEventDTO> getCalendarHasEvents() {
		return this.calendarHasEvents;
	}

	public void setCalendarHasEvents(List<CalendarHasEventDTO> calendarHasEvents) {
		this.calendarHasEvents = calendarHasEvents;
	}

	public List<CalendarHasPermissionDTO> getCalendarHasPermissions() {
		return this.calendarHasPermissions;
	}

	public void setCalendarHasPermissions(List<CalendarHasPermissionDTO> calendarHasPermissions) {
		this.calendarHasPermissions = calendarHasPermissions;
	}

	public CalendarHasPermissionDTO addCalendarHasPermission(CalendarHasPermissionDTO calendarHasPermission) {
		getCalendarHasPermissions().add(calendarHasPermission);
		calendarHasPermission.setCalendar(this);

		return calendarHasPermission;
	}

	public CalendarHasPermissionDTO removeCalendarHasPermission(CalendarHasPermissionDTO calendarHasPermission) {
		getCalendarHasPermissions().remove(calendarHasPermission);
		calendarHasPermission.setCalendar(null);

		return calendarHasPermission;
	}

	public List<CalendarHasPropertyDTO> getCalendarHasProperties() {
		return this.calendarHasProperties;
	}

	public void setCalendarHasProperties(List<CalendarHasPropertyDTO> calendarHasProperties) {
		this.calendarHasProperties = calendarHasProperties;
	}

	public CalendarHasPropertyDTO addCalendarHasProperty(CalendarHasPropertyDTO calendarHasProperty) {
		getCalendarHasProperties().add(calendarHasProperty);
		calendarHasProperty.setCalendar(this);

		return calendarHasProperty;
	}

	public CalendarHasPropertyDTO removeCalendarHasProperty(CalendarHasPropertyDTO calendarHasProperty) {
		getCalendarHasProperties().remove(calendarHasProperty);
		calendarHasProperty.setCalendar(null);

		return calendarHasProperty;
	}

	public List<JobHasCalendarDTO> getJobHasCalendars() {
		return this.jobHasCalendars;
	}

	public void setJobHasCalendars(List<JobHasCalendarDTO> jobHasCalendars) {
		this.jobHasCalendars = jobHasCalendars;
	}

	public JobHasCalendarDTO addJobHasCalendar(JobHasCalendarDTO jobHasCalendar) {
		getJobHasCalendars().add(jobHasCalendar);
		jobHasCalendar.setCalendar(this);

		return jobHasCalendar;
	}

	public JobHasCalendarDTO removeJobHasCalendar(JobHasCalendarDTO jobHasCalendar) {
		getJobHasCalendars().remove(jobHasCalendar);
		jobHasCalendar.setCalendar(null);

		return jobHasCalendar;
	}

	public List<ProjectHasCalendarDTO> getProjectHasCalendars() {
		return this.projectHasCalendars;
	}

	public void setProjectHasCalendars(List<ProjectHasCalendarDTO> projectHasCalendars) {
		this.projectHasCalendars = projectHasCalendars;
	}

	public ProjectHasCalendarDTO addProjectHasCalendar(ProjectHasCalendarDTO projectHasCalendar) {
		getProjectHasCalendars().add(projectHasCalendar);
		projectHasCalendar.setCalendar(this);

		return projectHasCalendar;
	}

	public ProjectHasCalendarDTO removeProjectHasCalendar(ProjectHasCalendarDTO projectHasCalendar) {
		getProjectHasCalendars().remove(projectHasCalendar);
		projectHasCalendar.setCalendar(null);

		return projectHasCalendar;
	}

	public List<UserHasCalendarDTO> getUserHasCalendars() {
		return this.userHasCalendars;
	}

	public void setUserHasCalendars(List<UserHasCalendarDTO> userHasCalendars) {
		this.userHasCalendars = userHasCalendars;
	}

	public UserHasCalendarDTO addUserHasCalendar(UserHasCalendarDTO userHasCalendar) {
		getUserHasCalendars().add(userHasCalendar);
		userHasCalendar.setCalendar(this);

		return userHasCalendar;
	}

	public UserHasCalendarDTO removeUserHasCalendar(UserHasCalendarDTO userHasCalendar) {
		getUserHasCalendars().remove(userHasCalendar);
		userHasCalendar.setCalendar(null);

		return userHasCalendar;
	}

	@Override
	public String toString() {
		return "CalendarDTO [calendarName=" + calendarName
				+ ", calendarHasEvents=" + calendarHasEvents
				+ ", calendarHasPermissions=" + calendarHasPermissions
				+ ", calendarHasProperties=" + calendarHasProperties
				+ ", jobHasCalendars=" + jobHasCalendars
				+ ", projectHasCalendars=" + projectHasCalendars
				+ ", userHasCalendars=" + userHasCalendars + "]";
	}


}