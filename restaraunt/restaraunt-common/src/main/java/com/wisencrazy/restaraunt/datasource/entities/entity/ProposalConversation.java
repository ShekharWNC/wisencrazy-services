package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the proposal_conversation database table.
 * 
 */
@Entity
@Table(name="proposal_conversation")
public class ProposalConversation extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="conversation_date")
	private Timestamp conversationDate;

	@Column(name="conversation_from")
	private String conversationFrom;

	private String description;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="client_user_id", referencedColumnName = "id")
	private Appuser appuser1;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="provider_user_id", referencedColumnName = "id")
	private Appuser appuser2;

	//bi-directional many-to-one association to Proposal
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "proposal_id", referencedColumnName = "id")
	private Proposal proposal;

	//bi-directional many-to-one association to ProposalConversationHasAttachment
	/*@OneToMany(mappedBy="proposalConversation")
	private List<ProposalConversationHasAttachment> proposalConversationHasAttachments;*/

	public ProposalConversation() {
	}

	public Timestamp getConversationDate() {
		return this.conversationDate;
	}

	public void setConversationDate(Timestamp conversationDate) {
		this.conversationDate = conversationDate;
	}

	public String getConversationFrom() {
		return this.conversationFrom;
	}

	public void setConversationFrom(String conversationFrom) {
		this.conversationFrom = conversationFrom;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Appuser getAppuser1() {
		return this.appuser1;
	}

	public void setAppuser1(Appuser appuser1) {
		this.appuser1 = appuser1;
	}

	public Appuser getAppuser2() {
		return this.appuser2;
	}

	public void setAppuser2(Appuser appuser2) {
		this.appuser2 = appuser2;
	}

	public Proposal getProposal() {
		return this.proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}

	/*public List<ProposalConversationHasAttachment> getProposalConversationHasAttachments() {
		return this.proposalConversationHasAttachments;
	}

	public void setProposalConversationHasAttachments(List<ProposalConversationHasAttachment> proposalConversationHasAttachments) {
		this.proposalConversationHasAttachments = proposalConversationHasAttachments;
	}

	public ProposalConversationHasAttachment addProposalConversationHasAttachment(ProposalConversationHasAttachment proposalConversationHasAttachment) {
		getProposalConversationHasAttachments().add(proposalConversationHasAttachment);
		proposalConversationHasAttachment.setProposalConversation(this);

		return proposalConversationHasAttachment;
	}

	public ProposalConversationHasAttachment removeProposalConversationHasAttachment(ProposalConversationHasAttachment proposalConversationHasAttachment) {
		getProposalConversationHasAttachments().remove(proposalConversationHasAttachment);
		proposalConversationHasAttachment.setProposalConversation(null);

		return proposalConversationHasAttachment;
	}*/

}