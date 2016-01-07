package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AdminCompanyGroupDTO implements Serializable{
	private String companyGroupName;
	private String companyGroupSid;
	private List<AdminCompanyGroupUserDTO> groupUser;
	
	
	public String getCompanyGroupName() {
		return companyGroupName;
	}
	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}
	public List<AdminCompanyGroupUserDTO> getGroupUser() {
		return groupUser;
	}
	public void setGroupUser(List<AdminCompanyGroupUserDTO> groupUser) {
		this.groupUser = groupUser;
	}
	public String getCompanyGroupSid() {
		return companyGroupSid;
	}
	public void setCompanyGroupSid(String companyGroupSid) {
		this.companyGroupSid = companyGroupSid;
	}
	

}
