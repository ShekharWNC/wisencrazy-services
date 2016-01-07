package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserGroupDTO extends AbsCommonDTO {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 197696582106123332L;
	private String name;
    private CompanyCommonDTO company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CompanyCommonDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyCommonDTO company) {
		this.company = company;
	}
}
