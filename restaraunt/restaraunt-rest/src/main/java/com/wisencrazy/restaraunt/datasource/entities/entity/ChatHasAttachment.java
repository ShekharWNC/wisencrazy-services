package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the chat_has_attachment database table.
 * 
 */
@Entity
@Table(name="chat_has_attachment")
public class ChatHasAttachment extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;


	@Column(name="content_type")
	private String contentType;

	@Column(name="conversation_id")
	private byte[] conversationId;

	@Column(name="extension")
	private String extension;

	@Column(name="file_name")
	private String fileName;

	@Column(name="file_size")
	private String fileSize;

	@Column(name="file_url")
	private String fileUrl;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fileType", referencedColumnName = "id")
	private AttachmentType attachmentType;
	
	@Column(name="status")
	private String status;

	public ChatHasAttachment() {
	}


	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public byte[] getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(byte[] conversationId) {
		this.conversationId = conversationId;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	

	public AttachmentType getAttachmentType() {
		return attachmentType;
	}


	public void setAttachmentType(AttachmentType attachmentType) {
		this.attachmentType = attachmentType;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}