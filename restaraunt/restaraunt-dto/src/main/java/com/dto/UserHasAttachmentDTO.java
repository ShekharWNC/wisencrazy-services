package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_attachments database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasAttachmentDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Attachment
	private AttachmentDTO attachment;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	public UserHasAttachmentDTO() {
	}

	public UserHasAttachmentDTO(AttachmentDTO attachment, AppuserDTO user) {
		super();
		this.attachment = attachment;
		this.user = user;
	}
	public AttachmentDTO getAttachment() {
		return this.attachment;
	}

	public void setAttachment(AttachmentDTO attachment) {
		this.attachment = attachment;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}