package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the user_settings_has_choices database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserSettingsHasChoiceDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private SettingHasChoiceDTO settingHasChoice;

	public UserSettingsHasChoiceDTO() {
	}

	public UserSettingsHasChoiceDTO(SettingHasChoiceDTO settingHasChoice,
			UserHasSettingDTO userHasSetting) {
		super();
		this.settingHasChoice = settingHasChoice;
	}

	public SettingHasChoiceDTO getSettingHasChoice() {
		return this.settingHasChoice;
	}

	public void setSettingHasChoice(SettingHasChoiceDTO settingHasChoice) {
		this.settingHasChoice = settingHasChoice;
	}

}