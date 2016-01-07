package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the tag database table.
 * 
 */
@Entity
@Table(name="kb_has_tags")
public class KbHasTags extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	public static final String APPROVED="APPROVED";
	@Column(name="appuser_id")
	private int appuserId;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="last_modified")
	private Timestamp lastModified;

	@Column(name="status")
	private String status;

	@Column(name="title")
	private String title;

	//bi-directional many-to-many association to Article
	@ManyToMany(mappedBy="tags",fetch=FetchType.LAZY)
		private List<Article> articles;

	public KbHasTags() {
	}


	public int getAppuserId() {
		return this.appuserId;
	}

	public void setAppuserId(int appuserId) {
		this.appuserId = appuserId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
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

	public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}