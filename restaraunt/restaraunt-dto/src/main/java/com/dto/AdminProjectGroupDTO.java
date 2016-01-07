package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AdminProjectGroupDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7895767543821442158L;
	private String projectGroupSid;
	private String projectGroupName;
	private boolean isDefault;
	private String operation;
	private List<AdminProjectGroupUserDTO> groupUser;
	
	public String getProjectGroupSid() {
		return projectGroupSid;
	}
	public void setProjectGroupSid(String projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
	}
	public String getProjectGroupName() {
		return projectGroupName;
	}
	public void setProjectGroupName(String projectGroupName) {
		this.projectGroupName = projectGroupName;
	}
	public List<AdminProjectGroupUserDTO> getGroupUser() {
		return groupUser;
	}
	public void setGroupUser(List<AdminProjectGroupUserDTO> groupUser) {
		this.groupUser = groupUser;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}

