package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyRoleDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private CompanyCommonDTO company;
	//private List<VirtualAccountCommonDTO> virtualAccounts;

	public CompanyCommonDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyCommonDTO company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

/*	public List<VirtualAccountCommonDTO> getVirtualAccounts() {
		return virtualAccounts;
	}

	public void setVirtualAccounts(List<VirtualAccountCommonDTO> virtualAccounts) {
		this.virtualAccounts = virtualAccounts;
	}*/

	
	

}
