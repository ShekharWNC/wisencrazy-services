package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.dto.constants.EnumConstants.SettingFor;

/**
 * The primary key class for the appuser_has_app_settings database table.
 * 
 */
@Embeddable
public class AppuserHasAppSettingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="appuser_id")
	private int userId;

	@Enumerated(EnumType.STRING)
	private com.dto.constants.EnumConstants.AppSetting setting;

	@Enumerated(EnumType.STRING)
	private SettingFor device;

	private String version;

	public AppuserHasAppSettingPK() {
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public com.dto.constants.EnumConstants.AppSetting getSetting() {
		return setting;
	}
	public void setSetting(com.dto.constants.EnumConstants.AppSetting setting) {
		this.setting = setting;
	}
	public SettingFor getDevice() {
		return device;
	}
	public void setDevice(SettingFor device) {
		this.device = device;
	}
	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AppuserHasAppSettingPK)) {
			return false;
		}
		AppuserHasAppSettingPK castOther = (AppuserHasAppSettingPK)other;
		return 
			(this.userId == castOther.userId)
			&& this.setting.equals(castOther.setting)
			&& this.device.equals(castOther.device)
			&& this.version.equals(castOther.version);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.setting.hashCode();
		hash = hash * prime + this.device.hashCode();
		hash = hash * prime + this.version.hashCode();
		
		return hash;
	}
}