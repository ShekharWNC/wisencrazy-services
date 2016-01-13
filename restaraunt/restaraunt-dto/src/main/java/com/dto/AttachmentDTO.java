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

	private AttachmentTypeDTO attachmentType;


	public AttachmentDTO() {
	}

	
	public AttachmentDTO(
			String attachmentName,
			String attachmentPath,
			AttachmentTypeDTO attachmentType) {
		super();
		this.attachmentName = attachmentName;
		this.attachmentPath = attachmentPath;
		this.attachmentType = attachmentType;
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


	@Override
	public String toString() {
		return "AttachmentDTO [attachmentName=" + attachmentName
				+ ", attachmentPath=" + attachmentPath + ", attachmentType="
				+ attachmentType  + "]";
	}

}