package com.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the proposal database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProposalDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String PROPOSAL_SAVED="SAVED";
    public static final String PROPOSAL_PROPOSED="PROPOSED";
    public static final String PROPOSAL_DECLINED="DECLINED";
    public static final String PROPOSAL_APPROVED="APPROVED";
    public static final String PROPOSAL_WITHDRAWN="WITHDRAWN";
        

	private Date dateOfProposal;

	private String description;

	private float expectedAmount;

	private String proposalStatus;

    private ProposalWithdrawnReasonDTO proposalWithdrawnReason;
        
    //bi-directional many-to-one association to JobHasProposal
	private List<JobHasProposalDTO> jobHasProposals;

	//bi-directional many-to-one association to JobProposalAuditLog
	private List<JobProposalAuditLogDTO> jobProposalAuditLogs;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	//bi-directional many-to-one association to ProposalConversation
	private List<ProposalConversationDTO> proposalConversations;

	//bi-directional many-to-one association to ProposalHasAttachment
	private List<ProposalHasAttachmentDTO> proposalHasAttachments;

	//bi-directional many-to-one association to ProposalHasEvent
	private List<ProposalHasEventDTO> proposalHasEvents;

	public ProposalDTO() {
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

	public List<JobHasProposalDTO> getJobHasProposals() {
		return this.jobHasProposals;
	}

	public void setJobHasProposals(List<JobHasProposalDTO> jobHasProposals) {
		this.jobHasProposals = jobHasProposals;
	}

	public JobHasProposalDTO addJobHasProposal(JobHasProposalDTO jobHasProposal) {
		getJobHasProposals().add(jobHasProposal);
		jobHasProposal.setProposal(this);

		return jobHasProposal;
	}

	public JobHasProposalDTO removeJobHasProposal(JobHasProposalDTO jobHasProposal) {
		getJobHasProposals().remove(jobHasProposal);
		jobHasProposal.setProposal(null);

		return jobHasProposal;
	}

	public List<JobProposalAuditLogDTO> getJobProposalAuditLogs() {
		return this.jobProposalAuditLogs;
	}

	public void setJobProposalAuditLogs(List<JobProposalAuditLogDTO> jobProposalAuditLogs) {
		this.jobProposalAuditLogs = jobProposalAuditLogs;
	}

	public JobProposalAuditLogDTO addJobProposalAuditLog(JobProposalAuditLogDTO jobProposalAuditLog) {
		getJobProposalAuditLogs().add(jobProposalAuditLog);
		jobProposalAuditLog.setProposal(this);

		return jobProposalAuditLog;
	}

	public JobProposalAuditLogDTO removeJobProposalAuditLog(JobProposalAuditLogDTO jobProposalAuditLog) {
		getJobProposalAuditLogs().remove(jobProposalAuditLog);
		jobProposalAuditLog.setProposal(null);

		return jobProposalAuditLog;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public List<ProposalConversationDTO> getProposalConversations() {
		return this.proposalConversations;
	}

	public void setProposalConversations(List<ProposalConversationDTO> proposalConversations) {
		this.proposalConversations = proposalConversations;
	}

	public ProposalConversationDTO addProposalConversation(ProposalConversationDTO proposalConversation) {
		getProposalConversations().add(proposalConversation);
		proposalConversation.setProposal(this);

		return proposalConversation;
	}

	public ProposalConversationDTO removeProposalConversation(ProposalConversationDTO proposalConversation) {
		getProposalConversations().remove(proposalConversation);
		proposalConversation.setProposal(null);

		return proposalConversation;
	}

	public List<ProposalHasAttachmentDTO> getProposalHasAttachments() {
		return this.proposalHasAttachments;
	}

	public void setProposalHasAttachments(List<ProposalHasAttachmentDTO> proposalHasAttachments) {
		this.proposalHasAttachments = proposalHasAttachments;
	}

	public ProposalHasAttachmentDTO addProposalHasAttachment(ProposalHasAttachmentDTO proposalHasAttachment) {
		getProposalHasAttachments().add(proposalHasAttachment);
		proposalHasAttachment.setProposal(this);

		return proposalHasAttachment;
	}

	public ProposalHasAttachmentDTO removeProposalHasAttachment(ProposalHasAttachmentDTO proposalHasAttachment) {
		getProposalHasAttachments().remove(proposalHasAttachment);
		proposalHasAttachment.setProposal(null);

		return proposalHasAttachment;
	}

	public List<ProposalHasEventDTO> getProposalHasEvents() {
		return this.proposalHasEvents;
	}

	public void setProposalHasEvents(List<ProposalHasEventDTO> proposalHasEvents) {
		this.proposalHasEvents = proposalHasEvents;
	}

	public ProposalHasEventDTO addProposalHasEvent(ProposalHasEventDTO proposalHasEvent) {
		getProposalHasEvents().add(proposalHasEvent);
		proposalHasEvent.setProposal(this);

		return proposalHasEvent;
	}

	public ProposalHasEventDTO removeProposalHasEvent(ProposalHasEventDTO proposalHasEvent) {
		getProposalHasEvents().remove(proposalHasEvent);
		proposalHasEvent.setProposal(null);

		return proposalHasEvent;
	}
        public String getProposalStatus() {
            return proposalStatus;
        }

        public void setProposalStatus(String proposalStatus) {
            this.proposalStatus = proposalStatus;
        }

        public ProposalWithdrawnReasonDTO getProposalWithdrawnReason() {
            return proposalWithdrawnReason;
        }

        public void setProposalWithdrawnReason(ProposalWithdrawnReasonDTO proposalWithdrawnReason) {
            this.proposalWithdrawnReason = proposalWithdrawnReason;
        }
}