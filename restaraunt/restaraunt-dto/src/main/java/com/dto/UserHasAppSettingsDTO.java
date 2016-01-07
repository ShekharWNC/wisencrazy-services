package com.dto;

import java.util.List;

public class UserHasAppSettingsDTO extends AbsCommonDTO {
	
	private List<CommonUserHasAppSettingsDTO> userHasAppSettings;

	public List<CommonUserHasAppSettingsDTO> getUserHasAppSettings() {
		return userHasAppSettings;
	}

	public void setUserHasAppSettings(
			List<CommonUserHasAppSettingsDTO> userHasAppSettings) {
		this.userHasAppSettings = userHasAppSettings;
	}
}
