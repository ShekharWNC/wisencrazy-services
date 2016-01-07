package com.google.dto;

import java.io.Serializable;

public class ImageDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7773184780447011734L;

	private String url;
	
	private Boolean isDefault;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
}
