package com.dto;


public class CustomerHasSocialNetworkDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String type;

	private String url;

	public CustomerHasSocialNetworkDTO() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}