package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * The persistent class for the proposal_withdrawn_reason database table.
 * 
 */
@Entity
@Table(name="proposal_withdrawn_reason")
public class ProposalWithdrawnReason extends AbsCompositeEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="proposal_id")
	private int proposalId;

	@Column(name="withdraw_reason")
	private String withdrawReason;

	@Column(name="withdrawn_on")
	private Timestamp withdrawnOn;

	//bi-directional one-to-one association to Proposal
	@OneToOne
	@PrimaryKeyJoinColumn
	private Proposal proposal;

	public ProposalWithdrawnReason() {
	}

	public int getProposalId() {
		return this.proposalId;
	}

	public void setProposalId(int proposalId) {
		this.proposalId = proposalId;
	}

	public String getWithdrawReason() {
		return this.withdrawReason;
	}

	public void setWithdrawReason(String withdrawReason) {
		this.withdrawReason = withdrawReason;
	}

	public Timestamp getWithdrawnOn() {
		return this.withdrawnOn;
	}

	public void setWithdrawnOn(Timestamp withdrawnOn) {
		this.withdrawnOn = withdrawnOn;
	}

	public Proposal getProposal() {
		return this.proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}

}