package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.wisencrazy.restaraunt.datasource.entities.entity.ChatConversation.ChatConversationStatus;

@Entity
@Table(name="project_customer_chat_association_history")
@NamedQueries({
	@NamedQuery(name=ProjectCustomerChatAssociationHistory.FIND_BY_CUSTOMER_PROJECT,query="select pca from ProjectCustomerChatAssociationHistory pca join pca.customer c  join pca.project p where c.sid=unhex(:custSid) and p.sid=unhex(:projectSid) "),
	@NamedQuery(name=ProjectCustomerChatAssociationHistory.FIND_BY_CHAT_ID,query="select p from ProjectCustomerChatAssociationHistory p where p.lastChatSessionId=:chatId "),
})
public class ProjectCustomerChatAssociationHistory  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 272917266558365586L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectCustomerChatAssociationHistory.";
    public static final String FIND_BY_CUSTOMER_PROJECT = PREFIX + "findByCustomerAndProject";
    public static final String FIND_BY_CHAT_ID=PREFIX+"findByChatId";

	@EmbeddedId
	private ProjectCustomerChatAssociationHistoryPK associationHistoryPK;
	
	@Column(name="last_chat_session_id")
	@Basic(optional=false)
	private String lastChatSessionId;
	
	@Column(name="last_message_time")
	private Timestamp lastMessageTime;
	
	@Column(name="last_message_from")
	private String lastMessageFromSid;
	
	@Column(name="last_message_json")
	private String lastMessageJson;
	
	@JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Customer customer;
	
    @JoinColumn(name = "project_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Project project;
    
    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private ChatConversationStatus chatStatus;
    
    @Column(name="agent_sid")
    private String agentSid;
	
	public ProjectCustomerChatAssociationHistory() {
		// TODO Auto-generated constructor stub
	}

	public ProjectCustomerChatAssociationHistoryPK getAssociationHistoryPK() {
		return associationHistoryPK;
	}

	public void setAssociationHistoryPK(
			ProjectCustomerChatAssociationHistoryPK associationHistoryPK) {
		this.associationHistoryPK = associationHistoryPK;
	}
	
	public void setAssociationHistoryPK(Integer projectId,Integer customerId) {
		this.associationHistoryPK = new ProjectCustomerChatAssociationHistoryPK(projectId, customerId);;
	}

	public String getLastChatSessionId() {
		return lastChatSessionId;
	}

	public void setLastChatSessionId(String lastChatSessionId) {
		this.lastChatSessionId = lastChatSessionId;
	}

	public Timestamp getLastMessageTime() {
		return lastMessageTime;
	}

	public void setLastMessageTime(Timestamp lastMessageTime) {
		this.lastMessageTime = lastMessageTime;
	}

	public String getLastMessageFromSid() {
		return lastMessageFromSid;
	}

	public void setLastMessageFromSid(String sid) {
		this.lastMessageFromSid = sid;
	}

	public String getLastMessageJson() {
		return lastMessageJson;
	}

	public void setLastMessageJson(String lastMessageJson) {
		this.lastMessageJson = lastMessageJson;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
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

}
