package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.wisencrazy.restaraunt.datasource.entities.entity.dynamodb.model.IDynamoDBObject;

/**
 * User: Hoa Ho
 * Date: 6/28/13
 * Time: 3:48 PM
 */
public class CaseConversation implements IDynamoDBObject,Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5622012472263647412L;

	public enum CONVERSATION_CHANNEL {
        CHAT,
        NOTE,
        EMAIL,
        TELEPHONY,
        SMS,
        VM,
        UNKNOWN, 
    }

    public enum ConversationType{
    	INTERNAL,
    	EXTERNAL
    }
    
    String caseSid;
    Date timestamp;
    String sid;
    String starter;
    String starterUserId;
    private ConversationType conversationType;
    List<CONVERSATION_CHANNEL> channels;
    private String caseStatus;
    private String customerSid;

    public String getCaseSid() {
        return caseSid;
    }

    public void setCaseSid(String caseSid) {
        this.caseSid = caseSid;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String id) {
        this.sid = id;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public String getStarterUserId() {
        return starterUserId;
    }

    public void setStarterUserId(String starterUserId) {
        this.starterUserId = starterUserId;
    }

    public List<CONVERSATION_CHANNEL> getChannels() {
        return channels;
    }

    public void setChannels(List<CONVERSATION_CHANNEL> channels) {
        this.channels = channels;
    }

    public void addChannel(CONVERSATION_CHANNEL channel) {
        this.channels.add(channel);
    }

    public CaseConversation() {
        channels = new ArrayList<CONVERSATION_CHANNEL>();
    }

    public CaseConversation(CaseConversation conversation) {
        this();
        channels.addAll(conversation.getChannels());
        caseSid = conversation.getCaseSid();
        timestamp = conversation.getTimestamp();
        sid = conversation.getSid();
        starter = conversation.getStarter();
        starterUserId = conversation.getStarterUserId();
        caseStatus=conversation.getCaseStatus();
        conversationType=conversation.getConversationType();
        customerSid=conversation.getCustomerSid();
    }

    public static CaseConversation fromChannels(List<CONVERSATION_CHANNEL> channels, CaseConversation conversation) {
        if(channels == null) return null;
        if(channels.size() == 1) {
            CONVERSATION_CHANNEL channel = channels.get(0);

            switch (channel)
            {
                case CHAT: return new CaseChatConversation(conversation);
                case NOTE: return new CaseNoteConversation(conversation);
                case EMAIL: return new CaseEmailConversation(conversation);
                case TELEPHONY: return new CaseTelephonyConversation(conversation);
                case VM:return new CaseVMConversation(conversation);
                default: return null;
            }
        }

        return new CaseReplyConversation(conversation);
    }

    public boolean hasChannel(CONVERSATION_CHANNEL channel) {
        if(channels == null) return false;

        for (CONVERSATION_CHANNEL aChannel : channels) {
            if(aChannel == channel) return true;
        }

        return false;
    }

	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public ConversationType getConversationType() {
		return conversationType;
	}

	public void setConversationType(ConversationType conversationType) {
		this.conversationType = conversationType;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

}
