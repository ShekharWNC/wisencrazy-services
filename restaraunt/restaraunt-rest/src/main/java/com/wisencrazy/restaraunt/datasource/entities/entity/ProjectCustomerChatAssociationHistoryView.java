package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.wisencrazy.restaraunt.datasource.entities.entity.ChatConversation.ChatConversationStatus;

@Entity
@Table(name = "vw_project_customer_chat_association_history")
@NamedQueries({ 
	@NamedQuery(name = ProjectCustomerChatAssociationHistoryView.FIND_BY_CUSTOMER_PROJECT, query = "select p from ProjectCustomerChatAssociationHistoryView p where p.customerSid=:custSid and p.projectSid=:projectSid "), 
	@NamedQuery(name = ProjectCustomerChatAssociationHistoryView.FIND_BY_PROJECT_SID, query = "select p from ProjectCustomerChatAssociationHistoryView p where p.projectSid=:projectSid order by p.lastMessageTime DESC "),
	@NamedQuery(name = ProjectCustomerChatAssociationHistoryView.FIND_BY_PROJECT_DATE, query = "select p from ProjectCustomerChatAssociationHistoryView p where p.projectSid=:projectSid and lastMesageTime >= :lastMessageTime"),
	@NamedQuery(name = ProjectCustomerChatAssociationHistoryView.FIND_BY_PROJECT_SID_AND_STATUS, query = "select p from ProjectCustomerChatAssociationHistoryView p where  p.projectSid=:projectSid and p.chatStatus=:status order by p.lastMessageTime DESC "),
	@NamedQuery(name = ProjectCustomerChatAssociationHistoryView.FIND_BY_PROJECT_SID_AND_CUSTOMER_NAME, query = "select p from ProjectCustomerChatAssociationHistoryView p where  p.projectSid=:projectSid and p.customerName like :name order by p.lastMessageTime DESC "),
	@NamedQuery(name = ProjectCustomerChatAssociationHistoryView.FIND_BY_CUSTOMER_SID, query = "select p from ProjectCustomerChatAssociationHistoryView p where p.customerSid =:customerSid order by p.lastMessageTime DESC ")
	})
public class ProjectCustomerChatAssociationHistoryView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7816824717000485481L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectCustomerChatAssociationHistoryView.";
	public static final String FIND_BY_CUSTOMER_PROJECT = PREFIX + "findByCustomerAndProject";
	public static final String FIND_BY_PROJECT_SID=PREFIX+"findByProjectSid";
	public static final String FIND_BY_PROJECT_DATE=PREFIX+"findByProjectDate";
	public static final String FIND_BY_PROJECT_SID_AND_STATUS=PREFIX+"findByProjectSidAndStatus";
	public static final String FIND_BY_PROJECT_SID_AND_CUSTOMER_NAME=PREFIX+"findByProjectSidAndCustomerName";
	public static final String FIND_BY_CUSTOMER_SID=PREFIX+"findByCustomerSid";
	

	@Id
	private String id;

	@Column(name = "project_id")
	private int projectId;

	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "project_sid")
	private String projectSid;

	@Column(name = "customer_sid")
	private String customerSid;

	@Column(name = "last_chat_session_id")
	private String lastChatSessionId;

	@Column(name = "last_message_from")
	private String lastMessageFrom;

	@Column(name = "last_message_time")
	private Timestamp lastMessageTime;

	@Column(name = "last_message_json")
	private String lastMessageJson;

	@Column(name = "email_id")
	private String customerEmailId;

	@Column(name = "primary_contact")
	private String customerPrimaryContact;

	@Column(name = "photo_id")
	private String photoUrl;

	@Column(name = "name")
	private String customerName;

    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private ChatConversationStatus chatStatus;
    
    @Column(name="agent_sid")
    private String agentSid;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLastChatSessionId() {
		return lastChatSessionId;
	}

	public void setLastChatSessionId(String lastChatSessionId) {
		this.lastChatSessionId = lastChatSessionId;
	}

	public String getLastMessageFrom() {
		return lastMessageFrom;
	}

	public void setLastMessageFrom(String lastMessageFrom) {
		this.lastMessageFrom = lastMessageFrom;
	}

	public Timestamp getLastMessageTime() {
		return lastMessageTime;
	}

	public void setLastMessageTime(Timestamp lastMessageTime) {
		this.lastMessageTime = lastMessageTime;
	}

	public String getLastMessageJson() {
		return lastMessageJson;
	}

	public void setLastMessageJson(String lastMessageJson) {
		this.lastMessageJson = lastMessageJson;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerPrimaryContact() {
		return customerPrimaryContact;
	}

	public void setCustomerPrimaryContact(String customerPrimaryContact) {
		this.customerPrimaryContact = customerPrimaryContact;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ChatConversationStatus getChatStatus() {
		return chatStatus;
	}

	public void setChatStatus(ChatConversationStatus chatStatus) {
		this.chatStatus = chatStatus;
	}

	public String getAgentSid() {
		return agentSid;
	}

	public void setAgentSid(String agentSid) {
		this.agentSid = agentSid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}



}
