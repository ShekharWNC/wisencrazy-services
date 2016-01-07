package com.dto;

import java.io.Serializable;

public class PageCountDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5211000232443037670L;
	private int numberOfPages;
	private int limit;
	private String href;
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
}
