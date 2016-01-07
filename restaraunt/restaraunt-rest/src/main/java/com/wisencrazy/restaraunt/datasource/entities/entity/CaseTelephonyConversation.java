package com.wisencrazy.restaraunt.datasource.entities.entity;


public class CaseTelephonyConversation extends CaseConversation {
	CaseConversationContent telephony;

    public CaseConversationContent getTelephony() {
        return telephony;
    }

    public void setTelephony(CaseConversationContent content) {
        this.telephony = content;
    }

    public CaseTelephonyConversation() {
        super();
        this.channels.add(CONVERSATION_CHANNEL.TELEPHONY);
    }

    public CaseTelephonyConversation(CaseConversation conversation) {
        super(conversation);
    }

}
