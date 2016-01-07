package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the notification_details database table.
 * @author Vikash Pandey
 */
@Entity
@Table(name="notification_details")
public class NotifyMessageEntity extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1775148296828276860L;

	@Column(name="message")
	private String message;

	@Column(name="posted_date")
	private Timestamp postedDate;
	
	@Column(name = "priority")
	private String priority;
    
	@Column(name="message_status")
	private String messageStatus;
	
	@ManyToOne
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name="virtual_account_id", referencedColumnName="id")
	private VirtualAccount virtualAccount;

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

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public VirtualAccount getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(VirtualAccount virtualAccount) {
		this.virtualAccount = virtualAccount;
	}
}