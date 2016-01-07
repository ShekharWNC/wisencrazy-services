package com.dto;

import java.io.Serializable;

public class PrinterHasHeaderFooterDTO implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String header;
	
	private String footer;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

}
