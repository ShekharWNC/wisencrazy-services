package com.dto;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AdminProjectViewDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2844976476790205477L;
	private String firstName;
	private String lastName;
	private String virtualSid;
	private String companySid;
	private String projectSid;
	private String projectName;
	private String projectRoleName;
	private String projectRoleSid;
	private String accountStatus;
	private List<AdminGroupDTO> group;
	
	public String getProjectRoleName() {
		return projectRoleName;
	}
	public void setProjectRoleName(String projectRoleName) {
		this.projectRoleName = projectRoleName;
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

	public String getProjectRoleSid() {
		return projectRoleSid;
	}
	public void setProjectRoleSid(String projectRoleSid) {
		this.projectRoleSid = projectRoleSid;
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public List<AdminGroupDTO> getGroup() {
		return group;
	}
	public void setGroup(List<AdminGroupDTO> group) {
		this.group = group;
	}
}
