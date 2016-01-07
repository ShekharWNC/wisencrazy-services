package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the setting_category database table.
 * 
 */
@Entity
@Table(name="setting_category")
public class SettingCategory extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="category_name")
	private String categoryName;

	//bi-directional many-to-one association to SettingGroup
	/*@OneToMany(mappedBy="settingCategory")
	private List<SettingGroup> settingGroups;*/

	public SettingCategory() {
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/*public List<SettingGroup> getSettingGroups() {
		return this.settingGroups;
	}

	public void setSettingGroups(List<SettingGroup> settingGroups) {
		this.settingGroups = settingGroups;
	}

	public SettingGroup addSettingGroup(SettingGroup settingGroup) {
		getSettingGroups().add(settingGroup);
		settingGroup.setSettingCategory(this);

		return settingGroup;
	}

	public SettingGroup removeSettingGroup(SettingGroup settingGroup) {
		getSettingGroups().remove(settingGroup);
		settingGroup.setSettingCategory(null);

		return settingGroup;
	}*/

}