package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyUserDTO implements Serializable{
	private String skillName;
	private List<CompanyUserListDTO> user;
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public List<CompanyUserListDTO> getUser() {
		return user;
	}
	public void setUser(List<CompanyUserListDTO> user) {
		this.user = user;
	}
	

}
