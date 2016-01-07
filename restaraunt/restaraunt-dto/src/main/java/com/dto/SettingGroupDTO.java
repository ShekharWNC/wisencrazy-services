package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the setting_group database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SettingGroupDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String groupName;

//	//bi-directional many-to-one association to SettingCategory
//	private SettingCategory settingCategory;

	//bi-directional many-to-one association to Setting
	private List<SettingDTO> settings;

	public SettingGroupDTO() {
	}

	public SettingGroupDTO(String groupName,
			SettingCategoryDTO settingCategory, List<SettingDTO> settings) {
		super();
		this.groupName = groupName;
//		this.settingCategory = settingCategory;
		this.settings = settings;
	}
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

//	public SettingCategory getSettingCategory() {
//		return this.settingCategory;
//	}

//	public void setSettingCategory(SettingCategory settingCategory) {
//		this.settingCategory = settingCategory;
//	}

	public List<SettingDTO> getSettings() {
		return this.settings;
	}

	public void setSettings(List<SettingDTO> settings) {
		this.settings = settings;
	}
}