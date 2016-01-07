package com.wisencrazy.restaraunt.datasource.entities.entity;

import com.wisencrazy.restaraunt.datasource.entities.converter.ByteArrayStringConverter;
import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CampaignEvent
 *
 */
@Entity
@Table(name="campaign_event")
public class CampaignEvent extends AbsBaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8444146685468085277L;
	
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CampaignEvent.";
    
    public static final String UPDATE_OPENED_EMAIL_COUNT=PREFIX+"updateOpenedEmailCount";
	

	public CampaignEvent() {
		

	}
	
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="sent_on")
	private Date sentOn;
	
	@Column(name="sender_information")
	@Convert(converter = ByteArrayStringConverter.class)
	private String senderInformation;
	
	@Column(name="recipient_infomration")
	@Convert(converter = ByteArrayStringConverter.class)
	private String recipientInformation;
	@Column(name="sent_email_count")
	private Integer sentEmailCount;
	
	@Column(name="created_date")
	private Timestamp createdDate;

	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@OneToOne
	private Project	 project;
	
	@ManyToOne
	@JoinColumn(name = "virtual_account_id", nullable = false)
	private VirtualAccount virtualAccount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getSentOn() {
		return sentOn;
	}
	public void setSentOn(Date sentOn) {
		this.sentOn = sentOn;
	}
	public String getSenderInformation() {
		return senderInformation;
	}
	public void setSenderInformation(String senderInformation) {
		this.senderInformation = senderInformation;
	}
	public String getRecipientInformation() {
		return recipientInformation;
	}
	public void setRecipientInformation(String recipientInformation) {
		this.recipientInformation = recipientInformation;
	}
	public Integer getSentEmailCount() {
		return sentEmailCount;
	}
	public void setSentEmailCount(Integer sentEmailCount) {
		this.sentEmailCount = sentEmailCount;
	}
	
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
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
