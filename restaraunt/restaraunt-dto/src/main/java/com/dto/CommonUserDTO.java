package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CommonUserDTO extends AbsCommonDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String displayName;

	public String emailId;
	
	private float minimumHourlyRate;
	
	public CommonUserDTO() {
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public float getMinimumHourlyRate() {
		return minimumHourlyRate;
	}

	public void setMinimumHourlyRate(float minimumHourlyRate) {
		this.minimumHourlyRate = minimumHourlyRate;
	}
}
