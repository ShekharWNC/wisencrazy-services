package com.dto;


public class KnowledgebaseHasAttachmentDTO  extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3348016079014812380L;

	private String createdDate;

	private String fileName;

	private String content;

	private String status;

	private String url;

	public KnowledgebaseHasAttachmentDTO() {
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}