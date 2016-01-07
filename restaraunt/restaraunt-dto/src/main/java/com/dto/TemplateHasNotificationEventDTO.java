package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateHasNotificationEventDTO implements Serializable {
	
	private static final long serialVersionUID = -8811681632699528253L;
	private NotificationEventDTO notificationEvents;

	public NotificationEventDTO getNotificationEvents() {
		return notificationEvents;
	}

	public void setNotificationEvents(NotificationEventDTO notificationEvents) {
		this.notificationEvents = notificationEvents;
	}

	
	

}
