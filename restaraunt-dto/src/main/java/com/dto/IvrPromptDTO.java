package com.dto;

import java.io.Serializable;

public class IvrPromptDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String defaultText;

	public IvrPromptDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefaultText() {
		return this.defaultText;
	}

	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}
}