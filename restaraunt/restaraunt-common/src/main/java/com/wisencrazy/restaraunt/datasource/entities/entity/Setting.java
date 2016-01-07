package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the settings database table.
 * 
 */
@Entity
@Table(name="settings")
public class Setting extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="is_default")
	private byte isDefault;

	@Column(name="setting_description")
	private String settingDescription;

	@Column(name="setting_type")
	private String settingType;

	//bi-directional many-to-one association to SettingHasChoice
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "settings_id", referencedColumnName = "id")
	private List<SettingHasChoice> settingHasChoices;

	//bi-directional many-to-one association to SettingGroup
	/*@ManyToOne
	@JoinColumn(name="setting_group_id")
	private SettingGroup settingGroup;*/

	//bi-directional many-to-one association to UserHasSetting
	/*@OneToMany(mappedBy="setting")
	private List<UserHasSetting> userHasSettings;*/

	public Setting() {
	}

	public byte getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(byte isDefault) {
		this.isDefault = isDefault;
	}

	public String getSettingDescription() {
		return this.settingDescription;
	}

	public void setSettingDescription(String settingDescription) {
		this.settingDescription = settingDescription;
	}

	public String getSettingType() {
		return this.settingType;
	}

	public void setSettingType(String settingType) {
		this.settingType = settingType;
	}

	public List<SettingHasChoice> getSettingHasChoices() {
		return this.settingHasChoices;
	}

	public void setSettingHasChoices(List<SettingHasChoice> settingHasChoices) {
		this.settingHasChoices = settingHasChoices;
	}

	/*public SettingHasChoice addSettingHasChoice(SettingHasChoice settingHasChoice) {
		getSettingHasChoices().add(settingHasChoice);
		settingHasChoice.setSetting(this);

		return settingHasChoice;
	}

	public SettingHasChoice removeSettingHasChoice(SettingHasChoice settingHasChoice) {
		getSettingHasChoices().remove(settingHasChoice);
		settingHasChoice.setSetting(null);

		return settingHasChoice;
	}

	public SettingGroup getSettingGroup() {
		return this.settingGroup;
	}

	public void setSettingGroup(SettingGroup settingGroup) {
		this.settingGroup = settingGroup;
	}

	public List<UserHasSetting> getUserHasSettings() {
		return this.userHasSettings;
	}

	public void setUserHasSettings(List<UserHasSetting> userHasSettings) {
		this.userHasSettings = userHasSettings;
	}

	public UserHasSetting addUserHasSetting(UserHasSetting userHasSetting) {
		getUserHasSettings().add(userHasSetting);
		userHasSetting.setSetting(this);

		return userHasSetting;
	}

	public UserHasSetting removeUserHasSetting(UserHasSetting userHasSetting) {
		getUserHasSettings().remove(userHasSetting);
		userHasSetting.setSetting(null);

		return userHasSetting;
	}*/

}