package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the user_has_invitation database table.
 * 
 */
@Entity
@Table(name="user_has_invitation")
public class UserHasInvitation extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="email_sent_to")
	private String emailSentTo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="invitation_expiry_date")
	private Date invitationExpiryDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="invitation_sent_date")
	private Date invitationSentDate;

	@Column(name="invitation_status")
	private byte invitationStatus;

	@Column(name="invitation_type")
	private String invitationType;

	@Column(name="verification_token")
	private String verificationToken;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="invitation_sent_by")
	private Appuser appuser;

	//bi-directional many-to-one association to Company
	@ManyToOne(cascade = CascadeType.ALL)
	private Company company;

	//bi-directional many-to-one association to VirtualAccountHasInvitation
	/*@OneToMany(mappedBy="userHasInvitation")
	private List<VirtualAccountHasInvitation> virtualAccountHasInvitations;*/

	public UserHasInvitation() {
	}

	public String getEmailSentTo() {
		return this.emailSentTo;
	}

	public void setEmailSentTo(String emailSentTo) {
		this.emailSentTo = emailSentTo;
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

	public String getVerificationToken() {
		return this.verificationToken;
	}

	public void setVerificationToken(String verificationToken) {
		this.verificationToken = verificationToken;
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}