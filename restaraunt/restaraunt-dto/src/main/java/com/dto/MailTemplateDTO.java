package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class MailTemplateDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String jsonData;

	private String htmlContent;

	private String mailFrom;

	private String mailTo;

	private String placeHolders;

	private String status;

	private String subject;

	private Date mailsent;
	
	public MailTemplateDTO() {
	}

	public String getJsonData() {
		return jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public String getHtmlContent() {
		return this.htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getMailFrom() {
		return this.mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getMailTo() {
		return this.mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getPlaceHolders() {
		return this.placeHolders;
	}

	public void setPlaceHolders(String placeHolders) {
		this.placeHolders = placeHolders;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMailsent() {
		return mailsent;
	}

	public void setMailsent(Date mailsent) {
		this.mailsent = mailsent;
	}

}