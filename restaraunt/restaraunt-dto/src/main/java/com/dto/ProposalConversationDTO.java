package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the proposal_conversation database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProposalConversationDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String conversationFrom;

	private String description;

	//bi-directional many-to-one association to Proposal
	private ProposalDTO proposal;

	//bi-directional many-to-one association to User
	private AppuserDTO user1;

	//bi-directional many-to-one association to User
	private AppuserDTO user2;

	//bi-directional many-to-one association to ProposalConversationHasAttachment
	private List<ProposalConversationHasAttachmentDTO> proposalConversationHasAttachments;

	public ProposalConversationDTO() {
	}

	public ProposalConversationDTO(
			String conversationFrom,
			String description,
			ProposalDTO proposal,
			AppuserDTO user1,
			AppuserDTO user2,
			List<ProposalConversationHasAttachmentDTO> proposalConversationHasAttachments) {
		super();
		this.conversationFrom = conversationFrom;
		this.description = description;
		this.proposal = proposal;
		this.user1 = user1;
		this.user2 = user2;
		this.proposalConversationHasAttachments = proposalConversationHasAttachments;
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

	public ProposalDTO getProposal() {
		return this.proposal;
	}

	public void setProposal(ProposalDTO proposal) {
		this.proposal = proposal;
	}

	public AppuserDTO getUser1() {
		return this.user1;
	}

	public void setUser1(AppuserDTO user1) {
		this.user1 = user1;
	}

	public AppuserDTO getUser2() {
		return this.user2;
	}

	public void setUser2(AppuserDTO user2) {
		this.user2 = user2;
	}

	public List<ProposalConversationHasAttachmentDTO> getProposalConversationHasAttachments() {
		return this.proposalConversationHasAttachments;
	}

	public void setProposalConversationHasAttachments(List<ProposalConversationHasAttachmentDTO> proposalConversationHasAttachments) {
		this.proposalConversationHasAttachments = proposalConversationHasAttachments;
	}

	public ProposalConversationHasAttachmentDTO addProposalConversationHasAttachment(ProposalConversationHasAttachmentDTO proposalConversationHasAttachment) {
		getProposalConversationHasAttachments().add(proposalConversationHasAttachment);
		proposalConversationHasAttachment.setProposalConversation(this);

		return proposalConversationHasAttachment;
	}

	public ProposalConversationHasAttachmentDTO removeProposalConversationHasAttachment(ProposalConversationHasAttachmentDTO proposalConversationHasAttachment) {
		getProposalConversationHasAttachments().remove(proposalConversationHasAttachment);
		proposalConversationHasAttachment.setProposalConversation(null);

		return proposalConversationHasAttachment;
	}

}