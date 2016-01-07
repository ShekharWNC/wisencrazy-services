package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the knowledgebase_has_attachment database table.
 * 
 */
@Entity
@Table(name="knowledgebase_has_attachment")
public class KnowledgebaseHasAttachment extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7391616530643497705L;

	public enum STATUS{
		PROGRESS,
		CANCELED,
		SUCCESS,
		FAULIRE
	}
	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="fileName")
	private String fileName;

	@Column(name="status")
	private String status;

	@Column(name="url")
	private String url;

	//bi-directional many-to-one association to Article
	@OneToMany(mappedBy="knowledgebaseHasAttachment")
	private List<Article> articles;

	public KnowledgebaseHasAttachment() {
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}