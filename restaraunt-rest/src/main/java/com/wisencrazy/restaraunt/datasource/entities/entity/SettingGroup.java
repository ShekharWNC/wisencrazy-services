package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the setting_group database table.
 * 
 */
@Entity
@Table(name="setting_group")
public class SettingGroup extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="group_name")
	private String groupName;

	//bi-directional many-to-one association to SettingCategory
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="setting_category_id", referencedColumnName = "id")
	private SettingCategory settingCategory;

	//bi-directional many-to-one association to Setting
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "setting_group_id", referencedColumnName = "id")
	private List<Setting> settings;

	public SettingGroup() {
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public SettingCategory getSettingCategory() {
		return this.settingCategory;
	}

	public void setSettingCategory(SettingCategory settingCategory) {
		this.settingCategory = settingCategory;
	}

	public List<Setting> getSettings() {
		return this.settings;
	}

	public void setSettings(List<Setting> settings) {
		this.settings = settings;
	}

	/*public Setting addSetting(Setting setting) {
		getSettings().add(setting);
		setting.setSettingGroup(this);

		return setting;
	}

	public Setting removeSetting(Setting setting) {
		getSettings().remove(setting);
		setting.setSettingGroup(null);

		return setting;
	}*/

}