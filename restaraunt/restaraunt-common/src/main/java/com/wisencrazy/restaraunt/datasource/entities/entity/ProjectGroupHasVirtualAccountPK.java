package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:38 PM
 * To change this template use File | Settings | File Templates.
 */

@Embeddable
public class ProjectGroupHasVirtualAccountPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1063835569864951239L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private int projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_account_id")
    private int virtualAccountId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_group_id")
    private int projectGroupId;


    public ProjectGroupHasVirtualAccountPK() {
    }

    public ProjectGroupHasVirtualAccountPK(int projectId, int virtualAccountId,int projectGroupId) {
        this.projectId = projectId;
        this.virtualAccountId = virtualAccountId;
        this.projectGroupId = projectGroupId;
    }
    public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getVirtualAccountId() {
		return virtualAccountId;
	}

	public void setVirtualAccountId(int virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}

	public int getProjectGroupId() {
		return projectGroupId;
	}

	public void setProjectGroupId(int projectGroupId) {
		this.projectGroupId = projectGroupId;
	}
   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) projectId;
        hash += (int) virtualAccountId;
        hash += (int) projectGroupId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProjectGroupHasVirtualAccountPK)) {
            return false;
        }
        ProjectGroupHasVirtualAccountPK other = (ProjectGroupHasVirtualAccountPK) object;
        if (this.projectId != other.projectId) {
            return false;
        }
        if (this.virtualAccountId != other.virtualAccountId) {
            return false;
        }
        if (this.projectGroupId != other.projectGroupId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.ProjectGroupHasVirtualAccountPK[ projectGroupId="+projectGroupId+", projectId=" + projectId + ", virtualAccountId=" + virtualAccountId + " ]";
    }

	
}
