package com.dto;

import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the virtual_accounts database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class VirtualAccountDTO extends VirtualAccountCommonDTO implements Serializable {

	private static final long serialVersionUID = 1109511517105414564L;

	//bi-directional many-to-one association to ConsultantProfile
	private List<ConsultantProfileDTO> consultantProfiles;

	//bi-directional many-to-one association to EmployeeProfile
	private List<EmployeeProfileDTO> employeeProfiles;

	//bi-directional many-to-one association to Company
	private CompanyCommonDTO company;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	//bi-directional many-to-one association to VirtualAccountsHasInvitation
	private List<VirtualAccountsHasInvitationDTO> virtualAccountsHasInvitations;
	
	private ProfileTypeDTO profileType;
	
	private  List<CompanyRoleDTO> companyRole;

	private  List<UserGroupDTO> userGroupList;
	
	private List<VirtualAccountHasSkillDTO> virtualAccountHasSkills;
	
	private List<AdminProjectGroupDTO> teams;
	
	private ProjectCommonDTO project;
	
	private ProjectCommonDTO oldProject;

	public ProjectCommonDTO getOldProject() {
		return oldProject;
	}

	public void setOldProject(ProjectCommonDTO oldProject) {
		this.oldProject = oldProject;
	}

	public VirtualAccountDTO() {
	}

	public VirtualAccountDTO( List<ConsultantProfileDTO> consultantProfiles,
			List<EmployeeProfileDTO> employeeProfiles, CompanyDTO company, AppuserDTO user,
			List<VirtualAccountsHasInvitationDTO> virtualAccountsHasInvitations) {
		super();
		this.consultantProfiles = consultantProfiles;
		this.employeeProfiles = employeeProfiles;
		this.company = company;
		this.user = user;
		this.virtualAccountsHasInvitations = virtualAccountsHasInvitations;
	}


	public List<VirtualAccountHasSkillDTO> getVirtualAccountHasSkills() {
		return virtualAccountHasSkills;
	}

	public void setVirtualAccountHasSkills(
			List<VirtualAccountHasSkillDTO> virtualAccountHasSkills) {
		this.virtualAccountHasSkills = virtualAccountHasSkills;
	}
	public List<ConsultantProfileDTO> getConsultantProfiles() {
		return this.consultantProfiles;
	}

	public void setConsultantProfiles(List<ConsultantProfileDTO> consultantProfiles) {
		this.consultantProfiles = consultantProfiles;
	}

	public ConsultantProfileDTO addConsultantProfile(ConsultantProfileDTO consultantProfile) {
		getConsultantProfiles().add(consultantProfile);
		consultantProfile.setVirtualAccount(this);

		return consultantProfile;
	}

	public ConsultantProfileDTO removeConsultantProfile(ConsultantProfileDTO consultantProfile) {
		getConsultantProfiles().remove(consultantProfile);
		consultantProfile.setVirtualAccount(null);

		return consultantProfile;
	}

	public List<EmployeeProfileDTO> getEmployeeProfiles() {
		return this.employeeProfiles;
	}

	public void setEmployeeProfiles(List<EmployeeProfileDTO> employeeProfiles) {
		this.employeeProfiles = employeeProfiles;
	}

	public EmployeeProfileDTO addEmployeeProfile(EmployeeProfileDTO employeeProfile) {
		getEmployeeProfiles().add(employeeProfile);
		employeeProfile.setVirtualAccount(this);

		return employeeProfile;
	}

	public EmployeeProfileDTO removeEmployeeProfile(EmployeeProfileDTO employeeProfile) {
		getEmployeeProfiles().remove(employeeProfile);
		employeeProfile.setVirtualAccount(null);

		return employeeProfile;
	}

	public CompanyCommonDTO getCompany() {
		return this.company;
	}

	public void setCompany(CompanyCommonDTO company) {
		this.company = company;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public List<VirtualAccountsHasInvitationDTO> getVirtualAccountsHasInvitations() {
		return this.virtualAccountsHasInvitations;
	}

	public void setVirtualAccountsHasInvitations(List<VirtualAccountsHasInvitationDTO> virtualAccountsHasInvitations) {
		this.virtualAccountsHasInvitations = virtualAccountsHasInvitations;
	}

	public VirtualAccountsHasInvitationDTO addVirtualAccountsHasInvitation(VirtualAccountsHasInvitationDTO virtualAccountsHasInvitation) {
		getVirtualAccountsHasInvitations().add(virtualAccountsHasInvitation);
		virtualAccountsHasInvitation.setVirtualAccount(this);

		return virtualAccountsHasInvitation;
	}

	public VirtualAccountsHasInvitationDTO removeVirtualAccountsHasInvitation(VirtualAccountsHasInvitationDTO virtualAccountsHasInvitation) {
		getVirtualAccountsHasInvitations().remove(virtualAccountsHasInvitation);
		virtualAccountsHasInvitation.setVirtualAccount(null);

		return virtualAccountsHasInvitation;
	}


	public ProfileTypeDTO getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileTypeDTO profileType) {
		this.profileType = profileType;
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