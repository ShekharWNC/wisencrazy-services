package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the attachment database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AttachmentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attachmentName;

	private String attachmentPath;

	//bi-directional many-to-one association to AttachmentType
	private AttachmentTypeDTO attachmentType;

	//bi-directional many-to-one association to ProposalConversationHasAttachment
	private List<ProposalConversationHasAttachmentDTO> proposalConversationHasAttachments;

	//bi-directional many-to-one association to ProposalHasAttachment
	private List<ProposalHasAttachmentDTO> proposalHasAttachments;

	//bi-directional many-to-one association to UserHasAttachment
	private List<UserHasAttachmentDTO> userHasAttachments;

	public AttachmentDTO() {
	}

	
	public AttachmentDTO(
			String attachmentName,
			String attachmentPath,
			AttachmentTypeDTO attachmentType,
			List<ProposalConversationHasAttachmentDTO> proposalConversationHasAttachments,
			List<ProposalHasAttachmentDTO> proposalHasAttachments,
			List<UserHasAttachmentDTO> userHasAttachments) {
		super();
		this.attachmentName = attachmentName;
		this.attachmentPath = attachmentPath;
		this.attachmentType = attachmentType;
		this.proposalConversationHasAttachments = proposalConversationHasAttachments;
		this.proposalHasAttachments = proposalHasAttachments;
		this.userHasAttachments = userHasAttachments;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachmentPath() {
		return this.attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public AttachmentTypeDTO getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(AttachmentTypeDTO attachmentType) {
		this.attachmentType = attachmentType;
	}

	public List<ProposalConversationHasAttachmentDTO> getProposalConversationHasAttachments() {
		return this.proposalConversationHasAttachments;
	}

	public void setProposalConversationHasAttachments(List<ProposalConversationHasAttachmentDTO> proposalConversationHasAttachments) {
		this.proposalConversationHasAttachments = proposalConversationHasAttachments;
	}

	public ProposalConversationHasAttachmentDTO addProposalConversationHasAttachment(ProposalConversationHasAttachmentDTO proposalConversationHasAttachment) {
		getProposalConversationHasAttachments().add(proposalConversationHasAttachment);
		proposalConversationHasAttachment.setAttachment(this);

		return proposalConversationHasAttachment;
	}

	public ProposalConversationHasAttachmentDTO removeProposalConversationHasAttachment(ProposalConversationHasAttachmentDTO proposalConversationHasAttachment) {
		getProposalConversationHasAttachments().remove(proposalConversationHasAttachment);
		proposalConversationHasAttachment.setAttachment(null);

		return proposalConversationHasAttachment;
	}

	public List<ProposalHasAttachmentDTO> getProposalHasAttachments() {
		return this.proposalHasAttachments;
	}

	public void setProposalHasAttachments(List<ProposalHasAttachmentDTO> proposalHasAttachments) {
		this.proposalHasAttachments = proposalHasAttachments;
	}

	public ProposalHasAttachmentDTO addProposalHasAttachment(ProposalHasAttachmentDTO proposalHasAttachment) {
		getProposalHasAttachments().add(proposalHasAttachment);
		proposalHasAttachment.setAttachment(this);

		return proposalHasAttachment;
	}

	public ProposalHasAttachmentDTO removeProposalHasAttachment(ProposalHasAttachmentDTO proposalHasAttachment) {
		getProposalHasAttachments().remove(proposalHasAttachment);
		proposalHasAttachment.setAttachment(null);

		return proposalHasAttachment;
	}

	public List<UserHasAttachmentDTO> getUserHasAttachments() {
		return this.userHasAttachments;
	}

	public void setUserHasAttachments(List<UserHasAttachmentDTO> userHasAttachments) {
		this.userHasAttachments = userHasAttachments;
	}

	public UserHasAttachmentDTO addUserHasAttachment(UserHasAttachmentDTO userHasAttachment) {
		getUserHasAttachments().add(userHasAttachment);
		userHasAttachment.setAttachment(this);

		return userHasAttachment;
	}

	public UserHasAttachmentDTO removeUserHasAttachment(UserHasAttachmentDTO userHasAttachment) {
		getUserHasAttachments().remove(userHasAttachment);
		userHasAttachment.setAttachment(null);

		return userHasAttachment;
	}


	@Override
	public String toString() {
		return "AttachmentDTO [attachmentName=" + attachmentName
				+ ", attachmentPath=" + attachmentPath + ", attachmentType="
				+ attachmentType + ", proposalConversationHasAttachments="
				+ proposalConversationHasAttachments
				+ ", proposalHasAttachments=" + proposalHasAttachments
				+ ", userHasAttachments=" + userHasAttachments + "]";
	}

}