package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the mail_template database table.
 * 
 */
@Entity
@Table(name="mail_template")
public class MailTemplate extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String htmlContent;

	private String jsonData;

	@Column(name="mail_from")
	private String mailFrom;

	@Column(name="mail_to")
	private String mailTo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date mailsent;

	private String placeHolders;

	private String status;

	private String subject;

	public MailTemplate() {
	}

	public String getHtmlContent() {
		return this.htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getJsonData() {
		return this.jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
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

	public Date getMailsent() {
		return this.mailsent;
	}

	public void setMailsent(Date mailsent) {
		this.mailsent = mailsent;
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

}