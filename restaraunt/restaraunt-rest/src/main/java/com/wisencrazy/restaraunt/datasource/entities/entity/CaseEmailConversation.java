package com.wisencrazy.restaraunt.datasource.entities.entity;


public class CaseEmailConversation extends CaseConversation {
    
	CaseConversationContent email;

    public CaseConversationContent getEmail() {
        return email;
    }

    public void setEmail(CaseConversationContent note) {
        this.email = note;
    }

    public CaseEmailConversation() {
        super();
        this.channels.add(CONVERSATION_CHANNEL.EMAIL);
    }

    public CaseEmailConversation(CaseConversation conversation) {
        super(conversation);
    }

}
