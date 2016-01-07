package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectViewDTO implements Serializable {

	private static final long serialVersionUID = -2179190341225847839L;
	private String projectSid;
	private String projectName;
	private String projectRoleName;
	
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
	public String getProjectRoleName() {
		return projectRoleName;
	}
	public void setProjectRoleName(String projectRoleName) {
		this.projectRoleName = projectRoleName;
	}
}
