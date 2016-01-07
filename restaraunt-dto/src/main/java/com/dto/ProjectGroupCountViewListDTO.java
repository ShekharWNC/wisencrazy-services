package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectGroupCountViewListDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String companySid;
    private String projectName;
    private String projectSid;
    private int projectUserCount;
    private String href;
    private List<GroupCountViewListDTO> countViewListDTOs;
    
    
	
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	public int getProjectUserCount() {
		return projectUserCount;
	}
	public void setProjectUserCount(int projectUserCount) {
		this.projectUserCount = projectUserCount;
	}
	public List<GroupCountViewListDTO> getCountViewListDTOs() {
		return countViewListDTOs;
	}
	public void setCountViewListDTOs(List<GroupCountViewListDTO> countViewListDTOs) {
		this.countViewListDTOs = countViewListDTOs;
	}
	
	
    
	
}
