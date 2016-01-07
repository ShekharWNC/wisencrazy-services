package com.dto;



public class SecuritySendNotificationDTO extends AbsCommonDTO{


	private String notificationChannelType;

	private String sendNotificationType;

	private SecurityGeneralNotificationDTO securityGeneralNotification;

	public SecuritySendNotificationDTO() {
		// TODO Auto-generated constructor stub
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


	public SecurityGeneralNotificationDTO getSecurityGeneralNotification() {
		return securityGeneralNotification;
	}


	public void setSecurityGeneralNotification(
			SecurityGeneralNotificationDTO securityGeneralNotification) {
		this.securityGeneralNotification = securityGeneralNotification;
	}


}
