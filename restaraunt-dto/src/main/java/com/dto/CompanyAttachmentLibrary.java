/**
 * 
 */
package com.dto;

import java.io.Serializable;


/**
 * @author raviteja
 *
 */
public class CompanyAttachmentLibrary implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public CompanyAttachmentLibrary() {
		
	}
	private String fileName;
	private String languageSId;
	private String fileSize;
	private String fileType;
	private String duration;
	private String extension;
	private String status;
	private String createdDate;
	private String url;
	private String transcript;
	private String companySID;
	private String contentType;
	private Integer successActionStatus;
	private String attachmentSid;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTranscript() {
		return transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	public String getCompanySID() {
		return companySID;
	}
	public void setCompanySID(String companySID) {
		this.companySID = companySID;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Integer getSuccessActionStatus() {
		return successActionStatus;
	}
	public void setSuccessActionStatus(Integer successActionStatus) {
		this.successActionStatus = successActionStatus;
	}
	public String getLanguageSId() {
		return languageSId;
	}
	public void setLanguageSId(String languageSId) {
		this.languageSId = languageSId;
	}
	public String getAttachmentSid() {
		return attachmentSid;
	}
	public void setAttachmentSid(String attachmentSid) {
		this.attachmentSid = attachmentSid;
	}
	
}
