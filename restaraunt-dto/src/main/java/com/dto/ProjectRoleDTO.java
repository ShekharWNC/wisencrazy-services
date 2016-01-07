package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the project_role database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectRoleDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String role;

	//bi-directional many-to-one association to ProjectUserHasRole
	private List<ProjectUserHasRoleDTO> projectUserHasRoles;

	public ProjectRoleDTO() {
	}

	public ProjectRoleDTO(String role,
			List<ProjectUserHasRoleDTO> projectUserHasRoles) {
		super();
		this.role = role;
		this.projectUserHasRoles = projectUserHasRoles;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<ProjectUserHasRoleDTO> getProjectUserHasRoles() {
		return this.projectUserHasRoles;
	}

	public void setProjectUserHasRoles(List<ProjectUserHasRoleDTO> projectUserHasRoles) {
		this.projectUserHasRoles = projectUserHasRoles;
	}

	public ProjectUserHasRoleDTO addProjectUserHasRole(ProjectUserHasRoleDTO projectUserHasRole) {
		getProjectUserHasRoles().add(projectUserHasRole);
		projectUserHasRole.setProjectRole(this);

		return projectUserHasRole;
	}

	public ProjectUserHasRoleDTO removeProjectUserHasRole(ProjectUserHasRoleDTO projectUserHasRole) {
		getProjectUserHasRoles().remove(projectUserHasRole);
		projectUserHasRole.setProjectRole(null);

		return projectUserHasRole;
	}

}