package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="project_group_has_virtual_account")
public class ProjectGroupHasVirtualAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1939954776402129285L;
	@EmbeddedId
	protected ProjectGroupHasVirtualAccountPK projectGroupHasVirtualAccountPK;

	public ProjectGroupHasVirtualAccountPK getProjectGroupHasVirtualAccountPK() {
		return projectGroupHasVirtualAccountPK;
	}

	public void setProjectGroupHasVirtualAccountPK(
			ProjectGroupHasVirtualAccountPK projectGroupHasVirtualAccountPK) {
		this.projectGroupHasVirtualAccountPK = projectGroupHasVirtualAccountPK;
	}
	
}
