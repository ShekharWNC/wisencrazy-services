package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class BehaviorDTO extends AbsCommonDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private DetailDTO detail;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DetailDTO getDetail() {
		return detail;
	}

	public void setDetail(DetailDTO detail) {
		this.detail = detail;
	}
}