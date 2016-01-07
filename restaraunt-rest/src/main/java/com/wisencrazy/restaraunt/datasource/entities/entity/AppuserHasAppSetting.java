package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the appuser_has_app_settings database table.
 * 
 */
@Entity
@Table(name="appuser_has_app_settings")
@NamedQueries({
	@NamedQuery(name = AppuserHasAppSetting.FIND_BY_SETTINGS_SID, query = "SELECT a FROM AppuserHasAppSetting a where hex(a.sid) = :sid"),
	@NamedQuery(name = AppuserHasAppSetting.FIND_APP_SETTINGS_BY_SID, query = "SELECT a FROM AppuserHasAppSetting a where a.userAppSettingId.version = :version"
			+ " and userAppSettingId.device = :device and userAppSettingId.userId = :id")
})
public class AppuserHasAppSetting extends AbsCompositeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.AppuserHasAppSetting.";
	
	public static final String FIND_BY_SETTINGS_SID = PREFIX + "findBySettingId";

	public static final String FIND_APP_SETTINGS_BY_SID = PREFIX + "findAppuserSettingsBySid";
	

	@EmbeddedId
	private AppuserHasAppSettingPK userAppSettingId;

	private Boolean enabled;

	private int id;


	public AppuserHasAppSetting() {
	}

	public AppuserHasAppSettingPK getUserAppSettingId() {
		return userAppSettingId;
	}

	public void setUserAppSettingId(AppuserHasAppSettingPK userAppSettingId) {
		this.userAppSettingId = userAppSettingId;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
}