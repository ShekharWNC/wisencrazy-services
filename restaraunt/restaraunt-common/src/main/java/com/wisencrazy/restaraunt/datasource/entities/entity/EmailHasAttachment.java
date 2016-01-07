package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EmailHasAttachment
 *
 */
@Entity
@Table(name="email_has_attachment")

public class EmailHasAttachment extends AbsBaseEntity{

	
	private static final long serialVersionUID = 1L;
	@Column(name="file_name")
	private String fileName;
	@Column(name="content_type")
	private String contentType;
	@Column(name="url")
	private String url;
	
	public EmailHasAttachment() {
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
   
}
