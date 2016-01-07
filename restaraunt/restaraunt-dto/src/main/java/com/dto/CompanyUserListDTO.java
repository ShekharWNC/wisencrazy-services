package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyUserListDTO implements Serializable  {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	 private String lastName;
	 private String companySid;
	 private String virtualSid;
	 private String departmentName;
	 private String departmentSid;
	 private String skillRatingLevel;
	 
	public String getSkillRatingLevel() {
		return skillRatingLevel;
	}
	public void setSkillRatingLevel(String skillRatingLevel) {
		this.skillRatingLevel = skillRatingLevel;
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
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	
	
	public String getVirtualSid() {
		return virtualSid;
	}
	public void setVirtualSid(String virtualSid) {
		this.virtualSid = virtualSid;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentSid() {
		return departmentSid;
	}
	public void setDepartmentSid(String departmentSid) {
		this.departmentSid = departmentSid;
	}
     	 
}