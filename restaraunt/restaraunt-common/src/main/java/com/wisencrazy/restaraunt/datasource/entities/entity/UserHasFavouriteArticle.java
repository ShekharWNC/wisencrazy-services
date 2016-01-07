package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_favourite_article database table.
 * 
 */
@Entity
@Table(name="user_has_favourite_article")
public class UserHasFavouriteArticle extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="status")
	private String status;

	//bi-directional one-to-one association to Article
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "article_id")
	private Article article;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="appuser_id")
	private Appuser appuser;

	public UserHasFavouriteArticle() {
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Appuser getAppuser() {
		return appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}
	

}