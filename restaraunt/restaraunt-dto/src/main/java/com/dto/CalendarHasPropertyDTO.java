package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the calendar_has_properties database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CalendarHasPropertyDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private CalendarDTO calendar;

	private PropertyDTO property;

	public CalendarHasPropertyDTO() {
	}

	public CalendarHasPropertyDTO(CalendarDTO calendar, PropertyDTO property) {
		super();
		this.calendar = calendar;
		this.property = property;
	}

	public CalendarDTO getCalendar() {
		return this.calendar;
	}

	public void setCalendar(CalendarDTO calendar) {
		this.calendar = calendar;
	}

	public PropertyDTO getProperty() {
		return this.property;
	}

	public void setProperty(PropertyDTO property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "CalendarHasPropertyDTO [calendar=" + calendar + ", property="
				+ property + "]";
	}

}