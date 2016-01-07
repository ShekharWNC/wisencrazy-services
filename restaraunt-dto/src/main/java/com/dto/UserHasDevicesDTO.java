package com.dto;


/**
 * @author vikash
 */
public class UserHasDevicesDTO extends AbsCommonDTO {

	private static final long serialVersionUID = -1855509173748288952L;

	public enum OsDeviceType {
		ANDROID, BLACK_BERRY, IOS,WINDOWS,CHROME
	}

	private OsDeviceType deviceType;
	private String deviceId;
	private String notificationStatus;
	private String deviceStatus;
	private String userSid;

	public OsDeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(OsDeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getUserSid() {
		return userSid;
	}

	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}
    
}
