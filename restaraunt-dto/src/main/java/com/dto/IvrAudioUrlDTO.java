package com.dto;

import java.io.Serializable;

public class IvrAudioUrlDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String defaultUrl;

	public IvrAudioUrlDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefaultUrl() {
		return this.defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}
}