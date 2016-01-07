package com.wisencrazy.restaraunt.datasource.entities.entity;

/**
 * User: Hoa Ho
 * Date: 7/19/13
 * Time: 4:11 PM
 */
public class CaseReplyConversation extends CaseConversation {
    CaseConversationContent content;

    public CaseConversationContent getContent() {
        return content;
    }

    public void setContent(CaseConversationContent content) {
        this.content = content;
    }

    public CaseReplyConversation() {
        super();
    }

    public CaseReplyConversation(CaseConversationContent content) {
        super();
        this.content = content;
    }

    public CaseReplyConversation(CaseConversation conversation) {
        super(conversation);
    }
}
