package com.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@SuppressWarnings("serial")
@XmlRootElement
public class UploadDetailsDTO extends AbsCommonDTO implements Serializable{

	public UploadDetailsDTO() {
	}
	
	private byte[] data;
	
	private String filePath;
	
	private String fileName;
	
	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}