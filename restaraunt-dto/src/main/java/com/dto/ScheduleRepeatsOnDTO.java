package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ScheduleRepeatsOnDTO extends AbsCommonDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String repeatsOn;

	public String getRepeatsOn() {
		return repeatsOn;
	}

	public void setRepeatsOn(String repeatsOn) {
		this.repeatsOn = repeatsOn;
	}
}
