package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the security_send_notification database table.
 * 
 */
@Entity
@Table(name="security_send_notification")
public class SecuritySendNotification extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7791134059270727472L;

	public enum NotificationChannelType{
		email,
		text,
		web		
	}
	public enum SendNotificationType{
		supervisor,
		security
	}

	@Column(name="notification_channel_type")
	private String notificationChannelType;

	@Column(name="send_notification_type")
	private String sendNotificationType;

	//bi-directional many-to-one association to SecurityGeneralNotification
	@ManyToOne
	@JoinColumn(name="security_general_notification_id")
	private SecurityGeneralNotification securityGeneralNotification;

	public SecuritySendNotification() {
	}


	public String getNotificationChannelType() {
		return this.notificationChannelType;
	}

	public void setNotificationChannelType(String notificationChannelType) {
		this.notificationChannelType = notificationChannelType;
	}

	public String getSendNotificationType() {
		return this.sendNotificationType;
	}

	public void setSendNotificationType(String sendNotificationType) {
		this.sendNotificationType = sendNotificationType;
	}


	public SecurityGeneralNotification getSecurityGeneralNotification() {
		return this.securityGeneralNotification;
	}

	public void setSecurityGeneralNotification(SecurityGeneralNotification securityGeneralNotification) {
		this.securityGeneralNotification = securityGeneralNotification;
	}

}