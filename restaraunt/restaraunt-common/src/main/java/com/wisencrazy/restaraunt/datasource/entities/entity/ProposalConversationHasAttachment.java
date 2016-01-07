package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the proposal_conversation_has_attachments database table.
 * 
 */
@Entity
@Table(name="proposal_conversation_has_attachments")
public class ProposalConversationHasAttachment extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Attachment
	@ManyToOne
	private Attachment attachment;

	//bi-directional many-to-one association to ProposalConversation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="proposal_conversation_id", referencedColumnName = "id")
	private ProposalConversation proposalConversation;

	public ProposalConversationHasAttachment() {
	}

	public Attachment getAttachment() {
		return this.attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public ProposalConversation getProposalConversation() {
		return this.proposalConversation;
	}

	public void setProposalConversation(ProposalConversation proposalConversation) {
		this.proposalConversation = proposalConversation;
	}

}