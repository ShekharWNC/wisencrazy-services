package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.SignupType;



/**
 * The persistent class for the vw_basic_info database table.
 * 
 */
@Entity
@Table(name="vw_basic_info")
@NamedQueries({ @NamedQuery(name = BasicInfoView.FIND_EMAIL_BY_VIRTUAL_ACCOUNT_SID, query = "select bi.emailId from BasicInfoView bi where hex(bi.virtualAccountSid)=:virtualAccountSid") ,
				@NamedQuery(name = BasicInfoView.FIND_BASICINFO_BY_VIRTUAL_ACCOUNT_SID, query = "from BasicInfoView bi where hex(bi.virtualAccountSid)=:virtualAccountSid"),
				@NamedQuery(name = BasicInfoView.FIND_BY_EMAIL, query = "from BasicInfoView bi where bi.emailId = :emailId"),
				@NamedQuery(name = BasicInfoView.FIND_BY_ACTIVATION_TOKEN, query = "from BasicInfoView bi where bi.activationToken = :activationToken"),
				@NamedQuery(name = BasicInfoView.FIND_COMPANY_ROLE_BY_USERNAME, query = "select bi.companyRole from BasicInfoView bi where bi.emailId = :emailId"),
				@NamedQuery(name = BasicInfoView.FIND_AUTOAGENT_BY_COMPANY_SID, query = "from BasicInfoView bi where hex(bi.companySid) = :companySid and bi.agentType = 'AUTO_AGENT_USER' group by bi.companySid"),
				@NamedQuery(name = BasicInfoView.FIND_VIRTUALSID_BY_EMAIL, query = "select hex(bi.virtualAccountSid) from BasicInfoView bi where bi.emailId = :email")
})
public class BasicInfoView extends AbsCompositeEntity {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.BasicInfoView.";

	public static final String FIND_EMAIL_BY_VIRTUAL_ACCOUNT_SID = PREFIX+"findEmailByVirtualAccountSid";
	
	public static final String FIND_BASICINFO_BY_VIRTUAL_ACCOUNT_SID=PREFIX+"findBasicInfoViewByVirtualAccountSid";
	
	public static final String FIND_BY_EMAIL = PREFIX + "findByEmail";

	public static final String FIND_BY_ACTIVATION_TOKEN = PREFIX + "findByActivationToken";
	
	public static final String FIND_COMPANY_ROLE_BY_USERNAME = PREFIX + "findCompanyRoleByUsername";

	public static final String FIND_AUTOAGENT_BY_COMPANY_SID = PREFIX + "findAutoAgentByCompanySid";

	public static final String FIND_VIRTUALSID_BY_EMAIL = PREFIX + "findVirtualSidByEmail";

	@Id
	@Column(name="company_name")
	private String companyName;

	@Column(name="company_sid")
	private byte[] companySid;
	
	@Column(name = "company_id")
	private String companyId;

	@Column(name="virtual_account_sid")
	private byte[] virtualAccountSid;
	
	@Column(name = "agent_type")
	private String agentType;

	@Column(name="logo_url")
	private String logoUrl;

	@Column(name = "display_name")
	private String displayName;

	@Column(name="photo_url")
	private String photoUrl;

	@Column(name="project_name")
	private String projectName;
	
	@Column(name="project_id")
	private Integer projectId;

	@Column(name="project_sid")
	private byte[] projectSid;

	@Column(name = "username")
	private String emailId;
	
	@Column(name = "account_status")
	private String accountStatus;
	
	@Column(name = "activation_token")
	private String activationToken;
	
	@Column(name = "password")
	private String password;
	
	@Column(name="password_reset")
	private Boolean passwordReset;
	
	@Column(name="activation_token_expires_on")
	private Timestamp activationTokenExpiresOn;
	
	@Column(name = "primary_contact")
	private String primaryContact;
	
	@Column(name = "company_role_name")
	private String companyRole;
	
	@Column(name = "project_email")
	private String projectEmail;
	
    @Column(name = "setup_status")
	private boolean setupStatus;
    
    @Column(name = "signup_type")
    @Enumerated(EnumType.STRING)
    private SignupType signupType;
    
    @Column(name="dont_show")
	private boolean isShow;
    
	public BasicInfoView() {
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public byte[] getCompanySid() {
		return this.companySid;
	}

	public void setCompanySid(byte[] companySid) {
		this.companySid = companySid;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public byte[] getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(byte[] virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getAgentType() {
		return agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPhotoUrl() {
		return this.photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public byte[] getProjectSid() {
		return this.projectSid;
	}

	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String populateProjectSid(){
		if(projectSid != null){
			return bytesToHexStringBySid(projectSid);
		}
		return null;
	}
	
	public String populateCompanySid(){
		if(companySid != null){
			return bytesToHexStringBySid(companySid);
		}
		return null;
	}
	
	public String populateVirtualAccountSid(){
		if(virtualAccountSid != null){
			return bytesToHexStringBySid(virtualAccountSid);
		}
		return null;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getCompanyRole() {
		return companyRole;
	}

	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Boolean getPasswordReset() {
		return passwordReset;
	}

	public void setPasswordReset(Boolean passwordReset) {
		this.passwordReset = passwordReset;
	}

	public Timestamp getActivationTokenExpiresOn() {
		return activationTokenExpiresOn;
	}

	public void setActivationTokenExpiresOn(Timestamp activationTokenExpiresOn) {
		this.activationTokenExpiresOn = activationTokenExpiresOn;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getActivationToken() {
		return activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProjectEmail() {
		return projectEmail;
	}

	public void setProjectEmail(String projectEmail) {
		this.projectEmail = projectEmail;
	}

	public boolean isSetupStatus() {
		return setupStatus;
	}

	public void setSetupStatus(boolean setupStatus) {
		this.setupStatus = setupStatus;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	
}