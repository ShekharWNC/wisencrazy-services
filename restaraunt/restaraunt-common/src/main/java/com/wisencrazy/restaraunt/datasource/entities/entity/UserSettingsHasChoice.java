package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the user_settings_has_choices database table.
 * 
 */
@Entity
@Table(name="user_settings_has_choices")
public class UserSettingsHasChoice extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to SettingHasChoice
	/*@ManyToOne
	@JoinColumn(name="setting_has_choices_id")
	private SettingHasChoice settingHasChoice;*/

	//bi-directional many-to-one association to UserHasSetting
	/*@ManyToOne
	@JoinColumn(name="user_has_settings_id")
	private UserHasSetting userHasSetting;*/

	public UserSettingsHasChoice() {
	}

	/*public SettingHasChoice getSettingHasChoice() {
		return this.settingHasChoice;
	}

	public void setSettingHasChoice(SettingHasChoice settingHasChoice) {
		this.settingHasChoice = settingHasChoice;
	}

	public UserHasSetting getUserHasSetting() {
		return this.userHasSetting;
	}

	public void setUserHasSetting(UserHasSetting userHasSetting) {
		this.userHasSetting = userHasSetting;
	}*/

}