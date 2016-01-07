package com.wisencrazy.common;

import java.io.Serializable;

public class SuccessCode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String href;
	
	private String name;
	
	private Integer id;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
