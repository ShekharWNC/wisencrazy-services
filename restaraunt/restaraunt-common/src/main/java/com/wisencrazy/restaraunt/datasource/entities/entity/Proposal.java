package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the proposal database table.
 * 
 */
@Entity
@Table(name="proposal")
public class Proposal extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_proposal")
	private Date dateOfProposal;

	private String description;

	@Column(name="expected_amount")
	private float expectedAmount;

	@Column(name="proposal_status_id")
	private String proposalStatusId;

	//bi-directional many-to-one association to JobHasProposal
	/*@OneToMany(mappedBy="proposal")
	private List<JobHasProposal> jobHasProposals;

	//bi-directional many-to-one association to JobProposalAuditLog
	@OneToMany(mappedBy="proposal")
	private List<JobProposalAuditLog> jobProposalAuditLogs;

	//bi-directional many-to-one association to Appuser
	@ManyToOne
	@JoinColumn(name="proposed_by")
	private Appuser appuser;

	//bi-directional many-to-one association to ProposalConversation
	@OneToMany(mappedBy="proposal")
	private List<ProposalConversation> proposalConversations;

	//bi-directional many-to-one association to ProposalHasAttachment
	@OneToMany(mappedBy="proposal")
	private List<ProposalHasAttachment> proposalHasAttachments;

	//bi-directional many-to-one association to ProposalHasEvent
	@OneToMany(mappedBy="proposal")
	private List<ProposalHasEvent> proposalHasEvents;*/

	//bi-directional one-to-one association to ProposalWithdrawnReason
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private ProposalWithdrawnReason proposalWithdrawnReason;

	public Proposal() {
	}

	public Date getDateOfProposal() {
		return this.dateOfProposal;
	}

	public void setDateOfProposal(Date dateOfProposal) {
		this.dateOfProposal = dateOfProposal;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getExpectedAmount() {
		return this.expectedAmount;
	}

	public void setExpectedAmount(float expectedAmount) {
		this.expectedAmount = expectedAmount;
	}

	public String getProposalStatusId() {
		return this.proposalStatusId;
	}

	public void setProposalStatusId(String proposalStatusId) {
		this.proposalStatusId = proposalStatusId;
	}

	/*public List<JobHasProposal> getJobHasProposals() {
		return this.jobHasProposals;
	}

	public void setJobHasProposals(List<JobHasProposal> jobHasProposals) {
		this.jobHasProposals = jobHasProposals;
	}

	public JobHasProposal addJobHasProposal(JobHasProposal jobHasProposal) {
		getJobHasProposals().add(jobHasProposal);
		jobHasProposal.setProposal(this);

		return jobHasProposal;
	}

	public JobHasProposal removeJobHasProposal(JobHasProposal jobHasProposal) {
		getJobHasProposals().remove(jobHasProposal);
		jobHasProposal.setProposal(null);

		return jobHasProposal;
	}

	public List<JobProposalAuditLog> getJobProposalAuditLogs() {
		return this.jobProposalAuditLogs;
	}

	public void setJobProposalAuditLogs(List<JobProposalAuditLog> jobProposalAuditLogs) {
		this.jobProposalAuditLogs = jobProposalAuditLogs;
	}

	public JobProposalAuditLog addJobProposalAuditLog(JobProposalAuditLog jobProposalAuditLog) {
		getJobProposalAuditLogs().add(jobProposalAuditLog);
		jobProposalAuditLog.setProposal(this);

		return jobProposalAuditLog;
	}

	public JobProposalAuditLog removeJobProposalAuditLog(JobProposalAuditLog jobProposalAuditLog) {
		getJobProposalAuditLogs().remove(jobProposalAuditLog);
		jobProposalAuditLog.setProposal(null);

		return jobProposalAuditLog;
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public List<ProposalConversation> getProposalConversations() {
		return this.proposalConversations;
	}

	public void setProposalConversations(List<ProposalConversation> proposalConversations) {
		this.proposalConversations = proposalConversations;
	}

	public ProposalConversation addProposalConversation(ProposalConversation proposalConversation) {
		getProposalConversations().add(proposalConversation);
		proposalConversation.setProposal(this);

		return proposalConversation;
	}

	public ProposalConversation removeProposalConversation(ProposalConversation proposalConversation) {
		getProposalConversations().remove(proposalConversation);
		proposalConversation.setProposal(null);

		return proposalConversation;
	}

	public List<ProposalHasAttachment> getProposalHasAttachments() {
		return this.proposalHasAttachments;
	}

	public void setProposalHasAttachments(List<ProposalHasAttachment> proposalHasAttachments) {
		this.proposalHasAttachments = proposalHasAttachments;
	}

	public ProposalHasAttachment addProposalHasAttachment(ProposalHasAttachment proposalHasAttachment) {
		getProposalHasAttachments().add(proposalHasAttachment);
		proposalHasAttachment.setProposal(this);

		return proposalHasAttachment;
	}

	public ProposalHasAttachment removeProposalHasAttachment(ProposalHasAttachment proposalHasAttachment) {
		getProposalHasAttachments().remove(proposalHasAttachment);
		proposalHasAttachment.setProposal(null);

		return proposalHasAttachment;
	}

	public List<ProposalHasEvent> getProposalHasEvents() {
		return this.proposalHasEvents;
	}

	public void setProposalHasEvents(List<ProposalHasEvent> proposalHasEvents) {
		this.proposalHasEvents = proposalHasEvents;
	}

	public ProposalHasEvent addProposalHasEvent(ProposalHasEvent proposalHasEvent) {
		getProposalHasEvents().add(proposalHasEvent);
		proposalHasEvent.setProposal(this);

		return proposalHasEvent;
	}

	public ProposalHasEvent removeProposalHasEvent(ProposalHasEvent proposalHasEvent) {
		getProposalHasEvents().remove(proposalHasEvent);
		proposalHasEvent.setProposal(null);

		return proposalHasEvent;
	}*/

	public ProposalWithdrawnReason getProposalWithdrawnReason() {
		return this.proposalWithdrawnReason;
	}

	public void setProposalWithdrawnReason(ProposalWithdrawnReason proposalWithdrawnReason) {
		this.proposalWithdrawnReason = proposalWithdrawnReason;
	}

}