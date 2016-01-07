package com.dto;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class AdminCompanyViewDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2778588720748742669L;
	private String firstName;
	private String lastName;
	private String virtualSid;
	private String companySid;
	private String companyRole;
	private String companyRoleSid;
	private String projectSid;
	private String projectName;
	private String department;
	private String departmentSid;
	private String accountStatus;
	private String userType;
	
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
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
	public String getVirtualSid() {
		return virtualSid;
	}
	public void setVirtualSid(String virtualSid) {
		this.virtualSid = virtualSid;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	public String getCompanyRole() {
		return companyRole;
	}
	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}
	public String getCompanyRoleSid() {
		return companyRoleSid;
	}
	public void setCompanyRoleSid(String companyRoleSid) {
		this.companyRoleSid = companyRoleSid;
	}
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
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
	public String getDepartmentSid() {
		return departmentSid;
	}
	public void setDepartmentSid(String departmentSid) {
		this.departmentSid = departmentSid;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
