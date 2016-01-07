package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the call_has_attachment database table.
 * 
 */
@Entity
@Table(name="call_has_attachment")
public class CallHasAttachment extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	public static final String DOWNLOADED="DOWNLOADED";
	public static final String DOWNLOADED_PROGRESS="DOWNLOADED-PROGRESS";
	public static final String DOWNLOADED_START="DOWNLOADED-START";
	public static final String DOWNLOADED_FAILED="DOWNLOADED-FAILED";
	
	public static final String UPLOADED="UPLOADED";
	public static final String UPLOADED_PROGRESS="UPLOADED-PROGRESS";
	public static final String UPLOADED_START="UPLOADED-START";
	public static final String UPLOADED_FAILED="UPLOADED-FAILED";
	

	@Column(name="conversation_id")
	private String conversationId;

	@Column(name="file_name")
	private String fileName;

	@Column(name="s3_url")
	private String s3Url;

	@Column(name="status")
	private String status;

	@Column(name="twilio_url")
	private String twilioUrl;

	@Column(name="virtual_call_sid")
	private String virtualCallSid;

	public CallHasAttachment() {
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getS3Url() {
		return this.s3Url;
	}

	public void setS3Url(String s3Url) {
		this.s3Url = s3Url;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTwilioUrl() {
		return this.twilioUrl;
	}

	public void setTwilioUrl(String twilioUrl) {
		this.twilioUrl = twilioUrl;
	}

	public String getVirtualCallSid() {
		return virtualCallSid;
	}

	public void setVirtualCallSid(String virtualCallSid) {
		this.virtualCallSid = virtualCallSid;
	}

	

}