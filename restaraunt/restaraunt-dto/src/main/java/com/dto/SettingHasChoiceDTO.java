package com.dto;

import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * The persistent class for the setting_has_choices database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SettingHasChoiceDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String choice;
	
	private int userSettingHasChoiceId;

    private byte status;

	private int isDefault;
    
	public SettingHasChoiceDTO() {
	}

	public SettingHasChoiceDTO(String choice, SettingDTO setting,
			List<UserSettingsHasChoiceDTO> userSettingsHasChoices) {
		super();
		this.choice = choice;
//		this.setting = setting;
//		this.userSettingsHasChoices = userSettingsHasChoices;
	}

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

	public String getChoice() {
		return this.choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public int getUserSettingHasChoiceId() {
		return userSettingHasChoiceId;
	}

	public void setUserSettingHasChoiceId(int userSettingHasChoiceId) {
		this.userSettingHasChoiceId = userSettingHasChoiceId;
	}
	public int getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

//	public Setting getSetting() {
//		return this.setting;
//	}
//
//	public void setSetting(Setting setting) {
//		this.setting = setting;
//	}

//	public List<UserSettingsHasChoice> getUserSettingsHasChoices() {
//		return this.userSettingsHasChoices;
//	}
//
//	public void setUserSettingsHasChoices(List<UserSettingsHasChoice> userSettingsHasChoices) {
//		this.userSettingsHasChoices = userSettingsHasChoices;
//	}
//
//	public UserSettingsHasChoice addUserSettingsHasChoice(UserSettingsHasChoice userSettingsHasChoice) {
//		getUserSettingsHasChoices().add(userSettingsHasChoice);
//		userSettingsHasChoice.setSettingHasChoice(this);
//
//		return userSettingsHasChoice;
//	}
//
//	public UserSettingsHasChoice removeUserSettingsHasChoice(UserSettingsHasChoice userSettingsHasChoice) {
//		getUserSettingsHasChoices().remove(userSettingsHasChoice);
//		userSettingsHasChoice.setSettingHasChoice(null);
//
//		return userSettingsHasChoice;
//	}

}