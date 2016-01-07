package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.dto.constants.EnumConstants.SettingFor;

/**
 * The primary key class for the app_settings database table.
 * 
 */
@Embeddable
public class AppSettingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private com.dto.constants.EnumConstants.AppSetting setting;

	@Enumerated(EnumType.STRING)
	private SettingFor device;

	private String version;

	public AppSettingPK() {
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
		if (!(other instanceof AppSettingPK)) {
			return false;
		}
		AppSettingPK castOther = (AppSettingPK)other;
		return 
			this.setting.equals(castOther.setting)
			&& this.device.equals(castOther.device)
			&& this.version.equals(castOther.version);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.setting.hashCode();
		hash = hash * prime + this.device.hashCode();
		hash = hash * prime + this.version.hashCode();
		
		return hash;
	}
}