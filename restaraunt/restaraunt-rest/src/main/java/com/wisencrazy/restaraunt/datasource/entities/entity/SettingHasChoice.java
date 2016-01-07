package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the setting_has_choices database table.
 * 
 */
@Entity
@Table(name="setting_has_choices")
public class SettingHasChoice extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String choice;

	@Column(name="is_default")
	private byte isDefault;

	//bi-directional many-to-one association to Setting
	/*@ManyToOne
	@JoinColumn(name="settings_id")
	private Setting setting;*/

	//bi-directional many-to-one association to UserSettingsHasChoice
	/*@OneToMany(mappedBy="settingHasChoice")
	private List<UserSettingsHasChoice> userSettingsHasChoices;*/

	public SettingHasChoice() {
	}


	public String getChoice() {
		return this.choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public byte getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(byte isDefault) {
		this.isDefault = isDefault;
	}

	/*public Setting getSetting() {
		return this.setting;
	}

	public void setSetting(Setting setting) {
		this.setting = setting;
	}

	public List<UserSettingsHasChoice> getUserSettingsHasChoices() {
		return this.userSettingsHasChoices;
	}

	public void setUserSettingsHasChoices(List<UserSettingsHasChoice> userSettingsHasChoices) {
		this.userSettingsHasChoices = userSettingsHasChoices;
	}

	public UserSettingsHasChoice addUserSettingsHasChoice(UserSettingsHasChoice userSettingsHasChoice) {
		getUserSettingsHasChoices().add(userSettingsHasChoice);
		userSettingsHasChoice.setSettingHasChoice(this);

		return userSettingsHasChoice;
	}

	public UserSettingsHasChoice removeUserSettingsHasChoice(UserSettingsHasChoice userSettingsHasChoice) {
		getUserSettingsHasChoices().remove(userSettingsHasChoice);
		userSettingsHasChoice.setSettingHasChoice(null);

		return userSettingsHasChoice;
	}*/

}