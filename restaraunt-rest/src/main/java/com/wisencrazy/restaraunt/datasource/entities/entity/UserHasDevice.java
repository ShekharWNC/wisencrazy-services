package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "user_has_device")
@NamedQueries({@NamedQuery(name=UserHasDevice.FIND_ACTIVE_AND_NOTIFICATION_ENABLED_DEVICE_BY_VIRTUALACCOUNT,query="from UserHasDevice u where hex(u.userSid)=:virtualAccountSid and u.notificationStatus='ENABLED' and u.deviceStatus='ACTIVE'"),
	@NamedQuery(name=UserHasDevice.FIND_DEVICE_BY_VIRTUALACCOUNT_AND_DEVICE_TYPE,query="from UserHasDevice u where hex(u.userSid)=:virtualAccountSid and u.deviceType=:deviceType and u.notificationStatus='ENABLED' and u.deviceStatus='ACTIVE'"),
	@NamedQuery(name=UserHasDevice.FIND_DEVICE_BY_DEVICE_ID, query="from UserHasDevice u where u.deviceId=:deviceId"),
	@NamedQuery(name=UserHasDevice.FIND_USER_BY_DEVICE_AND_USER_SID, query="from UserHasDevice u where u.deviceId=:deviceId"),
	@NamedQuery(name=UserHasDevice.FIND_ALL_DEVICES_BY_USER, query="from UserHasDevice u where hex(u.userSid)=:userSid"),
	@NamedQuery(name=UserHasDevice.FIND_DEVICE_BY_MOBILE_ID, query="from UserHasDevice u where u.mobileId=:mobileId"),
	@NamedQuery(name=UserHasDevice.FIND_DEVICE_BY_CHROME_ID, query="from UserHasDevice u where u.deviceId=:deviceId")
	
})
public class UserHasDevice extends AbsBaseEntity {
	private static final long serialVersionUID = 8348440424123344018L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.UserHasDevice.";
    public static final String FIND_ACTIVE_AND_NOTIFICATION_ENABLED_DEVICE_BY_VIRTUALACCOUNT=PREFIX+"findDeviceByVirtualAccount";
    public static final String FIND_DEVICE_BY_VIRTUALACCOUNT_AND_DEVICE_TYPE=PREFIX+"findDeviceByVirtualAccontAndDeviceType";
	public static final String DELETE_DEVICE_INFO="delete from user_has_device where virtual_account_id=:virtualAccountId and device_type=':deviceType' and device_id=':deviceId'";
	public static final String FIND_DEVICE_BY_DEVICE_ID="findDeviceStatusByDeviceId";
	public static final String FIND_DEVICE_BY_CHROME_ID="findDeviceIdByChromeId";
	public static final String FIND_USER_BY_DEVICE_AND_USER_SID="findUserByDeviceAndUseSid";
	public static final String FIND_ALL_DEVICES_BY_USER="findAllDevicesByUser";
	public static final String UPDATE_DEVICE_INFO="update user_has_device set device_status=:status where mobile_id=:mobileId";
	public static final String FIND_DEVICE_BY_MOBILE_ID="findDeviceByMobileId";
	public enum OsDeviceType {
		ANDROID, BLACK_BERRY, IOS , WINDOWS,CHROME
	}
	@Enumerated(EnumType.STRING)
	@Column(name = "device_type")
	private OsDeviceType deviceType;
	@Column(name = "device_id")
	private String deviceId;
	@Column(name="user_sid")
	private byte[] userSid;
	@Column(name="notification_status")
	private String notificationStatus;
	@Column(name="device_status")
	private String deviceStatus;
	@Column(name="device_name")
	private String deviceName;
	@Column(name="mobile_id")
	private String mobileId;
	@Column(name="device_reg_time")
	private Timestamp deviceRegistrationTime;

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
	public byte[] getUserSid() {
		return userSid;
	}

	public void setUserSid(byte[] userSid) {
		this.userSid = userSid;
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

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public Timestamp getDeviceRegistrationTime() {
		return deviceRegistrationTime;
	}

	public void setDeviceRegistrationTime(Timestamp deviceRegistrationTime) {
		this.deviceRegistrationTime = deviceRegistrationTime;
	}
	
}
