package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Hoa Ho
 * Date: 6/28/13
 * Time: 3:55 PM
 */
public class CaseConversationContent implements Serializable {
    String caseSid;
    List<CaseConversation.CONVERSATION_CHANNEL> channels;
    Date timestamp;
    String conversationId;
    String from;
    String fromUserId;
    String content;
    private String chatMesgType;
    private String chatAttachmentSid;
    private String chatAttachmentHref;
    private String chatMesgSubType;//WS-8634
    private String chatAttachmentJson;
    private String chatMesgId;//WS-9743
    private String chatSubStatus;//WS-9787
	private String statusUpdate;

    public CaseConversationContent() {
        channels = new ArrayList<CaseConversation.CONVERSATION_CHANNEL>();
    }

    public CaseConversationContent(CaseConversationContent conversationContent) {
        this();
        this.caseSid = conversationContent.getCaseSid();
        this.channels.addAll(conversationContent.getChannels());
        this.timestamp = conversationContent.getTimestamp();
        this.conversationId = conversationContent.getConversationId();
        this.from = conversationContent.getFrom();
        this.fromUserId = conversationContent.getFromUserId();
        this.content = conversationContent.getContent();
        this.chatMesgType=conversationContent.getChatMesgType();
        this.chatAttachmentHref=conversationContent.getChatAttachmentHref();
        this.chatAttachmentSid=conversationContent.getChatAttachmentSid();
        this.chatMesgSubType=conversationContent.getChatMesgSubType();
        this.chatAttachmentJson=conversationContent.getChatAttachmentJson();
        this.chatMesgId=conversationContent.getChatMesgId();
        this.chatSubStatus = conversationContent.getChatSubStatus();
        this.statusUpdate=conversationContent.getStatusUpdate();
    }

    public String getCaseSid() {
        return caseSid;
    }

    public void setCaseSid(String caseSid) {
        this.caseSid = caseSid;
    }

    public List<CaseConversation.CONVERSATION_CHANNEL> getChannels() {
        return channels;
    }

    public void setChannels(List<CaseConversation.CONVERSATION_CHANNEL> channels) {
        this.channels = channels;
    }

    public void addChannel(CaseConversation.CONVERSATION_CHANNEL channel) {
        this.channels.add(channel);
    }

    public boolean hasChannel(CaseConversation.CONVERSATION_CHANNEL channel) {
        if(channels == null) return false;

        for(CaseConversation.CONVERSATION_CHANNEL aChannel : channels) {
            if(aChannel == channel) return true;
        }

        return false;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	public String getChatAttachmentSid() {
		return chatAttachmentSid;
	}

	public void setChatAttachmentSid(String chatAttachmentSid) {
		this.chatAttachmentSid = chatAttachmentSid;
	}

	public String getChatAttachmentHref() {
		return chatAttachmentHref;
	}

	public void setChatAttachmentHref(String chatAttachmentHref) {
		this.chatAttachmentHref = chatAttachmentHref;
	}

	public String getChatMesgType() {
		return chatMesgType;
	}

	public void setChatMesgType(String chatMesgType) {
		this.chatMesgType = chatMesgType;
	}

	public String getChatMesgSubType() {
		return chatMesgSubType;
	}

	public void setChatMesgSubType(String chatMesgSubType) {
		this.chatMesgSubType = chatMesgSubType;
	}

	public String getChatAttachmentJson() {
		return chatAttachmentJson;
	}

	public void setChatAttachmentJson(String chatAttachmentJson) {
		this.chatAttachmentJson = chatAttachmentJson;
	}

	public String getChatMesgId() {
		return chatMesgId;
	}

	public void setChatMesgId(String chatMesgId) {
		this.chatMesgId = chatMesgId;
	}

	public String getChatSubStatus() {
		return chatSubStatus;
	}

	public void setChatSubStatus(String chatSubStatus) {
		this.chatSubStatus = chatSubStatus;
	}
		public String getStatusUpdate() {
		return statusUpdate;
	}

	public void setStatusUpdate(String statusUpdate) {
		this.statusUpdate = statusUpdate;
	}
    
}
