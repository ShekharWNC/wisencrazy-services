package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the app_settings database table.
 * 
 */
@Entity
@Table(name="app_settings")
@NamedQueries({
	@NamedQuery(name = AppSetting.FIND_BT_DEVICE_AND_VERSION, query = "select a from AppSetting a where a.settingId.device = :device and a.settingId.version = :version")
})
public class AppSetting extends AbsCompositeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.AppSetting.";
	public static final String FIND_BT_DEVICE_AND_VERSION = PREFIX + "findByDeviceAndVersion";

	@EmbeddedId
	private AppSettingPK settingId;

	private byte enabled;

	private int id;

	public AppSetting() {
	}

	public AppSettingPK getSettingId() {
		return settingId;
	}


	public void setSettingId(AppSettingPK settingId) {
		this.settingId = settingId;
	}


	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}