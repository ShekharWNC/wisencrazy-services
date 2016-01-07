package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the proposal_conversation_has_attachments database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProposalConversationHasAttachmentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Attachment
	private AttachmentDTO attachment;

	//bi-directional many-to-one association to ProposalConversation
	private ProposalConversationDTO proposalConversation;

	public ProposalConversationHasAttachmentDTO(AttachmentDTO attachment,
			ProposalConversationDTO proposalConversation) {
		super();
		this.attachment = attachment;
		this.proposalConversation = proposalConversation;
	}

	public ProposalConversationHasAttachmentDTO() {
	}

	public AttachmentDTO getAttachment() {
		return this.attachment;
	}

	public void setAttachment(AttachmentDTO attachment) {
		this.attachment = attachment;
	}

	public ProposalConversationDTO getProposalConversation() {
		return this.proposalConversation;
	}

	public void setProposalConversation(ProposalConversationDTO proposalConversation) {
		this.proposalConversation = proposalConversation;
	}

}