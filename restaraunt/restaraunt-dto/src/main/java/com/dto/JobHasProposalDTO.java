package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the job_has_proposals database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobHasProposalDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	//bi-directional many-to-one association to Job
	private JobDTO job;

	//bi-directional many-to-one association to Proposal
	private ProposalDTO proposal;

	public JobHasProposalDTO() {
	}

	public JobHasProposalDTO(JobDTO job, ProposalDTO proposal) {
		super();
		this.job = job;
		this.proposal = proposal;
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