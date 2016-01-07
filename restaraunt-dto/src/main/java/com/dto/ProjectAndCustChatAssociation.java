package com.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class ProjectAndCustChatAssociation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6680705787031080324L;
	
	public enum ChatConversationStatusDTO {
	    	UA, //Unanswered
	    	AN //Answered
	    }
	private String chatSessionId;
	private String customerSid;
	private String agentSid;
	private String projectSid;
	private ChatConversationStatusDTO chatStatus;
	private String lastMessageFromSid;
	private String lastMessageJson;
	private Timestamp lastMessageTime;
	public String getChatSessionId() {
		return chatSessionId;
	}
	public void setChatSessionId(String chatSessionId) {
		this.chatSessionId = chatSessionId;
	}
	public String getCustomerSid() {
		return customerSid;
	}
	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
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
	public ChatConversationStatusDTO getChatStatus() {
		return chatStatus;
	}
	public void setChatStatus(ChatConversationStatusDTO chatStatus) {
		this.chatStatus = chatStatus;
	}

	public String getLastMessageFromSid() {
		return lastMessageFromSid;
	}

	public String getLastMessageJson() {
		return lastMessageJson;
	}

	public void setLastMessageFromSid(String lastMessageFromSid) {
		this.lastMessageFromSid = lastMessageFromSid;
	}

	public void setLastMessageJson(String lastMessageJson) {
		this.lastMessageJson = lastMessageJson;
	}

	public Timestamp getLastMessageTime() {
		return lastMessageTime;
	}

	public void setLastMessageTime(Timestamp lastMessageTime) {
		this.lastMessageTime = lastMessageTime;
	}
	
}
