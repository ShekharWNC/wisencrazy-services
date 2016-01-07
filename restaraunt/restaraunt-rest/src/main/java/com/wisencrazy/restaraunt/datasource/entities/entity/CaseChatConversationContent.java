package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

public class CaseChatConversationContent extends CaseConversationContent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2908556010121466904L;
	
	private boolean isDelivered;
	private List<String> readByList;

	
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	public List<String> getReadByList() {
		return readByList;
	}
	public void setReadByList(List<String> readByList) {
		this.readByList = readByList;
	}
	
	public CaseChatConversationContent(CaseConversationContent caseConversationContent){
		super(caseConversationContent);
	}
	
	

}
