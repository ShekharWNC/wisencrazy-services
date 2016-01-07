package com.dto;

import java.io.Serializable;
import java.util.List;

public class TagDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int appuserId;

	private String createdDate;

	private String lastModified;

	private byte[] sid;

	private String status;

	private String title;

	private List<ArticleDTO> articles;

	public TagDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAppuserId() {
		return this.appuserId;
	}

	public void setAppuserId(int appuserId) {
		this.appuserId = appuserId;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public byte[] getSid() {
		return this.sid;
	}

	public void setSid(byte[] sid) {
		this.sid = sid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ArticleDTO> getArticles() {
		return this.articles;
	}

	public void setArticles(List<ArticleDTO> articles) {
		this.articles = articles;
	}

}