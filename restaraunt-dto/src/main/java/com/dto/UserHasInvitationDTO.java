package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * The persistent class for the user_has_invitation database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasInvitationDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	public static String TYPE_FRIEND="FRIEND";
	public static String TYPE_CONSULTANT="CONSULTANT";
	public static String TYPE_EMPLOYEE="EMPLOYEE";
	private String emailSentTo;
	
	private String displayName;

	private Date invitationExpiryDate;

	private Date invitationSentDate;

	private byte invitationStatus;

	private String invitationType;

	//bi-directional many-to-one association to User
//	private UserDTO user;

	//bi-directional many-to-one association to VirtualAccountsHasInvitation
//	private List<VirtualAccountsHasInvitationDTO> virtualAccountsHasInvitations;
	
	private String verificationToken;
	
	//bi-directional many-to-one association to Company
	private CompanyDTO company;	
	
	private int userId;
	
	private int companyId;
	
	public UserHasInvitationDTO() {
	}

	public UserHasInvitationDTO(String emailSentTo,
			Date invitationExpiryDate, Date invitationSentDate,
			byte invitationStatus, String invitationType, //UserDTO user,
//			List<VirtualAccountsHasInvitationDTO> virtualAccountsHasInvitations,
			String verificationToken) {
		super();
		this.emailSentTo = emailSentTo;
		this.invitationExpiryDate = invitationExpiryDate;
		this.invitationSentDate = invitationSentDate;
		this.invitationStatus = invitationStatus;
		this.invitationType = invitationType;
//		this.user = user;
//		this.virtualAccountsHasInvitations = virtualAccountsHasInvitations;
		this.verificationToken = verificationToken;
	}

	public String getEmailSentTo() {
		return this.emailSentTo;
	}

	public void setEmailSentTo(String emailSentTo) {
		this.emailSentTo = emailSentTo;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getInvitationExpiryDate() {
		return this.invitationExpiryDate;
	}

	public void setInvitationExpiryDate(Date invitationExpiryDate) {
		this.invitationExpiryDate = invitationExpiryDate;
	}

	public Date getInvitationSentDate() {
		return this.invitationSentDate;
	}

	public void setInvitationSentDate(Date invitationSentDate) {
		this.invitationSentDate = invitationSentDate;
	}

	public byte getInvitationStatus() {
		return this.invitationStatus;
	}

	public void setInvitationStatus(byte invitationStatus) {
		this.invitationStatus = invitationStatus;
	}

	public String getInvitationType() {
		return this.invitationType;
	}

	public void setInvitationType(String invitationType) {
		this.invitationType = invitationType;
	}

	/*public UserDTO getUser() {
		return this.user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}*/

	/*public List<VirtualAccountsHasInvitationDTO> getVirtualAccountsHasInvitations() {
		return this.virtualAccountsHasInvitations;
	}

	public void setVirtualAccountsHasInvitations(List<VirtualAccountsHasInvitationDTO> virtualAccountsHasInvitations) {
		this.virtualAccountsHasInvitations = virtualAccountsHasInvitations;
	}

	public VirtualAccountsHasInvitationDTO addVirtualAccountsHasInvitation(VirtualAccountsHasInvitationDTO virtualAccountsHasInvitation) {
		getVirtualAccountsHasInvitations().add(virtualAccountsHasInvitation);
		virtualAccountsHasInvitation.setUserHasInvitation(this);

		return virtualAccountsHasInvitation;
	}

	public VirtualAccountsHasInvitationDTO removeVirtualAccountsHasInvitation(VirtualAccountsHasInvitationDTO virtualAccountsHasInvitation) {
		getVirtualAccountsHasInvitations().remove(virtualAccountsHasInvitation);
		virtualAccountsHasInvitation.setUserHasInvitation(null);

		return virtualAccountsHasInvitation;
	}*/

	public String getVerificationToken() {
		return verificationToken;
	}

	public void setVerificationToken(String verificationToken) {
		this.verificationToken = verificationToken;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
}
