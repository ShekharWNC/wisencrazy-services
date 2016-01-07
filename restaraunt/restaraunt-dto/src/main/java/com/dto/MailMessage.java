package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class MailMessage  implements Serializable {
	private String messageType;
	
	private int mailTemplateId;

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public int getMailTemplateId() {
		return mailTemplateId;
	}

	public void setMailTemplateId(int mailTemplateId) {
		this.mailTemplateId = mailTemplateId;
	}

}
