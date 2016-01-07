package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the article_has_rating database table.
 * 
 */
@Entity
@Table(name="article_has_rating")
public class ArticleHasRating extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="rating")
	private String rating;


	//bi-directional many-to-one association to Article
	@ManyToOne
	private Article article;

	public ArticleHasRating() {
	}

	
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}