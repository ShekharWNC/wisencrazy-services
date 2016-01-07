package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the job_has_proposals database table.
 * 
 */
@Entity
@Table(name="job_has_proposals")
public class JobHasProposal extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Job
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	private Job job;

	//bi-directional many-to-one association to Proposal
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proposal_id", referencedColumnName = "id")
	private Proposal proposal;

	public JobHasProposal() {
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