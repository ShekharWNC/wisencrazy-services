package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the event_repeats_on database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class EventRepeatsOnDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String repeatsOn;

	//bi-directional many-to-one association to Event
	private EventDTO event;

	public EventRepeatsOnDTO() {
	}

	public EventRepeatsOnDTO(String repeatsOn, EventDTO event) {
		super();
		this.repeatsOn = repeatsOn;
		this.event = event;
	}
	public String getRepeatsOn() {
		return this.repeatsOn;
	}

	public void setRepeatsOn(String repeatsOn) {
		this.repeatsOn = repeatsOn;
	}

	public EventDTO getEvent() {
		return this.event;
	}

	public void setEvent(EventDTO event) {
		this.event = event;
	}

}