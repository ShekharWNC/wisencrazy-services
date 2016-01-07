package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/19/13
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "project_role")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = ProjectRole.FIND_ALL, query = "SELECT p FROM ProjectRole p"),
        @NamedQuery(name = ProjectRole.FIND_BY_ID, query = "SELECT p FROM ProjectRole p WHERE p.id = :id"),
        @NamedQuery(name = ProjectRole.FIND_BY_NAME, query = "SELECT p FROM ProjectRole p WHERE p.name = :name"),
        @NamedQuery(name = ProjectRole.FIND_ID_BY_NAME, query = "SELECT p.id FROM ProjectRole p WHERE p.name = :name")
})
public class ProjectRole extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectRole.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_ID_BY_NAME = PREFIX + "findIdByName";

    public static final int AGENT_ROLE = 1;
    public static final int SUPERVISOR_ROLE = 2;

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "projectRoleList")
    private List<ProjectHasVirtualAccount> projectHasVirtualAccountList;

    public ProjectRole() {
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
}
