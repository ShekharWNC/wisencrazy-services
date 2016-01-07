package com.wisencrazy.restaraunt.datasource.entities.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * User: Hoa Ho
 * Date: 7/1/13
 * Time: 4:26 PM
 */
@DynamoDBTable(tableName = "CaseConversationAssociation")
public class CaseConversationAssociation {
    String conversationSid;
    String caseSid;

    @DynamoDBHashKey(attributeName = "ConvrId")
    public String getConversationSid() {
        return conversationSid;
    }

    public void setConversationSid(String conversationSid) {
        this.conversationSid = conversationSid;
    }

    @DynamoDBAttribute(attributeName = "CaseId")
    public String getCaseSid() {
        return caseSid;
    }

    public void setCaseSid(String caseSid) {
        this.caseSid = caseSid;
    }

    public CaseConversationAssociation() {
    }

    public CaseConversationAssociation(String conversationSid, String caseSid) {
        this.conversationSid = conversationSid;
        this.caseSid = caseSid;
    }
}
