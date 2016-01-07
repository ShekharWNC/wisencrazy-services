package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="notification_event")
public class NotificationEvent extends AbsBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5866789659133698860L;
	@Column(name="name")
	private String name;
    
	@OneToMany(cascade = CascadeType.ALL,mappedBy="notificationEvent")
	private List<NotificationEventHasRecipient> notificationEventHasRecipient;

	
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "notificationEvents")
    private List<TemplateHasNotificationEvent> templateHasNotificationEvent;
	
	public List<TemplateHasNotificationEvent> getTemplateHasNotificationEvent() {
		return templateHasNotificationEvent;
	}

	public void setTemplateHasNotificationEvent(
			List<TemplateHasNotificationEvent> templateHasNotificationEvent) {
		this.templateHasNotificationEvent = templateHasNotificationEvent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NotificationEventHasRecipient> getNotificationEventHasRecipient() {
		return notificationEventHasRecipient;
	}

	public void setNotificationEventHasRecipient(
			List<NotificationEventHasRecipient> notificationEventHasRecipient) {
		this.notificationEventHasRecipient = notificationEventHasRecipient;
	}

}
