package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the attachment_type database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AttachmentTypeDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attachmentType;

	//bi-directional many-to-one association to Attachment
	private List<AttachmentDTO> attachments;

	public AttachmentTypeDTO() {
	}

	public AttachmentTypeDTO(String attachmentType,
			List<AttachmentDTO> attachments) {
		super();
		this.attachmentType = attachmentType;
		this.attachments = attachments;
	}
	public String getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public List<AttachmentDTO> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(List<AttachmentDTO> attachments) {
		this.attachments = attachments;
	}

	public AttachmentDTO addAttachment(AttachmentDTO attachment) {
		getAttachments().add(attachment);
		attachment.setAttachmentType(this);

		return attachment;
	}

	public AttachmentDTO removeAttachment(AttachmentDTO attachment) {
		getAttachments().remove(attachment);
		attachment.setAttachmentType(null);

		return attachment;
	}

	@Override
	public String toString() {
		return "AttachmentTypeDTO [attachmentType=" + attachmentType
				+ ", attachments=" + attachments + "]";
	}

}