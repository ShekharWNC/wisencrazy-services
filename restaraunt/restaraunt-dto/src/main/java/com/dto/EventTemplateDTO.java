package com.dto;

import java.io.Serializable;

public class EventTemplateDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String eventTypeSid;
	
	private String projectSid;
	
	private String templateName;

	public String getEventTypeSid() {
		return eventTypeSid;
	}

	public void setEventTypeSid(String eventTypeSid) {
		this.eventTypeSid = eventTypeSid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
}
