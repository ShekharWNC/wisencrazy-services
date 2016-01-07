package com.dto;

import javax.persistence.ManyToOne;


public class LocalizationDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;


	
	private String companySid;


	private String timeFormat;

	//bi-directional many-to-one association to Language
	@ManyToOne
	private LanguageDTO language;

	//bi-directional many-to-one association to Timezone
	@ManyToOne
	private TimezoneDTO timezone;

	public LocalizationDTO() {
	}


	public String getCompanySid() {
		return companySid;
	}


	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}


	public String getTimeFormat() {
		return timeFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public LanguageDTO getLanguage() {
		return language;
	}

	public void setLanguage(LanguageDTO language) {
		this.language = language;
	}

	public TimezoneDTO getTimezone() {
		return timezone;
	}

	public void setTimezone(TimezoneDTO timezone) {
		this.timezone = timezone;
	}

	
}