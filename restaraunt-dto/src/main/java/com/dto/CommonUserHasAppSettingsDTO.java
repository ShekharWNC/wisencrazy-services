package com.dto;

import com.dto.constants.EnumConstants.AppSetting;
import com.dto.constants.EnumConstants.SettingFor;

public class CommonUserHasAppSettingsDTO extends AbsCommonDTO {
	
	
	private AppSetting setting;
	
	private SettingFor settingFor;
	
	private String version;
	
	private Boolean enabled;

	public AppSetting getSetting() {
		return setting;
	}

	public void setSetting(AppSetting setting) {
		this.setting = setting;
	}

	public SettingFor getSettingFor() {
		return settingFor;
	}

	public void setSettingFor(SettingFor settingFor) {
		this.settingFor = settingFor;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}
