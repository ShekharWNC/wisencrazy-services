package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateLogoDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3611205194097431406L;
	private String name;
	private String logoUrl;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	

}
