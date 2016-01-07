package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the project_user_has_events database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectUserHasEventDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String status;

	//bi-directional many-to-one association to Event
	private EventDTO event1;

	//bi-directional many-to-one association to Event
	private EventDTO event2;

	//bi-directional many-to-one association to ProjectUserHasRole
	private ProjectUserHasRoleDTO projectUserHasRole;

	public ProjectUserHasEventDTO() {
	}

	public ProjectUserHasEventDTO(String status, EventDTO event1,
			EventDTO event2, ProjectUserHasRoleDTO projectUserHasRole) {
		super();
		this.status = status;
		this.event1 = event1;
		this.event2 = event2;
		this.projectUserHasRole = projectUserHasRole;
	}
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EventDTO getEvent1() {
		return this.event1;
	}

	public void setEvent1(EventDTO event1) {
		this.event1 = event1;
	}

	public EventDTO getEvent2() {
		return this.event2;
	}

	public void setEvent2(EventDTO event2) {
		this.event2 = event2;
	}

	public ProjectUserHasRoleDTO getProjectUserHasRole() {
		return this.projectUserHasRole;
	}

	public void setProjectUserHasRole(ProjectUserHasRoleDTO projectUserHasRole) {
		this.projectUserHasRole = projectUserHasRole;
	}

}