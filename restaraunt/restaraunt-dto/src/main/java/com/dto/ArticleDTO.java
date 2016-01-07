package com.dto;


public class ArticleDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7920989613373012223L;

	private String createdDate;

	private String description;

	private int dislikes;

	private String lastModified;

	private int likes;

	private String status;

	private String title;

	private int visitedCount;
	
	private String access;
	
	private KnowledgebaseHasAttachmentDTO knowledgebaseHasAttachment;
	
	private String shortUrl;

	public ArticleDTO() {
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDislikes() {
		return this.dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public String getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public int getLikes() {
		return this.likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
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

	public int getVisitedCount() {
		return this.visitedCount;
	}

	public void setVisitedCount(int visitedCount) {
		this.visitedCount = visitedCount;
	}

	public KnowledgebaseHasAttachmentDTO getKnowledgebaseHasAttachment() {
		return this.knowledgebaseHasAttachment;
	}

	public void setKnowledgebaseHasAttachment(KnowledgebaseHasAttachmentDTO knowledgebaseHasAttachment) {
		this.knowledgebaseHasAttachment = knowledgebaseHasAttachment;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	
}