package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: AudioClipLibrary
 *
 */
@Entity
@Table(name="attachment_library")
public class AttachmentLibrary extends AbsBaseEntity{

	
	private static final long serialVersionUID = 1L;
	public static final String PROGRESS="PROGRESS";
	public static final String SUCCESS="SUCCESS";
	public static final String FAILURE="FAILURE";
	@Column(name="file_name")
	private String fileName;

	@Column(name="file_size")
	private String fileSize;
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="file_type_id", referencedColumnName = "id")
	private AttachmentType attachmentType;
	@Column(name="duration")
	private String duration;
	@Column(name="extension")
	private String extension;
	@Column(name="status")
	private String status;
	@Column(name="created_date")
	private Timestamp createdDate;
	@Column(name="url")
	private String url;
	@Column(name="transcript")
	private String transcript;
	@Column(name="content_type")
	private String contentType;
	
	public enum LibraryAttachType{
		AUDIO,
		IMAGE
	}
	public AttachmentLibrary() {
	}
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
	public AttachmentType getAttachmentType() {
		return attachmentType;
	}
	public void setAttachmentType(AttachmentType attachmentType) {
		this.attachmentType = attachmentType;
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
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
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
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
    public String convertSid(){
	   return bytesToHexStringBySid(sid);
    }
}
