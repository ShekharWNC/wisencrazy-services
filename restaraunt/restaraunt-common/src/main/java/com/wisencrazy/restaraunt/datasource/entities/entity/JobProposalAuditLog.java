package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the job_proposal_audit_log database table.
 * 
 */
@Entity
@Table(name="job_proposal_audit_log")
public class JobProposalAuditLog extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to AuditLog
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="audit_log_id", referencedColumnName = "id")
	private AuditLog auditLog;

	//bi-directional many-to-one association to Job
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	private Job job;

	//bi-directional many-to-one association to Proposal
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proposal_id", referencedColumnName = "id")
	private Proposal proposal;

	public JobProposalAuditLog() {
	}

	public AuditLog getAuditLog() {
		return this.auditLog;
	}

	public void setAuditLog(AuditLog auditLog) {
		this.auditLog = auditLog;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Proposal getProposal() {
		return this.proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}

}