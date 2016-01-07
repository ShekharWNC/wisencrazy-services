package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class NotificationsMessageDTO implements Serializable{
	private Integer totalMessageCount;
	private List<NotificationDetailsDTO> message;

	public Integer getTotalMessageCount() {
		return totalMessageCount;
	}

	public void setTotalMessageCount(Integer totalMessageCount) {
		this.totalMessageCount = totalMessageCount;
	}

	public List<NotificationDetailsDTO> getMessage() {
		return message;
	}

	public void setMessage(List<NotificationDetailsDTO> message) {
		this.message = message;
	}
	

}
