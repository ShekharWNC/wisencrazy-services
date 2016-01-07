package com.wisencrazy.restaraunt.datasource.entities.entity;

/**
 * User: Hoa Ho
 * Date: 7/1/13
 * Time: 4:42 PM
 */
public class ChatConversation extends CaseConversation {
    String projectSid;
    
    public enum ChatConversationStatus {
    	UA, //Unanswered
    	AN //Answered
    }
    
    private ChatConversationStatus chatStatus;

    public String getProjectSid() {
        return projectSid;
    }

    public void setProjectSid(String projectSid) {
        this.projectSid = projectSid;
    }

    public String getSid() {
        return sid;
    }

    public ChatConversation() {
        super();
        this.channels.add(CONVERSATION_CHANNEL.CHAT);
    }

    public ChatConversation(ChatConversation conversation) {
        super(conversation);
        this.channels.add(CONVERSATION_CHANNEL.CHAT);
        this.projectSid = conversation.getProjectSid();
        this.setChatStatus(conversation.getChatStatus());
    }

	public ChatConversationStatus getChatStatus() {
		return chatStatus;
	}

	public void setChatStatus(ChatConversationStatus chatStatus) {
		this.chatStatus = chatStatus;
	}


}
