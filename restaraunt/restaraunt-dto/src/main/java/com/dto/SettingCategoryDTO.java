package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the setting_category database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SettingCategoryDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String categoryName;

	//bi-directional many-to-one association to SettingGroup
	private List<SettingGroupDTO> settingGroups;

	public SettingCategoryDTO() {
	}

	public SettingCategoryDTO(String categoryName,
			List<SettingGroupDTO> settingGroups) {
		super();
		this.categoryName = categoryName;
		this.settingGroups = settingGroups;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<SettingGroupDTO> getSettingGroups() {
		return this.settingGroups;
	}

	public void setSettingGroups(List<SettingGroupDTO> settingGroups) {
		this.settingGroups = settingGroups;
	}

}