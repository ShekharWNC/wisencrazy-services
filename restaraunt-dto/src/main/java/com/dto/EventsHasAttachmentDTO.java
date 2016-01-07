package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the events_has_attachments database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class EventsHasAttachmentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attachementName;

	private String attachmentPath;

	private EventDTO event;

	public EventsHasAttachmentDTO() {
	}

	public EventsHasAttachmentDTO(String attachementName,
			String attachmentPath, EventDTO event) {
		super();
		this.attachementName = attachementName;
		this.attachmentPath = attachmentPath;
		this.event = event;
	}
	public String getAttachementName() {
		return this.attachementName;
	}

	public void setAttachementName(String attachementName) {
		this.attachementName = attachementName;
	}

	public String getAttachmentPath() {
		return this.attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public EventDTO getEvent() {
		return this.event;
	}

	public void setEvent(EventDTO event) {
		this.event = event;
	}

}