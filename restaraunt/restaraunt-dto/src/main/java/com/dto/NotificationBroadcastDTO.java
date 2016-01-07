package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class NotificationBroadcastDTO<T> extends AbsCommonDTO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1519549734096406460L;
	private String version="1.0";
	private String subscriberId;
	private List<NotificationJsonPropertyDTO<T>> notifications;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void setNotifications(List<NotificationJsonPropertyDTO<T>> notification) {
		this.notifications = notification;
	}
	public List<NotificationJsonPropertyDTO<T>> getNotifications() {
		return notifications;
	}
	
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	
}
