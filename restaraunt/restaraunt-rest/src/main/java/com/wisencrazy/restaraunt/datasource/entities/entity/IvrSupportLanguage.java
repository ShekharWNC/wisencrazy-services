package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_support_language database table.
 * 
 */
@Entity
@Table(name="ivr_support_language")
public class IvrSupportLanguage extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="language_code")
	private String languageCode;

	@Column(name="language_name")
	private String languageName;
	
	@Column(name = "default_value")
	private String defaultValue;
	
	@Column(name = "gender")
	private String gender;


	public IvrSupportLanguage() {
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