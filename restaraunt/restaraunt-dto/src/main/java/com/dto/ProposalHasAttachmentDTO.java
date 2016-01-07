package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the proposal_has_attachments database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProposalHasAttachmentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Attachment
	private AttachmentDTO attachment;

	//bi-directional many-to-one association to Proposal
	private ProposalDTO proposal;

	public ProposalHasAttachmentDTO() {
	}

	public ProposalHasAttachmentDTO(AttachmentDTO attachment,
			ProposalDTO proposal) {
		super();
		this.attachment = attachment;
		this.proposal = proposal;
	}

	public AttachmentDTO getAttachment() {
		return this.attachment;
	}

	public void setAttachment(AttachmentDTO attachment) {
		this.attachment = attachment;
	}

	public ProposalDTO getProposal() {
		return this.proposal;
	}

	public void setProposal(ProposalDTO proposal) {
		this.proposal = proposal;
	}

}