package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.wisencrazy.restaraunt.datasource.entities.entity.VirtualAccount.UserType;

@Entity
@Table(name="admin_view")
@NamedQueries({@NamedQuery(name=AdminView.FIND_SUPERVISOR_BY_PROJECT,query="from AdminView a where hex(a.projectSid)=:projectSid and a.projectRoleName='Supervisor' and a.isActive=true"),
	           @NamedQuery(name=AdminView.FIND_AGENT_BY_VIRTUAL_ACCOUNT,query="from AdminView a where hex(a.virtualSid)=:virtualAccountSid and a.isActive=true"),
               @NamedQuery(name=AdminView.FIND_AGENT_BY_PROJECT, query="from AdminView a where hex(a.projectSid)=:projectSid and a.isActive=true and a.projectRoleName='Agent'"),
               @NamedQuery(name=AdminView.FIND_ALL_USER_BY_COMPANY, query="from AdminView a where hex(a.companySid)=:companySid and a.isActive=true"),
               @NamedQuery(name=AdminView.FIND_AGENT_BY_COMPANY, query="from AdminView a where hex(a.companySid)=:companySid and a.isActive=true"),
               @NamedQuery(name=AdminView.FIND_SUPERVISOR_BY_COMPANY, query="from AdminView a where hex(a.companySid)=:companySid and a.isActive=true and a.projectRoleName='Supervisor'"),
               @NamedQuery(name=AdminView.FIND_AUTO_AGENT_BY_PROJECT,query="from AdminView a where hex(a.projectSid)=:projectSid and a.userType='AUTO_AGENT_USER'"),
               @NamedQuery(name=AdminView.FIND_PA, query="select hex(a.virtualSid) from AdminView a where a.projectName='viachat_project' and a.isActive=true and a.projectRoleName='PA'")
	})
public class AdminView extends AbsCompositeEntity {
	
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.AdminView.";
	public static final String FIND_SUPERVISOR_BY_PROJECT=PREFIX+"findSupervisorByProject";
	public static final String FIND_AGENT_BY_VIRTUAL_ACCOUNT=PREFIX+"findAgentByVirtualAccount";
	public static final String FIND_AGENT_BY_PROJECT=PREFIX+"findAgentByProject";
	public static final String FIND_ALL_USER_BY_COMPANY=PREFIX+"findAllUserByCompany";
	public static final String FIND_AGENT_BY_COMPANY=PREFIX+"findAgentByCompany";
	public static final String FIND_SUPERVISOR_BY_COMPANY=PREFIX+"findSupervisorByCompany";
	public static final String FIND_AUTO_AGENT_BY_PROJECT=PREFIX+"findAutoAgentByProject";
	public static final String FIND_PA=PREFIX+"findPA";
	private static final long serialVersionUID = -7317018119795681707L;
	@Column(name="virtual_account_id")
	private Integer virtualAccountId;
	
	@Column(name="id")
	private Integer id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="u_id")
	private String uid;
	@Column(name="project_id")
	private Integer projectId;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="username")
	private String emailId;

	@Column(name="phone")
	private String phone;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="virtual_sid")
	private byte[] virtualSid;
	
	@Column(name="company_sid")
	private byte[] companySid;
	
	@Column(name="project_sid")
	private byte[] projectSid;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="department")
	private String department;
	
	@Column(name="project_role_name")
	private String projectRoleName;
	
	@Column(name="account_status")
	private String accountStatus;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="photo_url")
	private String photoUrl;
	
	@Column(name="user_type")
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public byte[] getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
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
	public byte[] getVirtualSid() {
		return virtualSid;
	}
	public Integer getVirtualAccountId() {
		return virtualAccountId;
	}
	public void setVirtualAccountId(Integer virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public void setVirtualSid(byte[] virtualSid) {
		this.virtualSid = virtualSid;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getProjectRoleName() {
		return projectRoleName;
	}
	public void setProjectRoleName(String projectRoleName) {
		this.projectRoleName = projectRoleName;
	}
	public String populateCompanySid(){
    	return bytesToHexStringBySid(companySid);
    }
	public String populateVirtualAccountSid(){
    	return bytesToHexStringBySid(virtualSid);
    }
	public String populateProjectSid(){
    	return bytesToHexStringBySid(projectSid);
    }
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AdminView)) {
            return false;
        }
        AdminView other = (AdminView) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.AdminView[ id=" + id + " ]";
    }
}
