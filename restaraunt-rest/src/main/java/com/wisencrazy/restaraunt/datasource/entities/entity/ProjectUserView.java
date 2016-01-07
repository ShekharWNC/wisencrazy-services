package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Vikash Pandey
 *
 */
@Entity
@Table(name="project_user_view")
public class ProjectUserView extends AbsCompositeEntity{

   
	/**
	 * 
	 */
	private static final long serialVersionUID = -1116252459470046633L;
	@Id
	@Column(name="id")
	private String id;
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
    private byte[] virtualAccountSid;
    @Column(name="is_active")
    private Boolean isActive;
    @Column(name="company_role")
    private String companyRole;
    @Column(name="project_groups")
    private String projectGroups;
    @Column(name="project_sid")
    private byte[] projectSid;
    @Column(name="project_name")
    private String projectName;
    @Column(name="mobile")
    private String mobile;
    @Column(name="photo_url")
    private String photoUrl;
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
	public byte[] getVirtualAccountSid() {
		return virtualAccountSid;
	}
	public void setVirtualAccountSid(byte[] virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getCompanyRole() {
		return companyRole;
	}
	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}
	public String getProjectGroups() {
		return projectGroups;
	}
	public void setProjectGroups(String projectGroups) {
		this.projectGroups = projectGroups;
	}
	public byte[] getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String populateVirtualAccountSid() {
		return bytesToHexStringBySid(virtualAccountSid);
	}
	public String populateCompanySid() {
		return bytesToHexStringBySid(companySid);
	}
	public String populateProjectSid() {
		return bytesToHexStringBySid(projectSid);
	}
	public String sid() {
		return bytesToHexStringBySid(sid);
	}
	
}
