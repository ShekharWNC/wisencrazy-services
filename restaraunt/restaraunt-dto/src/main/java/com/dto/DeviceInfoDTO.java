package com.dto;

import java.io.Serializable;

import com.dto.UserHasDevicesDTO.OsDeviceType;
/**
 * @author vikash
 */
public class DeviceInfoDTO implements Serializable{

	private static final long serialVersionUID = -902160479380195527L;
    private OsDeviceType deviceType;
    private String deviceId;
    private String notificationStatus;
    private String deviceStatus;
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
    
}
