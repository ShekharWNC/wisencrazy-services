package com.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the properties database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PropertyDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String colour;

	private String defaultEventStatus;

	private String weekStart;

	private Time workingHoursEnd;

	private Time workingHoursStart;

	//bi-directional many-to-one association to CalendarHasProperty
	private List<CalendarHasPropertyDTO> calendarHasProperties;

	public PropertyDTO() {
	}

	public PropertyDTO(String colour, String defaultEventStatus,
			String weekStart, Time workingHoursEnd, Time workingHoursStart,
			List<CalendarHasPropertyDTO> calendarHasProperties) {
		super();
		this.colour = colour;
		this.defaultEventStatus = defaultEventStatus;
		this.weekStart = weekStart;
		this.workingHoursEnd = workingHoursEnd;
		this.workingHoursStart = workingHoursStart;
		this.calendarHasProperties = calendarHasProperties;
	}
	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDefaultEventStatus() {
		return this.defaultEventStatus;
	}

	public void setDefaultEventStatus(String defaultEventStatus) {
		this.defaultEventStatus = defaultEventStatus;
	}

	public String getWeekStart() {
		return this.weekStart;
	}

	public void setWeekStart(String weekStart) {
		this.weekStart = weekStart;
	}

	public Time getWorkingHoursEnd() {
		return this.workingHoursEnd;
	}

	public void setWorkingHoursEnd(Time workingHoursEnd) {
		this.workingHoursEnd = workingHoursEnd;
	}

	public Time getWorkingHoursStart() {
		return this.workingHoursStart;
	}

	public void setWorkingHoursStart(Time workingHoursStart) {
		this.workingHoursStart = workingHoursStart;
	}

	public List<CalendarHasPropertyDTO> getCalendarHasProperties() {
		return this.calendarHasProperties;
	}

	public void setCalendarHasProperties(List<CalendarHasPropertyDTO> calendarHasProperties) {
		this.calendarHasProperties = calendarHasProperties;
	}

	public CalendarHasPropertyDTO addCalendarHasProperty(CalendarHasPropertyDTO calendarHasProperty) {
		getCalendarHasProperties().add(calendarHasProperty);
		calendarHasProperty.setProperty(this);

		return calendarHasProperty;
	}

	public CalendarHasPropertyDTO removeCalendarHasProperty(CalendarHasPropertyDTO calendarHasProperty) {
		getCalendarHasProperties().remove(calendarHasProperty);
		calendarHasProperty.setProperty(null);

		return calendarHasProperty;
	}

}