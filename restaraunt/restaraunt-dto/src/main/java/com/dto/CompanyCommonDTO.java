package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyCommonDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1219720768519267507L;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
