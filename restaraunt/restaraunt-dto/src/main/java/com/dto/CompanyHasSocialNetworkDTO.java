package com.dto;

public class CompanyHasSocialNetworkDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int companyId;

	private String type;

	private String url;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
