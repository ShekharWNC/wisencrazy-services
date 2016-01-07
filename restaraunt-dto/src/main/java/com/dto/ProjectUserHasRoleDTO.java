package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the project_user_has_role database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectUserHasRoleDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to ProjectUserHasEvent
	private List<ProjectUserHasEventDTO> projectUserHasEvents;

	//bi-directional many-to-one association to Project
	private ProjectDTO project;

	//bi-directional many-to-one association to ProjectRole
	private ProjectRoleDTO projectRole;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	//bi-directional many-to-one association to UserTimeinTimeoff
	private List<UserTimeinTimeoffDTO> userTimeinTimeoffs;

	public ProjectUserHasRoleDTO() {
	}

	public ProjectUserHasRoleDTO(
			List<ProjectUserHasEventDTO> projectUserHasEvents, ProjectDTO project,
			ProjectRoleDTO projectRole, AppuserDTO user,
			List<UserTimeinTimeoffDTO> userTimeinTimeoffs) {
		super();
		this.projectUserHasEvents = projectUserHasEvents;
		this.project = project;
		this.projectRole = projectRole;
		this.user = user;
		this.userTimeinTimeoffs = userTimeinTimeoffs;
	}
	public List<ProjectUserHasEventDTO> getProjectUserHasEvents() {
		return this.projectUserHasEvents;
	}

	public void setProjectUserHasEvents(List<ProjectUserHasEventDTO> projectUserHasEvents) {
		this.projectUserHasEvents = projectUserHasEvents;
	}

	public ProjectUserHasEventDTO addProjectUserHasEvent(ProjectUserHasEventDTO projectUserHasEvent) {
		getProjectUserHasEvents().add(projectUserHasEvent);
		projectUserHasEvent.setProjectUserHasRole(this);

		return projectUserHasEvent;
	}

	public ProjectUserHasEventDTO removeProjectUserHasEvent(ProjectUserHasEventDTO projectUserHasEvent) {
		getProjectUserHasEvents().remove(projectUserHasEvent);
		projectUserHasEvent.setProjectUserHasRole(null);

		return projectUserHasEvent;
	}

	public ProjectDTO getProject() {
		return this.project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public ProjectRoleDTO getProjectRole() {
		return this.projectRole;
	}

	public void setProjectRole(ProjectRoleDTO projectRole) {
		this.projectRole = projectRole;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public List<UserTimeinTimeoffDTO> getUserTimeinTimeoffs() {
		return this.userTimeinTimeoffs;
	}

	public void setUserTimeinTimeoffs(List<UserTimeinTimeoffDTO> userTimeinTimeoffs) {
		this.userTimeinTimeoffs = userTimeinTimeoffs;
	}

	public UserTimeinTimeoffDTO addUserTimeinTimeoff(UserTimeinTimeoffDTO userTimeinTimeoff) {
		getUserTimeinTimeoffs().add(userTimeinTimeoff);
		userTimeinTimeoff.setProjectUserHasRole(this);

		return userTimeinTimeoff;
	}

	public UserTimeinTimeoffDTO removeUserTimeinTimeoff(UserTimeinTimeoffDTO userTimeinTimeoff) {
		getUserTimeinTimeoffs().remove(userTimeinTimeoff);
		userTimeinTimeoff.setProjectUserHasRole(null);

		return userTimeinTimeoff;
	}

}