package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectCommonDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1920843015738695595L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
