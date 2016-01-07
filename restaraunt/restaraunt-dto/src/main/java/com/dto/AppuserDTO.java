package com.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * The persistent class for the user database table.
 * 
 */
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class AppuserDTO extends AppuserBasicsDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String STATUS_LOCKED="LOCKED";
	public static final String STATUS_ACTIVE="ACTIVE";
	public static final String STATUS_INACTIVE="INACTIVE";
	public static final String STATUS_REOPEN="REOPEN";
	public static final String STATUS_CLOSED="CLOSED";	
	private String accountStatus;
	private String activationToken;
	private String alternateEmailId;
	private Date activationTokenExpiresOn;
	private byte passwordReset;
	private String gender;
	
	private Date dateOfBirth;
	
	private String referenceThrough;
	
	private int basicProfileType;
	
	private String virtualAccountSid;
	
	private String companySid;
	
	private String companyName;
	
	//bi-directional many-to-one association to UserContact
	private List<UserContactDTO> userContacts;

	//bi-directional many-to-one association to UserHasAddress
	private List<UserHasAddressDTO> userHasAddresses;
	
	private List<UserHasSocialNetworkDTO> userHasSocialNetworks;

	/*//bi-directional many-to-one association to AuditLog
	private List<AuditLogDTO> auditLogs;

	//bi-directional many-to-one association to CalendarHasPermission
	private List<CalendarHasPermissionDTO> calendarHasPermissions;

	//bi-directional many-to-one association to Case
	private List<CaseDTO> cases;

	//bi-directional many-to-one association to ClientBusinessProfile
	private List<ClientBusinessProfileDTO> clientBuisnessProfiles;

	//bi-directional many-to-one association to GroupHasUser
	private List<GroupHasUserDTO> groupHasUsers;

	//bi-directional many-to-one association to Job
	private List<JobDTO> jobs;

	//bi-directional many-to-one association to ProjectUserHasRole
	private List<ProjectUserHasRoleDTO> projectUserHasRoles;

	//bi-directional many-to-one association to Proposal
	private List<ProposalDTO> proposals;

	//bi-directional many-to-one association to ProposalConversation
	private List<ProposalConversationDTO> proposalConversations1;

	//bi-directional many-to-one association to ProposalConversation
	private List<ProposalConversationDTO> proposalConversations2;

	//bi-directional many-to-one association to ProviderBuisnessProfile
	private List<ProviderBusinessProfileDTO> providerBusinessProfiles;

	//bi-directional many-to-one association to ProviderProfile
	private List<ProviderProfileDTO> providerProfiles;

	//bi-directional many-to-one association to Timesheet
	private List<TimesheetDTO> timesheets;

	//bi-directional many-to-one association to Timezone
	private TimezoneDTO timezone;

	//bi-directional many-to-one association to UserHasAttachment
	private List<UserHasAttachmentDTO> userHasAttachments;

	//bi-directional many-to-one association to UserHasCalendar
	private List<UserHasCalendarDTO> userHasCalendars;

	//bi-directional many-to-one association to UserHasExperience
	private List<UserHasExperienceDTO> userHasExperiences;

	//bi-directional many-to-one association to UserHasInvitation
	private List<UserHasInvitationDTO> userHasInvitations;


	//bi-directional many-to-one association to UserHasProfile
	private List<UserHasProfileDTO> userHasProfiles;

	//bi-directional many-to-one association to UserHasSecurityQuestion
	private List<UserHasSecurityQuestionDTO> userHasSecurityQuestions;

	//bi-directional many-to-one association to UserHasSetting
	private List<UserHasSettingDTO> userHasSettings;

	//bi-directional many-to-one association to UserHasSkill
	private List<UserHasSkillDTO> userHasSkills;*/

	//bi-directional many-to-one association to VirtualAccount
	//private List<VirtualAccountDTO> virtualAccounts;
	//bi-directional many-to-one association to Timezone
		
//	private List<AppuserHasSkillDTO> appuserHasSkillList;
	private CountryDTO country;
	private String facebookLink;
	
	private String twitterLink;
	
	private String linkedinLink;
	
	private int profileTypeId;
	
	public AppuserDTO() {
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getActivationToken() {
		return this.activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public String getAlternateEmailId() {
		return this.alternateEmailId;
	}

	public void setAlternateEmailId(String alternateEmailId) {
		this.alternateEmailId = alternateEmailId;
	}

	public byte getPasswordReset() {
		return this.passwordReset;
	}

	public void setPasswordReset(byte passwordReset) {
		this.passwordReset = passwordReset;
	}
	
	
	public List<UserContactDTO> getUserContacts() {
		return this.userContacts;
	}

	public void setUserContacts(List<UserContactDTO> userContacts) {
		this.userContacts = userContacts;
	}

	/*public UserContactDTO addUserContact(UserContactDTO userContact) {
		getUserContacts().add(userContact);
		userContact.setUser(this);

		return userContact;
	}

	public UserContactDTO removeUserContact(UserContactDTO userContact) {
		getUserContacts().remove(userContact);
		userContact.setUser(null);

		return userContact;
	}*/

	public List<UserHasAddressDTO> getUserHasAddresses() {
		return this.userHasAddresses;
	}

	public void setUserHasAddresses(List<UserHasAddressDTO> userHasAddresses) {
		this.userHasAddresses = userHasAddresses;
	}

	/*public UserHasAddressDTO addUserHasAddress(UserHasAddressDTO userHasAddress) {
		getUserHasAddresses().add(userHasAddress);
		userHasAddress.setUser(this);

		return userHasAddress;
	}

	public UserHasAddressDTO removeUserHasAddress(UserHasAddressDTO userHasAddress) {
		getUserHasAddresses().remove(userHasAddress);
		userHasAddress.setUser(null);

		return userHasAddress;
	}*/

	/*public List<AuditLogDTO> getAuditLogs() {
		return this.auditLogs;
	}

	public void setAuditLogs(List<AuditLogDTO> auditLogs) {
		this.auditLogs = auditLogs;
	}

	public AuditLogDTO addAuditLog(AuditLogDTO auditLog) {
		getAuditLogs().add(auditLog);
		auditLog.setUser(this);

		return auditLog;
	}

	public AuditLogDTO removeAuditLog(AuditLogDTO auditLog) {
		getAuditLogs().remove(auditLog);
		auditLog.setUser(null);

		return auditLog;
	}

	public List<CalendarHasPermissionDTO> getCalendarHasPermissions() {
		return this.calendarHasPermissions;
	}

	public void setCalendarHasPermissions(List<CalendarHasPermissionDTO> calendarHasPermissions) {
		this.calendarHasPermissions = calendarHasPermissions;
	}

	public CalendarHasPermissionDTO addCalendarHasPermission(CalendarHasPermissionDTO calendarHasPermission) {
		getCalendarHasPermissions().add(calendarHasPermission);
		calendarHasPermission.setUser(this);

		return calendarHasPermission;
	}

	public CalendarHasPermissionDTO removeCalendarHasPermission(CalendarHasPermissionDTO calendarHasPermission) {
		getCalendarHasPermissions().remove(calendarHasPermission);
		calendarHasPermission.setUser(null);

		return calendarHasPermission;
	}

	public List<CaseDTO> getCases() {
		return this.cases;
	}

	public void setCases(List<CaseDTO> cases) {
		this.cases = cases;
	}

	public CaseDTO addCas(CaseDTO cas) {
		getCases().add(cas);<?xml version="1.0" encoding="UTF-8"?>
<mappings xmlns="http://dozer.sourceforge.net" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://dozer.sourceforge.net http://dozer.sourceforge.net/schema/beanmapping.xsd">
	<mapping map-id="user">
		<class-a>com.callcomm.eserve.persistence.entity.Appuser</class-a>
		<class-b>com.dto.AppuserDTO</class-b>
		<field custom-converter-id="userconv" custom-converter-param="Appuser">
			<a>id</a>
			<b>sid</b>
		</field>
		<!-- <field> <a>sid</a> <b get-method="hexStringToByteArray">sid</b> </field> -->
		<field>
			<a>accountStatus</a>
			<b>accountStatus</b>
		</field>
		<field>
			<a>username</a>
			<b>emailId</b>
		</field>
		<field>
			<a>pass</a>
			<b>password</b>
		</field>
		<field>
			<a>country</a>
			<b>country</b>
		</field>
	</mapping>

	<mapping map-id="userdto" type="one-way">
		<class-a>com.callcomm.eserve.persistence.entity.Appuser</class-a>
		<class-b>com.dto.AppuserDTO</class-b>
		<!-- <field-exclude> <a>id</a> <b>id</b> </field-exclude> <field> <a get-method="bytesToHexString">sid</a> 
			<b>sid</b> </field> -->
		<field>
			<a>accountStatus</a>
			<b>accountStatus</b>
		</field>
		<field>
			<a>username</a>
			<b>emailId</b>
		</field>
		<field>
			<a>pass</a>
			<b>password</b>
		</field>
		<field>
			<a>country</a>
			<b>country</b>
		</field>
	</mapping>


	<!-- <mapping wildcard="false" map-id="userdefault"> <class-a>com.callcomm.eserve.persistence.entity.Appuser</class-a> 
		<class-b>com.dto.AppuserDTO</class-b> <field>id</field> <field>id</field> 
		</mapping> -->

	<mapping map-id="userex">
		<class-a>com.callcomm.eserve.persistence.entity.Appuser</class-a>
		<class-b>com.dto.AppuserDTO</class-b>
		<field-exclude>
			<a>userHasAddresses</a>
			<b>userHasAddresses</b>
		</field-exclude>

		<field-exclude>
			<a>userContacts</a>
			<b>userContacts</b>
		</field-exclude>
		<field-exclude>
			<a>pass</a>
			<b>password</b>
		</field-exclude>
	</mapping>

	<mapping map-id="userid" wildcard="false">
		<class-a>com.callcomm.eserve.persistence.entity.Appuser</class-a>
		<class-b>com.dto.AppuserDTO</class-b>
		<field>
			<a>id</a>
			<b>id</b>
		</field>
	</mapping>
	<mapping>
		<class-a>com.dto.AppuserDTO</class-a>
		<class-b>com.callcomm.eserve.persistence.entity.Appuser</class-b>
		<field>
			<a>emailId</a>
			<b>username</b>
		</field>
	</mapping>
	<mapping>
		<class-a>com.callcomm.eserve.persistence.entity.Appuser</class-a>
		<class-b>com.dto.AppuserBasicsDTO</class-b>
	</mapping>
</mappings>

		cas.setUser(this);

		return cas;
	}

	public CaseDTO removeCas(CaseDTO cas) {
		getCases().remove(cas);
		cas.setUser(null);

		return cas;
	}

	public List<ClientBusinessProfileDTO> getClientBusinessProfiles() {
		return this.clientBuisnessProfiles;
	}

	public void setClientBusinessProfiles(List<ClientBusinessProfileDTO> clientBuisnessProfiles) {
		this.clientBuisnessProfiles = clientBuisnessProfiles;
	}

	public ClientBusinessProfileDTO addClientBusinessProfile(ClientBusinessProfileDTO clientBuisnessProfile) {
		getClientBusinessProfiles().add(clientBuisnessProfile);
		clientBuisnessProfile.setUser(this);

		return clientBuisnessProfile;
	}

	public ClientBusinessProfileDTO removeClientBusinessProfile(ClientBusinessProfileDTO clientBuisnessProfile) {
		getClientBusinessProfiles().remove(clientBuisnessProfile);
		clientBuisnessProfile.setUser(null);

		return clientBuisnessProfile;
	}

	public List<GroupHasUserDTO> getGroupHasUsers() {
		return this.groupHasUsers;
	}

	public void setGroupHasUsers(List<GroupHasUserDTO> groupHasUsers) {
		this.groupHasUsers = groupHasUsers;
	}

	public GroupHasUserDTO addGroupHasUser(GroupHasUserDTO groupHasUser) {
		getGroupHasUsers().add(groupHasUser);
		groupHasUser.setUser(this);

		return groupHasUser;
	}

	public GroupHasUserDTO removeGroupHasUser(GroupHasUserDTO groupHasUser) {
		getGroupHasUsers().remove(groupHasUser);
		groupHasUser.setUser(null);

		return groupHasUser;
	}

	public List<JobDTO> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<JobDTO> jobs) {
		this.jobs = jobs;
	}

	public JobDTO addJob(JobDTO job) {
		getJobs().add(job);
		job.setUser(this);

		return job;
	}

	public JobDTO removeJob(JobDTO job) {
		getJobs().remove(job);
		job.setUser(null);

		return job;
	}

	public List<ProjectUserHasRoleDTO> getProjectUserHasRoles() {
		return this.projectUserHasRoles;
	}

	public void setProjectUserHasRoles(List<ProjectUserHasRoleDTO> projectUserHasRoles) {
		this.projectUserHasRoles = projectUserHasRoles;
	}

	public ProjectUserHasRoleDTO addProjectUserHasRole(ProjectUserHasRoleDTO projectUserHasRole) {
		getProjectUserHasRoles().add(projectUserHasRole);
		projectUserHasRole.setUser(this);

		return projectUserHasRole;
	}

	public ProjectUserHasRoleDTO removeProjectUserHasRole(ProjectUserHasRoleDTO projectUserHasRole) {
		getProjectUserHasRoles().remove(projectUserHasRole);
		projectUserHasRole.setUser(null);

		return projectUserHasRole;
	}

	public List<ProposalDTO> getProposals() {
		return this.proposals;
	}

	public void setProposals(List<ProposalDTO> proposals) {
		this.proposals = proposals;
	}

	public ProposalDTO addProposal(ProposalDTO proposal) {
		getProposals().add(proposal);
		proposal.setUser(this);

		return proposal;
	}

	public ProposalDTO removeProposal(ProposalDTO proposal) {
		getProposals().remove(proposal);
		proposal.setUser(null);

		return proposal;
	}

	public List<ProposalConversationDTO> getProposalConversations1() {
		return this.proposalConversations1;
	}

	public void setProposalConversations1(List<ProposalConversationDTO> proposalConversations1) {
		this.proposalConversations1 = proposalConversations1;
	}

	public ProposalConversationDTO addProposalConversations1(ProposalConversationDTO proposalConversations1) {
		getProposalConversations1().add(proposalConversations1);
		proposalConversations1.setUser1(this);

		return proposalConversations1;
	}

	public ProposalConversationDTO removeProposalConversations1(ProposalConversationDTO proposalConversations1) {
		getProposalConversations1().remove(proposalConversations1);
		proposalConversations1.setUser1(null);

		return proposalConversations1;
	}

	public List<ProposalConversationDTO> getProposalConversations2() {
		return this.proposalConversations2;
	}

	public void setProposalConversations2(List<ProposalConversationDTO> proposalConversations2) {
		this.proposalConversations2 = proposalConversations2;
	}

	public ProposalConversationDTO addProposalConversations2(ProposalConversationDTO proposalConversations2) {
		getProposalConversations2().add(proposalConversations2);
		proposalConversations2.setUser2(this);

		return proposalConversations2;
	}

	public ProposalConversationDTO removeProposalConversations2(ProposalConversationDTO proposalConversations2) {
		getProposalConversations2().remove(proposalConversations2);
		proposalConversations2.setUser2(null);

		return proposalConversations2;
	}

	public List<ProviderBusinessProfileDTO> getProviderBusinessProfiles() {
		return this.providerBusinessProfiles;
	}

	public void setProviderBusinessProfiles(List<ProviderBusinessProfileDTO> providerBusinessProfiles) {
		this.providerBusinessProfiles = providerBusinessProfiles;
	}

	public ProviderBusinessProfileDTO addProviderBuisnessProfile(ProviderBusinessProfileDTO providerBuisnessProfile) {
		getProviderBusinessProfiles().add(providerBuisnessProfile);
		providerBuisnessProfile.setUser(this);

		return providerBuisnessProfile;
	}

	public ProviderBusinessProfileDTO removeProviderBuisnessProfile(ProviderBusinessProfileDTO providerBuisnessProfile) {
		getProviderBusinessProfiles().remove(providerBuisnessProfile);
		providerBuisnessProfile.setUser(null);

		return providerBuisnessProfile;
	}

	public List<ProviderProfileDTO> getProviderProfiles() {
		return this.providerProfiles;
	}

	public void setProviderProfiles(List<ProviderProfileDTO> providerProfiles) {
		this.providerProfiles = providerProfiles;
	}

	public ProviderProfileDTO addProviderProfile(ProviderProfileDTO providerProfile) {
		getProviderProfiles().add(providerProfile);
		providerProfile.setUser(this);

		return providerProfile;
	}

	public ProviderProfileDTO removeProviderProfile(ProviderProfileDTO providerProfile) {
		getProviderProfiles().remove(providerProfile);
		providerProfile.setUser(null);

		return providerProfile;
	}

	public List<TimesheetDTO> getTimesheets() {
		return this.timesheets;
	}

	public void setTimesheets(List<TimesheetDTO> timesheets) {
		this.timesheets = timesheets;
	}

	public TimesheetDTO addTimesheet(TimesheetDTO timesheet) {
		getTimesheets().add(timesheet);
		timesheet.setUser(this);

		return timesheet;
	}

	public TimesheetDTO removeTimesheet(TimesheetDTO timesheet) {
		getTimesheets().remove(timesheet);
		timesheet.setUser(null);

		return timesheet;
	}

	public TimezoneDTO getTimezone() {
		return this.timezone;
	}

	public void setTimezone(TimezoneDTO timezone) {
		this.timezone = timezone;
	}

	

	public List<UserHasAttachmentDTO> getUserHasAttachments() {
		return this.userHasAttachments;
	}

	public void setUserHasAttachments(List<UserHasAttachmentDTO> userHasAttachments) {
		this.userHasAttachments = userHasAttachments;
	}

	public UserHasAttachmentDTO addUserHasAttachment(UserHasAttachmentDTO userHasAttachment) {
		getUserHasAttachments().add(userHasAttachment);
		userHasAttachment.setUser(this);

		return userHasAttachment;
	}

	public UserHasAttachmentDTO removeUserHasAttachment(UserHasAttachmentDTO userHasAttachment) {
		getUserHasAttachments().remove(userHasAttachment);
		userHasAttachment.setUser(null);

		return userHasAttachment;
	}

	public List<UserHasCalendarDTO> getUserHasCalendars() {
		return this.userHasCalendars;
	}

	public void setUserHasCalendars(List<UserHasCalendarDTO> userHasCalendars) {
		this.userHasCalendars = userHasCalendars;
	}

	public UserHasCalendarDTO addUserHasCalendar(UserHasCalendarDTO userHasCalendar) {
		getUserHasCalendars().add(userHasCalendar);
		userHasCalendar.setUser(this);

		return userHasCalendar;
	}

	public UserHasCalendarDTO removeUserHasCalendar(UserHasCalendarDTO userHasCalendar) {
		getUserHasCalendars().remove(userHasCalendar);
		userHasCalendar.setUser(null);

		return userHasCalendar;
	}

	public List<UserHasExperienceDTO> getUserHasExperiences() {
		return this.userHasExperiences;
	}

	public void setUserHasExperiences(List<UserHasExperienceDTO> userHasExperiences) {
		this.userHasExperiences = userHasExperiences;
	}

	public UserHasExperienceDTO addUserHasExperience(UserHasExperienceDTO userHasExperience) {
		getUserHasExperiences().add(userHasExperience);
		userHasExperience.setUser(this);

		return userHasExperience;
	}

	public UserHasExperienceDTO removeUserHasExperience(UserHasExperienceDTO userHasExperience) {
		getUserHasExperiences().remove(userHasExperience);
		userHasExperience.setUser(null);

		return userHasExperience;
	}

	public List<UserHasInvitationDTO> getUserHasInvitations() {
		return this.userHasInvitations;
	}

	public void setUserHasInvitations(List<UserHasInvitationDTO> userHasInvitations) {
		this.userHasInvitations = userHasInvitations;
	}

	public UserHasInvitationDTO addUserHasInvitation(UserHasInvitationDTO userHasInvitation) {
		getUserHasInvitations().add(userHasInvitation);
		userHasInvitation.setUser(this);

		return userHasInvitation;
	}

	public UserHasInvitationDTO removeUserHasInvitation(UserHasInvitationDTO userHasInvitation) {
		getUserHasInvitations().remove(userHasInvitation);
		userHasInvitation.setUser(null);

		return userHasInvitation;
	}

	public List<UserHasProfileDTO> getUserHasProfiles() {
		return this.userHasProfiles;
	}

	public void setUserHasProfiles(List<UserHasProfileDTO> userHasProfiles) {
		this.userHasProfiles = userHasProfiles;
	}

	public UserHasProfileDTO addUserHasProfile(UserHasProfileDTO userHasProfile) {
		getUserHasProfiles().add(userHasProfile);
		userHasProfile.setUser(this);

		return userHasProfile;
	}

	public UserHasProfileDTO removeUserHasProfile(UserHasProfileDTO userHasProfile) {
		getUserHasProfiles().remove(userHasProfile);
		userHasProfile.setUser(null);

		return userHasProfile;
	}

	public List<UserHasSecurityQuestionDTO> getUserHasSecurityQuestions() {
		return this.userHasSecurityQuestions;
	}

	public void setUserHasSecurityQuestions(List<UserHasSecurityQuestionDTO> userHasSecurityQuestions) {
		this.userHasSecurityQuestions = userHasSecurityQuestions;
	}

	public UserHasSecurityQuestionDTO addUserHasSecurityQuestion(UserHasSecurityQuestionDTO userHasSecurityQuestion) {
		getUserHasSecurityQuestions().add(userHasSecurityQuestion);
		userHasSecurityQuestion.setUser(this);

		return userHasSecurityQuestion;
	}

	public UserHasSecurityQuestionDTO removeUserHasSecurityQuestion(UserHasSecurityQuestionDTO userHasSecurityQuestion) {
		getUserHasSecurityQuestions().remove(userHasSecurityQuestion);
		userHasSecurityQuestion.setUser(null);

		return userHasSecurityQuestion;
	}

	public List<UserHasSettingDTO> getUserHasSettings() {
		return this.userHasSettings;
	}

	public void setUserHasSettings(List<UserHasSettingDTO> userHasSettings) {
		this.userHasSettings = userHasSettings;
	}

	public UserHasSettingDTO addUserHasSetting(UserHasSettingDTO userHasSetting) {
		getUserHasSettings().add(userHasSetting);
		userHasSetting.setUser(this);

		return userHasSetting;
	}

	public UserHasSettingDTO removeUserHasSetting(UserHasSettingDTO userHasSetting) {
		getUserHasSettings().remove(userHasSetting);
		userHasSetting.setUser(null);

		return userHasSetting;
	}

	public List<UserHasSkillDTO> getUserHasSkills() {
		return this.userHasSkills;
	}

	public void setUserHasSkills(List<UserHasSkillDTO> userHasSkills) {
		this.userHasSkills = userHasSkills;
	}

	public UserHasSkillDTO addUserHasSkill(UserHasSkillDTO userHasSkill) {
		getUserHasSkills().add(userHasSkill);
		userHasSkill.setUser(this);

		return userHasSkill;
	}

	public UserHasSkillDTO removeUserHasSkill(UserHasSkillDTO userHasSkill) {
		getUserHasSkills().remove(userHasSkill);
		userHasSkill.setUser(null);

		return userHasSkill;
	}

	public List<VirtualAccountDTO> getVirtualAccounts() {
		return this.virtualAccounts;
	}

	public void setVirtualAccounts(List<VirtualAccountDTO> virtualAccounts) {
		this.virtualAccounts = virtualAccounts;
	}

	public VirtualAccountDTO addVirtualAccount(VirtualAccountDTO virtualAccount) {
		getVirtualAccounts().add(virtualAccount);
		virtualAccount.setUser(this);

		return virtualAccount;
	}

	public VirtualAccountDTO removeVirtualAccount(VirtualAccountDTO virtualAccount) {
		getVirtualAccounts().remove(virtualAccount);
		virtualAccount.setUser(null);

		return virtualAccount;
	}*/

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getReferenceThrough() {
		return referenceThrough;
	}

	public void setReferenceThrough(String referenceThrough) {
		this.referenceThrough = referenceThrough;
	}

	public Date getActivationTokenExpiresOn() {
		return activationTokenExpiresOn;
	}

	public void setActivationTokenExpiresOn(Date activationTokenExpiresOn) {
		this.activationTokenExpiresOn = activationTokenExpiresOn;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getTwitterLink() {
		return twitterLink;
	}

	public void setTwitterLink(String twitterLink) {
		this.twitterLink = twitterLink;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public int getProfileTypeId() {
		return profileTypeId;
	}

	public void setProfileTypeId(int profileTypeId) {
		this.profileTypeId = profileTypeId;
	}

	public int getBasicProfileType() {
		return basicProfileType;
	}

	public void setBasicProfileType(int basicProfileType) {
		this.basicProfileType = basicProfileType;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getCompanySid() {
		return companySid;
	}


	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<UserHasSocialNetworkDTO> getUserHasSocialNetworks() {
		return userHasSocialNetworks;
	}

	public void setUserHasSocialNetworks(
			List<UserHasSocialNetworkDTO> userHasSocialNetworks) {
		this.userHasSocialNetworks = userHasSocialNetworks;
	}
    @Override
	public String getPublicName() {
		return publicName;
	}
    @Override
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
 
    /*public List<AppuserHasSkillDTO> getAppuserHasSkillList() {
		return appuserHasSkillList;
	}

	public void setAppuserHasSkillList(List<AppuserHasSkillDTO> appuserHasSkillList) {
		this.appuserHasSkillList = appuserHasSkillList;
	}*/
}