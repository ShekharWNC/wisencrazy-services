package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 2/27/13
 * Time: 4:34 PM
 */
@Entity
@Table(name = "project_group")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = ProjectGroup.FIND_ALL, query = "SELECT p FROM ProjectGroup p"),
        @NamedQuery(name = ProjectGroup.FIND_BY_ID, query = "SELECT p FROM ProjectGroup p WHERE p.id = :id"),
        @NamedQuery(name = ProjectGroup.FIND_BY_SID, query = "SELECT p FROM ProjectGroup p WHERE hex(p.sid) = :sid"),
        @NamedQuery(name = ProjectGroup.FIND_BY_NAME, query = "SELECT p FROM ProjectGroup p WHERE p.name = :name"),
        @NamedQuery(name = ProjectGroup.FIND_BY_PROJECT_ID, query = "SELECT p FROM ProjectGroup p WHERE p.projectId.id = :projectId"),
        @NamedQuery(name = ProjectGroup.FIND_DEFAULT_BY_PROJECT_ID, query = "SELECT p FROM ProjectGroup p WHERE p.projectId.id = :projectId AND p.isDefault = true"),
        @NamedQuery(name = ProjectGroup.FIND_BY_PROJECT_SID, query = "SELECT p FROM ProjectGroup p WHERE hex(p.projectId.sid) = :projectSid"),
        @NamedQuery(name = ProjectGroup.UPDATE_NAME_BY_SID, query = "UPDATE ProjectGroup p set p.name = :name where hex(p.sid) = :sid")
})
public class ProjectGroup extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectGroup.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_PROJECT_ID = PREFIX + "findByProjectId";
    public static final String FIND_DEFAULT_BY_PROJECT_ID = PREFIX + "findDefaultByProjectId";
    public static final String FIND_BY_PROJECT_SID = PREFIX + "findByProjectSid";
    public static final String UPDATE_NAME_BY_SID = PREFIX + "updateProjectNameBySid";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    
    @JoinTable(name = "project_group_has_virtual_account", joinColumns = {
            @JoinColumn(name = "project_group_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "project_id", referencedColumnName = "project_id"),
            @JoinColumn(name = "virtual_account_id", referencedColumnName = "virtual_account_id")})
    @ManyToMany
    private List<ProjectHasVirtualAccount> projectHasVirtualAccountList;

    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Project projectId;
    
    @JoinColumn(name = "project_group_id")
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ProjectGroupHasEmail> projectGroupHasEmails;
    
    @Column(name="description")
    private String description;
    
    @NotNull
    @Column(name = "is_default")
    private boolean isDefault;
 

    public ProjectGroup() {
    }

    
    public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isDefault() {
		return isDefault;
	}


	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@XmlTransient
    public List<ProjectHasVirtualAccount> getProjectHasVirtualAccountList() {
        return projectHasVirtualAccountList;
    }

    public void setProjectHasVirtualAccountList(List<ProjectHasVirtualAccount> projectHasVirtualAccountList) {
        this.projectHasVirtualAccountList = projectHasVirtualAccountList;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }


	public List<ProjectGroupHasEmail> getProjectGroupHasEmails() {
		return projectGroupHasEmails;
	}


	public void setProjectGroupHasEmails(
			List<ProjectGroupHasEmail> projectGroupHasEmails) {
		this.projectGroupHasEmails = projectGroupHasEmails;
	}

}
