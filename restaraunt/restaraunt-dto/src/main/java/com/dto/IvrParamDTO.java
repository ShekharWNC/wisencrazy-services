package com.dto;


public class IvrParamDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String name;

	private String value;

	public IvrParamDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}