package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="vw_count_project_group_company")
public class ProjectGroupCompanyCountView extends AbsCompositeEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2844389077374113678L;

	/**
	 * 
	 */
	@Id
	@Column(name="id")
	private String id;
    @Column(name="project_name")
    private String projectName;
   
    @Column(name="project_sid")
    private byte[] projectSid;
    @Column(name="company_id")
    private Integer companyId;
   
	@Column(name="project_group_name")
    private String projectGroupName;
    @Column(name="project_id")
    private Integer projectId;
    @Column(name="project_group_id")
    private Integer projectGroupId;
    
    @Column(name="project_group_sid")
    private byte[] projectGroupSid;
  
    @Column(name="count_virtual_account_id")
    private int count;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public byte[] getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}
	public String getProjectGroupName() {
		return projectGroupName;
	}
	public void setProjectGroupName(String projectGroupName) {
		this.projectGroupName = projectGroupName;
	}
	
	 public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Integer getCompanyId() {
			return companyId;
		}
		public void setCompanyId(Integer companyId) {
			this.companyId = companyId;
		}
    
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getProjectGroupId() {
		return projectGroupId;
	}
	public void setProjectGroupId(Integer projectGroupId) {
		this.projectGroupId = projectGroupId;
	}
	public byte[] getProjectGroupSid() {
		return projectGroupSid;
	}
	public void setProjectGroupSid(byte[] projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String populateProjectGroupSid(){
		return bytesToHexStringBySid(projectGroupSid);
	}
	public String populateProjectSid(){
		return bytesToHexStringBySid(projectSid);
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof ProjectGroupCompanyCountView)) {
	        return false;
	    }
	    ProjectGroupCompanyCountView other = (ProjectGroupCompanyCountView) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.ProjectGroupCompanyCountView[ id=" + id + " ]";
	}
}
