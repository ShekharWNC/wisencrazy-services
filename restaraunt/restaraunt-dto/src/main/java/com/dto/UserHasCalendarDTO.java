package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_calendar database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasCalendarDTO extends CommonUserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<ContactOptionDTO> contactOptions;
	
	private List<CommonDTO> projectGroup;

	//bi-directional many-to-one association to Calendar
	private CalendarDTO calendar;

	public UserHasCalendarDTO() {
	}
	public CalendarDTO getCalendar() {
		return this.calendar;
	}

	public void setCalendar(CalendarDTO calendar) {
		this.calendar = calendar;
	}

	public List<ContactOptionDTO> getContactOptions() {
		return contactOptions;
	}

	public void setContactOptions(List<ContactOptionDTO> contactOptions) {
		this.contactOptions = contactOptions;
	}

	public List<CommonDTO> getProjectGroup() {
		return projectGroup;
	}

	public void setProjectGroup(List<CommonDTO> projectGroup) {
		this.projectGroup = projectGroup;
	}
}