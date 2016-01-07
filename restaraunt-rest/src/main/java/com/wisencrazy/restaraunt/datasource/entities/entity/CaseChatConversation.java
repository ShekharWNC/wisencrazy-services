package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Hoa Ho
 * Date: 6/28/13
 * Time: 4:01 PM
 */
public class CaseChatConversation extends CaseConversation {
    List<CaseConversationContent> messages;

    public List<CaseConversationContent> getMessages() {
        return messages;
    }

    public void setMessages(List<CaseConversationContent> messages) {
        this.messages = messages;
    }

    public CaseChatConversation() {
        super();
        this.channels.add(CONVERSATION_CHANNEL.CHAT);
        messages = new ArrayList<CaseConversationContent>();
    }

    public CaseChatConversation(CaseConversation conversation) {
        super(conversation);
        messages = new ArrayList<CaseConversationContent>();
    }
}
