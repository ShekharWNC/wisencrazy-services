package com.dto;

import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * The persistent class for the settings database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SettingDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String settingDescription;

	private String settingType;
	
	private int userHasSettingId;

	//bi-directional many-to-one association to SettingHasChoice
	private List<SettingHasChoiceDTO> settingHasChoices;
        
    private byte status;

	private int isDefault;
    
	//bi-directional many-to-one association to SettingGroup
//	private SettingGroup settingGroup;

//	//bi-directional many-to-one association to UserHasSetting
//	private List<UserHasSetting> userHasSettings;

	public SettingDTO() {
	}

	public SettingDTO(String settingDescription, String settingType,
			List<SettingHasChoiceDTO> settingHasChoices,
			SettingGroupDTO settingGroup, List<UserHasSettingDTO> userHasSettings) {
	super();
	this.settingDescription = settingDescription;
	this.settingType = settingType;
	this.settingHasChoices = settingHasChoices;
//		this.settingGroup = settingGroup;
//		this.userHasSettings = userHasSettings;
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

	public List<SettingHasChoiceDTO> getSettingHasChoices() {
		return this.settingHasChoices;
	}

	public void setSettingHasChoices(List<SettingHasChoiceDTO> settingHasChoices) {
		this.settingHasChoices = settingHasChoices;
	}

        public byte getStatus() {
            return status;
        }                

//	public SettingHasChoice addSettingHasChoice(SettingHasChoice settingHasChoice) {
//		getSettingHasChoices().add(settingHasChoice);
//		settingHasChoice.setSetting(this);
//
//		return settingHasChoice;
//	}
//
//	public SettingHasChoice removeSettingHasChoice(SettingHasChoice settingHasChoice) {
//		getSettingHasChoices().remove(settingHasChoice);
//		settingHasChoice.setSetting(null);
//
//		return settingHasChoice;
//	}

//	public SettingGroup getSettingGroup() {
//		return this.settingGroup;
//	}

//	public void setSettingGroup(SettingGroup settingGroup) {
//		this.settingGroup = settingGroup;
//	}

////	public List<UserHasSetting> getUserHasSettings() {
////		return this.userHasSettings;
////	}
////
////	public void setUserHasSettings(List<UserHasSetting> userHasSettings) {
////		this.userHasSettings = userHasSettings;
////	}
////
//	public UserHasSetting addUserHasSetting(UserHasSetting userHasSetting) {
//		getUserHasSettings().add(userHasSetting);
//		userHasSetting.setSetting(this);
//
//		return userHasSetting;
//	}
//
//	public UserHasSetting removeUserHasSetting(UserHasSetting userHasSetting) {
//		getUserHasSettings().remove(userHasSetting);
//		userHasSetting.setSetting(null);
//
//		return userHasSetting;
//	}
//

    public void setStatus(byte status) {
        this.status = status;
    }

	public int getUserHasSettingId() {
		return userHasSettingId;
	}

	public void setUserHasSettingId(int userHasSettingId) {
		this.userHasSettingId = userHasSettingId;
	}
	public int getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}
}