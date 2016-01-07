package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vw_user_event_template_processor")
public class UserEventPlaceHolderView extends AbsCompositeEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6214334890297750855L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name="appuser_id")
	private Integer appuserId;
	
    @Column(name="username")
    private String email;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="member_since")
	private Timestamp memberSince;
    
    @Column(name="company_id")
    private Integer companyId;
    
    @Column(name="company_name")
    private String companyName;
    
    @Column(name="project_name")
    private String projectName;
    
    @Column(name="project_id")
    private String projectId;
    
    @Column(name="project_sid")
    private byte[] projectSid;
    
    @Column(name="primary_contact")
    private String phone;
    
    @Column(name="timezone_name")
    private String timezoneName;
    
    @Column(name="country_name")
    private String countryName;
    
    @Column(name="company_role_name")
    private String companyRoleName;
    
    @Column(name="project_role_name")
    private String projectRoleName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAppuserId() {
		return appuserId;
	}

	public void setAppuserId(Integer appuserId) {
		this.appuserId = appuserId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Timestamp getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(Timestamp memberSince) {
		this.memberSince = memberSince;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public byte[] getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCompanyRoleName() {
		return companyRoleName;
	}

	public void setCompanyRoleName(String companyRoleName) {
		this.companyRoleName = companyRoleName;
	}

	public String getProjectRoleName() {
		return projectRoleName;
	}

	public void setProjectRoleName(String projectRoleName) {
		this.projectRoleName = projectRoleName;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof Template)) {
	        return false;
	    }
	    UserEventPlaceHolderView other = (UserEventPlaceHolderView) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.UserEventPlaceHolderView[ id=" + id + " ]";
	}
}
