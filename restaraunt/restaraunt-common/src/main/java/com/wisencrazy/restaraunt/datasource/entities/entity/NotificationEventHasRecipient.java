package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="notification_event_has_recipient")
public class NotificationEventHasRecipient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2111646492986117402L;
	@EmbeddedId
	protected NotificationEventHasRecipientPK notificationEventHasRecipientPK;
	
	@JoinColumn(name = "recipient_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Recipient recipient;
	
	@JoinColumn(name = "notification_event_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NotificationEvent notificationEvent;
	
	public Recipient getRecipient() {
		return recipient;
	}
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	public NotificationEventHasRecipientPK getNotificationEventHasRecipientPK() {
		return notificationEventHasRecipientPK;
	}
	public void setNotificationEventHasRecipientPK(
			NotificationEventHasRecipientPK notificationEventHasRecipientPK) {
		this.notificationEventHasRecipientPK = notificationEventHasRecipientPK;
	}
	public NotificationEvent getNotificationEvent() {
		return notificationEvent;
	}
	public void setNotificationEvent(NotificationEvent notificationEvent) {
		this.notificationEvent = notificationEvent;
	}
}
