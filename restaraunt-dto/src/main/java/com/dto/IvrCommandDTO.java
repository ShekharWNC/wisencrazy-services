package com.dto;

public class IvrCommandDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String name;

	public IvrCommandDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}