package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * 
 * @author Vikash Pandey
 *
 */
@Entity
@Table(name="company_project_user_view")
@NamedQueries({@NamedQuery(name=CompanyProjectUserView.FIND_USER_BY_COMPANY_AND_VIRTUAL_ACCOUNT,query="from CompanyProjectUserView d where hex(d.companySid)=:companySid and hex(d.virtualSid)=:virtualSid and d.isActive=true")
})
public class CompanyProjectUserView extends AbsBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6394384214387395649L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.CompanyProjectUserView.";
	public static final String FIND_USER_BY_COMPANY_AND_VIRTUAL_ACCOUNT=PREFIX+"findUserByCompanyAndVirtualSid";
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="skills")
    private String skills;
    @Column(name="role")
    private String role;
    @Column(name="company_sid")
    private byte[] companySid;
    @Column(name="virtual_sid")
    private byte[] virtualSid;
    @Column(name="is_active")
    private Boolean isActive;
    @Column(name="company_role")
    private String companyRole;
    @Column(name="projects")
    private String projects;
    @Column(name="photo_url")
    private String photoUrl;
    @Column(name="mobile")
    private String mobile;
    @Column(name="user_type")
    private String userType;
    
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public byte[] getCompanySid() {
		return companySid;
	}
	public void setCompanySid(byte[] companySid) {
		this.companySid = companySid;
	}
	public byte[] getVirtualSid() {
		return virtualSid;
	}
	public void setVirtualSid(byte[] virtualSid) {
		this.virtualSid = virtualSid;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public String populateGroupSid() {
		return bytesToHexStringBySid(virtualSid);
	}
	public String populateCompanySid() {
		return bytesToHexStringBySid(companySid);
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CompanyProjectUserView)) {
			return false;
		}
		CompanyProjectUserView other = (CompanyProjectUserView) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.callcomm.eserve.persistence.entity.CompanyProjectUserView[ id="
				+ id + " ]";
	}
	public String getCompanyRole() {
		return companyRole;
	}
	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
}
