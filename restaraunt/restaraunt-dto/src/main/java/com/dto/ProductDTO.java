package com.dto;

/**
 * @author vikash pandey
 */
public class ProductDTO extends AbsCommonDTO {

	private static final long serialVersionUID = -5115653361437533370L;
	private String name;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
