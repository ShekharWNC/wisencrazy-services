package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "project_has_virtual_account")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_ALL, query = "SELECT p FROM ProjectHasVirtualAccount p"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_PROJ_ID, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.projectHasVirtualAccountPK.projectId = :projectId"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_VIR_ACCT_ID, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.projectHasVirtualAccountPK.virtualAccountId = :virtualAccountId"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_PROJ_ID_VIR_ACCT_ID, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.projectHasVirtualAccountPK.virtualAccountId = :virtualAccountId AND p.projectHasVirtualAccountPK.projectId = :projectId"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_PROJ_ID_USER_ID, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.virtualAccount.user.id = :userId AND p.projectHasVirtualAccountPK.projectId = :projectId"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_PROJ_ID_USERNAME, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.virtualAccount.user.username = :userName AND p.projectHasVirtualAccountPK.projectId = :projectId"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_USER_ID, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.virtualAccount.user.id = :userId"),
        @NamedQuery(name = ProjectHasVirtualAccount.VALIDATE_PROJECT_CHECKIN, query = "select phva.isCheckedIn from ProjectHasVirtualAccount phva where phva.isCheckedIn = true and hex(phva.virtualAccount.sid) = :virtualAccountSid"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_USERNAME, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE p.virtualAccount.user.username = :userName"),
        @NamedQuery(name = ProjectHasVirtualAccount.FIND_BY_PROJ_SID, query = "SELECT p FROM ProjectHasVirtualAccount p WHERE hex(p.project.sid) =:projectSid and p.virtualAccount.isActive=true")})
public class ProjectHasVirtualAccount extends AbsCompositeEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectHasVirtualAccount.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_PROJ_ID = PREFIX + "findByProjectId";
    public static final String FIND_BY_VIR_ACCT_ID = PREFIX + "findByVirtualAccountId";
    public static final String FIND_BY_PROJ_ID_VIR_ACCT_ID = PREFIX + "findByProjIdVirtualAccountId";
    public static final String FIND_BY_USER_ID = PREFIX + "findByUserId";
    public static final String FIND_BY_USERNAME = PREFIX + "findByUserName";
    public static final String FIND_BY_PROJ_ID_USER_ID = PREFIX + "findByProjIdUserId";
    public static final String FIND_BY_PROJ_ID_USERNAME = PREFIX + "findByProjIdUsername";
    public static final String VALIDATE_PROJECT_CHECKIN = PREFIX + "validateProjectCheckin";
    public static final String FIND_BY_PROJ_SID=PREFIX+"findByProjectSid";

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProjectHasVirtualAccountPK projectHasVirtualAccountPK;
    
    @Column(name = "is_checkedin")
    private Boolean isCheckedIn;
    
    @JoinTable(name = "virtual_account_has_project_role", joinColumns = {
            @JoinColumn(name = "project_id", referencedColumnName = "project_id"),
            @JoinColumn(name = "virtual_account_id", referencedColumnName = "virtual_account_id")}, inverseJoinColumns = {
            @JoinColumn(name = "project_role_id", referencedColumnName = "id")})
    @ManyToMany
    private List<ProjectRole> projectRoleList;
    @JoinColumn(name = "virtual_account_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private VirtualAccount virtualAccount;
    @JoinColumn(name = "project_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Project project;

    public ProjectHasVirtualAccount() {
    }

    public ProjectHasVirtualAccount(ProjectHasVirtualAccountPK projectHasVirtualAccountPK) {
        this.projectHasVirtualAccountPK = projectHasVirtualAccountPK;
    }

    public ProjectHasVirtualAccount(int projectId, int virtualAccountId) {
        this.projectHasVirtualAccountPK = new ProjectHasVirtualAccountPK(projectId, virtualAccountId);
    }

    public ProjectHasVirtualAccountPK getProjectHasVirtualAccountPK() {
        return projectHasVirtualAccountPK;
    }

    public void setProjectHasVirtualAccountPK(ProjectHasVirtualAccountPK projectHasVirtualAccountPK) {
        this.projectHasVirtualAccountPK = projectHasVirtualAccountPK;
    }

    public Boolean getIsCheckedIn() {
		return isCheckedIn;
	}

	public void setIsCheckedIn(Boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}

	@XmlTransient
    public List<ProjectRole> getProjectRoleList() {
        return projectRoleList;
    }

    public void setProjectRoleList(List<ProjectRole> projectRoleList) {
        this.projectRoleList = projectRoleList;
    }

    public VirtualAccount getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(VirtualAccount virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectHasVirtualAccountPK != null ? projectHasVirtualAccountPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ProjectHasVirtualAccount)) {
            return false;
        }
        ProjectHasVirtualAccount other = (ProjectHasVirtualAccount) object;
        if ((this.projectHasVirtualAccountPK == null && other.projectHasVirtualAccountPK != null) || (this.projectHasVirtualAccountPK != null && !this.projectHasVirtualAccountPK.equals(other.projectHasVirtualAccountPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.ProjectHasVirtualAccount[ projectHasVirtualAccountPK=" + projectHasVirtualAccountPK + " ]";
    }
}
