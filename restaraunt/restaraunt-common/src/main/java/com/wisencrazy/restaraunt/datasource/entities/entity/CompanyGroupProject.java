package com.wisencrazy.restaraunt.datasource.entities.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// TODO: Auto-generated Javadoc

/**
 * The Class CompanyGroupProject.
 */
@Entity
@Table(name="vw_company_group_project")
public class CompanyGroupProject implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/** The group id. */
	@Id
	@Column(name="id")
	private Integer groupId;
	
	/** The sid. */
	@Column(name="sid")
	private String sid;
	
	/** The group name. */
	@Column(name="name")
	private String groupName;
	
	/** The project id. */
	@Column(name="project_id")
	private String projectId;
	
	/** The company id. */
	@Column(name="company_id")
	private String companyId;
	
	/** The total members. */
	@Column(name="total_member")
	private String totalMembers;
	
	/**
	 * Gets the group id.
	 *
	 * @return the group id
	 */
	public Integer getGroupId() {
		return groupId;
	}
	
	/**
	 * Gets the sid.
	 *
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}
	
	/**
	 * Gets the group name.
	 *
	 * @return the group name
	 */
	public String getGroupName() {
		return groupName;
	}
	
	/**
	 * Gets the project id.
	 *
	 * @return the project id
	 */
	public String getProjectId() {
		return projectId;
	}
	
	/**
	 * Gets the company id.
	 *
	 * @return the company id
	 */
	public String getCompanyId() {
		return companyId;
	}
	
	/**
	 * Gets the total members.
	 *
	 * @return the total members
	 */
	public String getTotalMembers() {
		return totalMembers;
	}
	
	/**
	 * Sets the group id.
	 *
	 * @param groupId the new group id
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	
	/**
	 * Sets the sid.
	 *
	 * @param sid the new sid
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	/**
	 * Sets the group name.
	 *
	 * @param groupName the new group name
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	/**
	 * Sets the project id.
	 *
	 * @param projectId the new project id
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	/**
	 * Sets the company id.
	 *
	 * @param companyId the new company id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	/**
	 * Sets the total members.
	 *
	 * @param totalMembers the new total members
	 */
	public void setTotalMembers(String totalMembers) {
		this.totalMembers = totalMembers;
	}
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompanyGroupProject)) {
            return false;
        }
        CompanyGroupProject other = (CompanyGroupProject) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CompanyGroupProject[ groupId=" + groupId + " ]";
    }
}
