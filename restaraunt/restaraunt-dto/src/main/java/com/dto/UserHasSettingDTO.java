package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_has_settings database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserHasSettingDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Setting
	private SettingDTO setting;

	//bi-directional many-to-one association to User
	private AppuserDTO user;

	//bi-directional many-to-one association to UserSettingsHasChoice
	private List<UserSettingsHasChoiceDTO> userSettingsHasChoices;

	public UserHasSettingDTO() {
	}

	public UserHasSettingDTO(int id, SettingDTO setting, AppuserDTO user,
			List<UserSettingsHasChoiceDTO> userSettingsHasChoices) {
		super();
		this.setting = setting;
		this.user = user;
		this.userSettingsHasChoices = userSettingsHasChoices;
	}

	public SettingDTO getSetting() {
		return this.setting;
	}

	public void setSetting(SettingDTO setting) {
		this.setting = setting;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

	public List<UserSettingsHasChoiceDTO> getUserSettingsHasChoices() {
		return this.userSettingsHasChoices;
	}

	public void setUserSettingsHasChoices(List<UserSettingsHasChoiceDTO> userSettingsHasChoices) {
		this.userSettingsHasChoices = userSettingsHasChoices;
	}

}