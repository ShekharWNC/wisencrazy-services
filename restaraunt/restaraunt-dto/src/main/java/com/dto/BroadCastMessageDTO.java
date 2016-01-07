package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Vikash Pandey
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class BroadCastMessageDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5986748108259271485L;
	private String message;
	private String projectSid;
	private String companySid;
	private String virtualAccountSid;
	private String recipientName;
	private String recipientSid;
	private String toRecipientSid;
	private String priority;
	private String fromName;
	private String projectGroupSid;
	
	public String getVirtualAccountSid() {
		return virtualAccountSid;
	}
	public void setVirtualAccountSid(String virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getProjectSid() {
		return projectSid;
	}
	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientSid() {
		return recipientSid;
	}
	public void setRecipientSid(String recipientSid) {
		this.recipientSid = recipientSid;
	}
	public String getToRecipientSid() {
		return toRecipientSid;
	}
	public void setToRecipientSid(String toRecipientSid) {
		this.toRecipientSid = toRecipientSid;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getProjectGroupSid() {
		return projectGroupSid;
	}
	public void setProjectGroupSid(String projectGroupSid) {
		this.projectGroupSid = projectGroupSid;
	}
}
