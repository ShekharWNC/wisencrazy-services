package com.dto;
import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class NotifyMessageDTO<T> implements Serializable  {
	private static final long serialVersionUID = -119393776685769949L;
	private String version;
	private List<NotificationJsonPropertyDTO<MessageDTO>> notifications;
	public NotifyMessageDTO() {
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<NotificationJsonPropertyDTO<MessageDTO>> getNotifications() {
		return notifications;
	}

	public void setNotifications(
			List<NotificationJsonPropertyDTO<MessageDTO>> notifications) {
		this.notifications = notifications;
	}

	
}