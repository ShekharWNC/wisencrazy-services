package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "vw_virtual_account_has_messages")
public class VirtualAccountHasMessageView extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	
	@Column(name = "posted_date")
	private Timestamp postedDate;
	
	private String priority;
	
	@Column(name = "project_id")
	private int projectId;
	
	@Column(name = "virtual_account_id")
	private int virtualAccountId;
	
	@Column(name = "project_sid")
	private String projectSid;
	
	@Column(name = "virtual_account_sid")
	private String virtualAccountSid;
	
	@Column(name = "message_status")
	private String messageStatus;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Timestamp postedDate) {
		this.postedDate = postedDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getVirtualAccountId() {
		return virtualAccountId;
	}

	public void setVirtualAccountId(int virtualAccountId) {
		this.virtualAccountId = virtualAccountId;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

}
