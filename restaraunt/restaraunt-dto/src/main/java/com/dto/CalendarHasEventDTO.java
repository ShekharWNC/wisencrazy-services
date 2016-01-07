package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the calendar_has_events database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CalendarHasEventDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String statusType;

	private EventDTO event;

	public CalendarHasEventDTO() {
	}

	public String getStatusType() {
		return this.statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}

	public EventDTO getEvent() {
		return this.event;
	}

	public void setEvent(EventDTO event) {
		this.event = event;
	}
}