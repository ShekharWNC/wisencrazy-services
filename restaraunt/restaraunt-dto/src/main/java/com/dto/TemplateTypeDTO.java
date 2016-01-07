package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateTypeDTO extends AbsCommonDTO {
  
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1495842306379771300L;
	private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
