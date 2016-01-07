package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class VirtualAccountBasicDTO extends VirtualAccountCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -573481503621188598L;
    private AppuserBasicsDTO user; // Due to customer population issue this field name changed from user to appuser.
    public  List<CompanyRoleDTO> companyRole;
	public  List<UserGroupDTO> userGroupList;
	public List<VirtualAccountHasSkillDTO> virtualAccountHasSkills;
    private List<AdminProjectGroupDTO> teams;
	private ProjectCommonDTO project;
	
	
	public List<VirtualAccountHasSkillDTO> getVirtualAccountHasSkills() {
		return virtualAccountHasSkills;
	}
	public void setVirtualAccountHasSkills(
			List<VirtualAccountHasSkillDTO> virtualAccountHasSkills) {
		this.virtualAccountHasSkills = virtualAccountHasSkills;
	}
	public List<CompanyRoleDTO> getCompanyRole() {
		return companyRole;
	}
	public void setCompanyRole(List<CompanyRoleDTO> companyRole) {
		this.companyRole = companyRole;
	}
	public List<UserGroupDTO> getUserGroupList() {
		return userGroupList;
	}
	public void setUserGroupList(List<UserGroupDTO> userGroupList) {
		this.userGroupList = userGroupList;
	}
	public AppuserBasicsDTO getUser() {
		return user;
	}
	public void setUser(AppuserBasicsDTO user) {
		this.user = user;
	}
	public List<AdminProjectGroupDTO> getTeams() {
		return teams;
	}
	public void setTeams(List<AdminProjectGroupDTO> teams) {
		this.teams = teams;
	}
	public ProjectCommonDTO getProject() {
		return project;
	}
	public void setProject(ProjectCommonDTO project) {
		this.project = project;
	}
	
}
