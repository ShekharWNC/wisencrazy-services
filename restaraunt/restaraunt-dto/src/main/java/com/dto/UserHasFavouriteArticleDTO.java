package com.dto;

import java.io.Serializable;

public class UserHasFavouriteArticleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int appuserId;

	private int articleId;

	private String createdDate;

	private byte[] sid;

	private String status;

	private ArticleDTO article;

	public UserHasFavouriteArticleDTO() {
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

	public int getArticleId() {
		return this.articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
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

	public ArticleDTO getArticle() {
		return this.article;
	}

	public void setArticle(ArticleDTO article) {
		this.article = article;
	}

}