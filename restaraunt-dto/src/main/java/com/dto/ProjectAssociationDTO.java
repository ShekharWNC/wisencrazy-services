package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectAssociationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8460473175304434907L;
	private String projectSid;
	private String templateSid;
	private String companySid;
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	public String getTemplateSid() {
		return templateSid;
	}
	public void setTemplateSid(String templateSid) {
		this.templateSid = templateSid;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	

}
