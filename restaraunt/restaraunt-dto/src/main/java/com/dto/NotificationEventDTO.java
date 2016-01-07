package com.dto;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class NotificationEventDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3166687344067886002L;
	
	private String name;
	
	/*private List<NotificationEventHasRecipientDTO> notificationEventHasRecipient;*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public List<NotificationEventHasRecipientDTO> getNotificationEventHasRecipient() {
		return notificationEventHasRecipient;
	}

	public void setNotificationEventHasRecipient(
			List<NotificationEventHasRecipientDTO> notificationEventHasRecipient) {
		this.notificationEventHasRecipient = notificationEventHasRecipient;
	}*/

}

