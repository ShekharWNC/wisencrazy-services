package com.dto;


public class PackageDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7656620739182215096L;

	private String name;

	private Integer durationInMonths;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(Integer durationInMonths) {
		this.durationInMonths = durationInMonths;
	}
}
