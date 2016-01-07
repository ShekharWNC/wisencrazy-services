package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the job_proposal_audit_log database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobProposalAuditLogDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	//bi-directional many-to-one association to AuditLog
	private AuditLogDTO auditLog;

	//bi-directional many-to-one association to Job
	private JobDTO job;

	//bi-directional many-to-one association to Proposal
	private ProposalDTO proposal;

	public JobProposalAuditLogDTO() {
	}

	public JobProposalAuditLogDTO(AuditLogDTO auditLog, JobDTO job,
			ProposalDTO proposal) {
		super();
		this.auditLog = auditLog;
		this.job = job;
		this.proposal = proposal;
	}
	public AuditLogDTO getAuditLog() {
		return this.auditLog;
	}

	public void setAuditLog(AuditLogDTO auditLog) {
		this.auditLog = auditLog;
	}

	public JobDTO getJob() {
		return this.job;
	}

	public void setJob(JobDTO job) {
		this.job = job;
	}

	public ProposalDTO getProposal() {
		return this.proposal;
	}

	public void setProposal(ProposalDTO proposal) {
		this.proposal = proposal;
	}

}