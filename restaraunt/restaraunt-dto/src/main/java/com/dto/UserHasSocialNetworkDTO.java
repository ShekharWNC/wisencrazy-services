package com.dto;

import java.io.Serializable;


public class UserHasSocialNetworkDTO extends AbsCommonDTO{

	private static final long serialVersionUID = 1L;

	private String type;

	private String url;

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
