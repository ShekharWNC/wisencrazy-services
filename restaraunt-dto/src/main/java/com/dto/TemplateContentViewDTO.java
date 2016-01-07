package com.dto;

import java.io.Serializable;

public class TemplateContentViewDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4860304667825792009L;

	private String sid;
	
	private String name;
	
	private String templateContent;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemplateContent() {
		return templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}
}
