package com.dto;

import java.io.Serializable;

public class SuperAdminViewDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7057397345539059407L;

	private String href;
	
	private Integer count;
	
	private String viewName;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
