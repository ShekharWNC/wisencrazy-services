package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupCountViewListDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String projectGroupName;
	 private String projectGroupSid;
	 private String companySid;
	 private String projectSid;
	 private int count;
	 private String href;
	public String getProjectGroupName() {
		return projectGroupName;
	}
	public void setProjectGroupName(String projectGroupName) {
		this.projectGroupName = projectGroupName;
	}
	public String getProjectGroupSid() {
		return projectGroupSid;
	}
	public void setProjectGroupSid(String projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
}
