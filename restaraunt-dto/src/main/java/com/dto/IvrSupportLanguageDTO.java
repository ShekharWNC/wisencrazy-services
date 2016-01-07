package com.dto;


public class IvrSupportLanguageDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String languageCode;

	private String languageName;
	
	private String defaultValue;
	
	private String gender;

	public IvrSupportLanguageDTO() {
	}

	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}