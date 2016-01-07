package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="project_group_view")
@NamedQueries({
	           @NamedQuery(name=ProjectGroupCompanyView.FIND_SUPERVISOR_BY_PROJECT_GROUP,query="from ProjectGroupCompanyView p where hex(p.projectGroupSid)=:projectGroupSid and p.accountStatus=true and p.role='Supervisor'"),
	           @NamedQuery(name=ProjectGroupCompanyView.FIND_AGENT_BY_PROJECT_GROUP,query="from ProjectGroupCompanyView p where hex(p.projectGroupSid)=:projectGroupSid and p.accountStatus=true and p.role='Agent'")
             })
public class ProjectGroupCompanyView extends AbsBaseEntity{
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.ProjectGroupCompanyView.";
	public static final String FIND_SUPERVISOR_BY_PROJECT_GROUP=PREFIX+"findSupervisorByProjectGroup";
	public static final String FIND_AGENT_BY_PROJECT_GROUP=PREFIX+"findAgentByProjectGroup";
	private static final long serialVersionUID = 1144666668227353972L;
	/**
	 * 
	 */
	@Column(name="username")
	private String emailId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="virtual_account_sid")
	private byte[] virtualAccountSid;
	@Column(name="company_id")
	private Integer company_id;
	@Column(name="company_sid")
	private byte[] companySid;
	@Column(name="project_name")
	private String projectName;
	@Column(name="project_sid")
	private byte[] projectSid;
	@Column(name="project_group_name")
	private String projectGroupName;
	@Column(name="project_group_sid")
	private byte[] projectGroupSid;
	@Column(name="primary_contact")
	private String phone;
	@Column(name="photo_url")
	private String photoUrl;
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="account_status")
	private boolean accountStatus;
	@Column(name="role")
	private String role;
	
	public boolean isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public byte[] getVirtualAccountSid() {
		return virtualAccountSid;
	}
	public void setVirtualAccountSid(byte[] virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public byte[] getCompanySid() {
		return companySid;
	}
	public void setCompanySid(byte[] companySid) {
		this.companySid = companySid;
	}
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
	public byte[] getProjectGroupSid() {
		return projectGroupSid;
	}
	public void setProjectGroupSid(byte[] projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String populateProjectGroupSid(){
		return bytesToHexStringBySid(projectGroupSid);
	}
	public String populateProjectSid(){
		return bytesToHexStringBySid(projectSid);
	}
	public String populateCompanySid(){
		return bytesToHexStringBySid(companySid);
	}
	public String populateVirtualAccountSid(){
		return bytesToHexStringBySid(virtualAccountSid);
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof ProjectGroupCompanyView)) {
	        return false;
	    }
	    ProjectGroupCompanyView other = (ProjectGroupCompanyView) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.ProjectGroupCompanyView[ id=" + id + " ]";
	}
	
}
