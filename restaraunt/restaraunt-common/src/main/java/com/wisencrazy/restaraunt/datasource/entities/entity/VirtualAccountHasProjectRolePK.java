package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the virtual_account_has_project_role database table.
 * 
 */
@Embeddable
public class VirtualAccountHasProjectRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="virtual_account_id")
	private int virtualAccountId;

	@Column(name="project_role_id")
	private int projectRoleId;

	@Column(name="project_id")
	private int projectId;

	public VirtualAccountHasProjectRolePK() {
	}
	public int getVirtualAccountId() {
		return this.virtualAccountId;
	}
	public void setVirtualAccountId(int virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}
	public int getProjectRoleId() {
		return this.projectRoleId;
	}
	public void setProjectRoleId(int projectRoleId) {
		this.projectRoleId = projectRoleId;
	}
	public int getProjectId() {
		return this.projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VirtualAccountHasProjectRolePK)) {
			return false;
		}
		VirtualAccountHasProjectRolePK castOther = (VirtualAccountHasProjectRolePK)other;
		return 
			(this.virtualAccountId == castOther.virtualAccountId)
			&& (this.projectRoleId == castOther.projectRoleId)
			&& (this.projectId == castOther.projectId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.virtualAccountId;
		hash = hash * prime + this.projectRoleId;
		hash = hash * prime + this.projectId;
		
		return hash;
	}
}