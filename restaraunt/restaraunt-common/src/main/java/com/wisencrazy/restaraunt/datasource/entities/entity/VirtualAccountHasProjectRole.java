package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the virtual_account_has_project_role database table.
 * 
 */
@Entity
@Table(name="virtual_account_has_project_role")
@NamedQueries({
	@NamedQuery(name = VirtualAccountHasProjectRole.FIND_ROLES_BY_EMAIL, query = "select pr.name from VirtualAccountHasProjectRole vapr join vapr.projectRole pr where vapr.virtualAccount.user.username = :emailId"),
	@NamedQuery(name=VirtualAccountHasProjectRole.FIND_ROLES_BY_VIRTUAL_ACCOUNT_PROJECT, query="select v from VirtualAccountHasProjectRole v where project.sid=unhex(:projectSid) and virtualAccount.sid=unhex(:virtualAccountSid)")
})
public class VirtualAccountHasProjectRole extends AbsCompositeEntity {
	private static final long serialVersionUID = 1L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VirtualAccountHasProjectRole.";
	
	public static final String FIND_ROLES_BY_EMAIL = PREFIX + "findRolesByEmail";
	public static final String FIND_ROLES_BY_VIRTUAL_ACCOUNT_PROJECT = PREFIX + "findRolesByVirtualAccount";
	
	@EmbeddedId
	private VirtualAccountHasProjectRolePK id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "virtual_account_id", referencedColumnName = "id", insertable = false, updatable = false)
	private VirtualAccount virtualAccount;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_role_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ProjectRole projectRole;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Project project;
	

	public VirtualAccountHasProjectRole() {
	}

	public VirtualAccountHasProjectRolePK getId() {
		return this.id;
	}

	public void setId(VirtualAccountHasProjectRolePK id) {
		this.id = id;
	}

	public VirtualAccount getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public ProjectRole getProjectRole() {
		return projectRole;
	}

	public void setProjectRole(ProjectRole projectRole) {
		this.projectRole = projectRole;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}