package com.dto;

import java.sql.Timestamp;
/**
 * 
 * @author Vikash Pandey
 *
 */
public class NotificationDetailsDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7783726051619356590L;
	private String message;
	private String priority;
	private String messageStatus;
	private Timestamp postedDate;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}
	public Timestamp getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Timestamp postedDate) {
		this.postedDate = postedDate;
	}
}
