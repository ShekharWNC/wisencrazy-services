package com.wisencrazy.restaraunt.datasource.entities.entity;


public class CaseVMConversation extends CaseConversation {
	CaseConversationContent vm;

    public CaseConversationContent getVM() {
        return vm;
    }

    public void setVM(CaseConversationContent content) {
        this.vm = content;
    }

    public CaseVMConversation() {
        super();
        this.channels.add(CONVERSATION_CHANNEL.VM);
    }

    public CaseVMConversation(CaseConversation conversation) {
        super(conversation);
    }

}
