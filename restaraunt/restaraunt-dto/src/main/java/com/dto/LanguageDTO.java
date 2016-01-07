package com.dto;



public class LanguageDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String name;

	public LanguageDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}