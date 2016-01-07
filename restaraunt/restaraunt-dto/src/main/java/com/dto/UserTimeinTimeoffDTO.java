package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_timein_timeoff database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserTimeinTimeoffDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private String description;

	private String status;

	private String type;

	//bi-directional many-to-one association to Event
	private EventDTO event;

	//bi-directional many-to-one association to ProjectUserHasRole
	private ProjectUserHasRoleDTO projectUserHasRole;

	public UserTimeinTimeoffDTO() {
	}

	public UserTimeinTimeoffDTO(String description, String status,
			String type, EventDTO event, ProjectUserHasRoleDTO projectUserHasRole) {
		super();
		this.description = description;
		this.status = status;
		this.type = type;
		this.event = event;
		this.projectUserHasRole = projectUserHasRole;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EventDTO getEvent() {
		return this.event;
	}

	public void setEvent(EventDTO event) {
		this.event = event;
	}

	public ProjectUserHasRoleDTO getProjectUserHasRole() {
		return this.projectUserHasRole;
	}

	public void setProjectUserHasRole(ProjectUserHasRoleDTO projectUserHasRole) {
		this.projectUserHasRole = projectUserHasRole;
	}

}