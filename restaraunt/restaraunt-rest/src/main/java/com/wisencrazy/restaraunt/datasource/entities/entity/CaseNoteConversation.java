package com.wisencrazy.restaraunt.datasource.entities.entity;

/**
 * User: Hoa Ho
 * Date: 6/28/13
 * Time: 4:02 PM
 */
public class CaseNoteConversation extends CaseConversation {
    CaseConversationContent note;

    public CaseConversationContent getNote() {
        return note;
    }

    public void setNote(CaseConversationContent note) {
        this.note = note;
    }

    public CaseNoteConversation() {
        super();
        this.channels.add(CONVERSATION_CHANNEL.NOTE);
    }

    public CaseNoteConversation(CaseConversation conversation) {
        super(conversation);
    }
}
