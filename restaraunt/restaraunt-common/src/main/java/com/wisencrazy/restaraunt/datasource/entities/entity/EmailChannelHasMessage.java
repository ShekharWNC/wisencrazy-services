package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: EmailChannelHasMessage
 *
 */
@Entity
@Table(name="email_channel_has_message")
public class EmailChannelHasMessage extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String IN_PROGRESS="IN-PROGRESS";
	public static final String FAILED="FAILED";
	public static final String REJECTED="REJECTED";
	public static final String SUCCESS="SUCCESS";
	
	
	@Column(name="from_email")
	private String from;
	@Column(name="mail_json")
	private String mailJson;
	@Column(name="to_email")
	private String to;
	@Column(name="x_forwarded_to_email")
	private String xForwardedTo;
	@Column(name="status")
	private String status;
	@Column(name="conversation_id")
	private byte[] conversationId;
	@Column(name="cc")
	private String cc;
	
	@Column(name="subject")
	private String subject;

	@Column(name="remark")
	private String remark;
	
	public EmailChannelHasMessage() {
	}   
	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}   
	public String getMailJson() {
		return this.mailJson;
	}

	public void setMailJson(String mailJson) {
		this.mailJson = mailJson;
	}   
	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}   
	public String getXForwardedTo() {
		return this.xForwardedTo;
	}

	public void setXForwardedTo(String xForwardedTo) {
		this.xForwardedTo = xForwardedTo;
	}   
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}   
	public byte[] getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(byte[] conversationId) {
		this.conversationId = conversationId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
