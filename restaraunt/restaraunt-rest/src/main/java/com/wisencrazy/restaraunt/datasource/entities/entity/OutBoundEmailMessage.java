package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: OutBoundEmailMessage
 *
 */
@Entity
@Table(name="outbound_email_message")
public class OutBoundEmailMessage extends AbsBaseEntity{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1392804752388445672L;

	public OutBoundEmailMessage() {
		
	}
	
	@Column(name="event_type")
	private String eventType;
   
	@Column(name="to_addresses")
	private String toAddresses;
	
	@Column(name="cc_addresses")
	private String ccAddresses;
	
	@Column(name="bcc_addresses")
	private String bccAddresses;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="from_address")
	private String fromAddress;
	
	@Column(name="status")
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	private Project project;

	@Column(name="message_id")
	private String messageId;
	
	@Column(name="remark")
	private String remark;
	
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getToAddresses() {
		return toAddresses;
	}

	public void setToAddresses(String toAddresses) {
		this.toAddresses = toAddresses;
	}

	public String getCcAddresses() {
		return ccAddresses;
	}

	public void setCcAddresses(String ccAddresses) {
		this.ccAddresses = ccAddresses;
	}

	public String getBccAddresses() {
		return bccAddresses;
	}

	public void setBccAddresses(String bccAddresses) {
		this.bccAddresses = bccAddresses;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String isMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String isRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
