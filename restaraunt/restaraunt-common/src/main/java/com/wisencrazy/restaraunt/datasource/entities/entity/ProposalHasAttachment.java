package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the proposal_has_attachments database table.
 * 
 */
@Entity
@Table(name="proposal_has_attachments")
public class ProposalHasAttachment extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Attachment
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "attachment_id", referencedColumnName = "id")
	private Attachment attachment;

	//bi-directional many-to-one association to Proposal
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proposal_id", referencedColumnName = "id")
	private Proposal proposal;

	public ProposalHasAttachment() {
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public Proposal getProposal() {
		return this.proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}

}