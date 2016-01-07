package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AudioClipLibraryDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -63370708801582662L;
	private String fileName;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
