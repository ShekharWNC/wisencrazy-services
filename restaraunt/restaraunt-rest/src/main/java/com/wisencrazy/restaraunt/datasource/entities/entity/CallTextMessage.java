package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CallTextMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2997422242148456122L;
	private String chatSessionId;
	private String customerSid;
	private String callTextJsonMessage;
	private String createdDate;
	private String projectSid;
	
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
	
	public String getCallTextJsonMessage() {
		return callTextJsonMessage;
	}
	public void setCallTextJsonMessage(String callTextJsonMessage) {
		this.callTextJsonMessage = callTextJsonMessage;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	
}
