package com.dto;

import java.io.Serializable;


public class ArticleHasRatingDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String rating;

	private byte[] sid;

	private ArticleDTO article;

	public ArticleHasRatingDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public byte[] getSid() {
		return this.sid;
	}

	public void setSid(byte[] sid) {
		this.sid = sid;
	}

	public ArticleDTO getArticle() {
		return this.article;
	}

	public void setArticle(ArticleDTO article) {
		this.article = article;
	}

}