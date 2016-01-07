package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name="role")
public class Role extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="role_name")
	private String roleName;

	//bi-directional many-to-one association to ProjectRole
	/*@OneToMany(mappedBy="role")
	private List<ProjectRole> projectRoles;

	//bi-directional many-to-one association to UserHasRole
	@OneToMany(mappedBy="role")
	private List<UserHasRole> userHasRoles;*/

	public Role() {
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/*public List<ProjectRole> getProjectRoles() {
		return this.projectRoles;
	}

	public void setProjectRoles(List<ProjectRole> projectRoles) {
		this.projectRoles = projectRoles;
	}

	public ProjectRole addProjectRole(ProjectRole projectRole) {
		getProjectRoles().add(projectRole);
		projectRole.setRole(this);

		return projectRole;
	}

	public ProjectRole removeProjectRole(ProjectRole projectRole) {
		getProjectRoles().remove(projectRole);
		projectRole.setRole(null);

		return projectRole;
	}

	public List<UserHasRole> getUserHasRoles() {
		return this.userHasRoles;
	}

	public void setUserHasRoles(List<UserHasRole> userHasRoles) {
		this.userHasRoles = userHasRoles;
	}

	public UserHasRole addUserHasRole(UserHasRole userHasRole) {
		getUserHasRoles().add(userHasRole);
		userHasRole.setRole(this);

		return userHasRole;
	}

	public UserHasRole removeUserHasRole(UserHasRole userHasRole) {
		getUserHasRoles().remove(userHasRole);
		userHasRole.setRole(null);

		return userHasRole;
	}*/

}