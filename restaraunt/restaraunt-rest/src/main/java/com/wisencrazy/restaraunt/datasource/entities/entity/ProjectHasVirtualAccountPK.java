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
public class ProjectHasVirtualAccountPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "project_id")
    private int projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "virtual_account_id")
    private int virtualAccountId;

    public ProjectHasVirtualAccountPK() {
    }

    public ProjectHasVirtualAccountPK(int projectId, int virtualAccountId) {
        this.projectId = projectId;
        this.virtualAccountId = virtualAccountId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) projectId;
        hash += (int) virtualAccountId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProjectHasVirtualAccountPK)) {
            return false;
        }
        ProjectHasVirtualAccountPK other = (ProjectHasVirtualAccountPK) object;
        if (this.projectId != other.projectId) {
            return false;
        }
        if (this.virtualAccountId != other.virtualAccountId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.ProjectHasVirtualAccountPK[ projectId=" + projectId + ", virtualAccountId=" + virtualAccountId + " ]";
    }
}
