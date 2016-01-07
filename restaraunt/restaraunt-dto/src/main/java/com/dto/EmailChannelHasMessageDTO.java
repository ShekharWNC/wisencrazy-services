package com.dto;



public class EmailChannelHasMessageDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String from;
	private String mailJson;
	private String to;
	private String xForwardedTo;
	private String status;
	private String conversationId;
	private String subject;
	private String cc;
	
	public EmailChannelHasMessageDTO(){
		
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMailJson() {
		return mailJson;
	}
	public void setMailJson(String mailJson) {
		this.mailJson = mailJson;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getxForwardedTo() {
		return xForwardedTo;
	}
	public void setxForwardedTo(String xForwardedTo) {
		this.xForwardedTo = xForwardedTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
}
