package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the article database table.
 * 
 */
@Entity
@Table(name="article")
@NamedQueries({
	
	
})
public class Article extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Article";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_CATEGORY_ID = PREFIX + "findByCategoryId";
    public  enum STATUS{
    	APPROVED,
    	PENDING,
    	REJECTED
    }
    public enum ACCESS{
    	PUBLIC,
    	PRIVATE
    }
    
    @ManyToOne
	@JoinColumn(name="appuser_id",referencedColumnName="id")
	private Appuser appuser;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="description")
	private String description;

	@Column(name="dislikes")
	private Integer dislikes;

	@Column(name="last_modified")
	private Timestamp lastModified;

	@Column(name="likes")
	private Integer likes;

	@Column(name="status")
	private String status;

	@Column(name="title")
	private String title;

	@Column(name="visited_count")
	private Integer visitedCount;
	
	@Column(name="access")
	private String access;

	@Column(name="reject_reason")
	private String rejectReason;

	//bi-directional many-to-one association to KnowledgebaseHasAttachment
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="content_id",nullable=false)
	private KnowledgebaseHasAttachment knowledgebaseHasAttachment;

	//bi-directional many-to-one association to ArticleHasRating
	@OneToMany(mappedBy="article",cascade=CascadeType.ALL)
	private List<ArticleHasRating> articleHasRatings;

	@OneToMany(mappedBy="article",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<KnowledgeBaseHasArticle> knowledgeBaseHasArticles;

	//bi-directional many-to-many association to Tag
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(
		name="article_has_tag"
		, joinColumns={
			@JoinColumn(name="article_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="tag_id")
			}
		)
	private List<KbHasTags> tags;

	//bi-directional one-to-one association to UserHasFavouriteArticle
	@OneToMany(mappedBy="article",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<UserHasFavouriteArticle> userHasFavouriteArticle;
	
	@Column(name="short_url")
	private String shortUrl;

	public Article() {
	}

	public Appuser getAppuser() {
		return appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
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

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
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

	public KnowledgebaseHasAttachment getKnowledgebaseHasAttachment() {
		return this.knowledgebaseHasAttachment;
	}

	public void setKnowledgebaseHasAttachment(KnowledgebaseHasAttachment knowledgebaseHasAttachment) {
		this.knowledgebaseHasAttachment = knowledgebaseHasAttachment;
	}

	public List<ArticleHasRating> getArticleHasRatings() {
		return this.articleHasRatings;
	}

	public void setArticleHasRatings(List<ArticleHasRating> articleHasRatings) {
		this.articleHasRatings = articleHasRatings;
	}

	public ArticleHasRating addArticleHasRating(ArticleHasRating articleHasRating) {
		getArticleHasRatings().add(articleHasRating);
		articleHasRating.setArticle(this);

		return articleHasRating;
	}

	public ArticleHasRating removeArticleHasRating(ArticleHasRating articleHasRating) {
		getArticleHasRatings().remove(articleHasRating);
		articleHasRating.setArticle(null);

		return articleHasRating;
	}


	public List<KbHasTags> getTags() {
		return this.tags;
	}

	public void setTags(List<KbHasTags> tags) {
		this.tags = tags;
	}
	public List<UserHasFavouriteArticle> getUserHasFavouriteArticle() {
		return userHasFavouriteArticle;
	}


	public void setUserHasFavouriteArticle(
			List<UserHasFavouriteArticle> userHasFavouriteArticle) {
		this.userHasFavouriteArticle = userHasFavouriteArticle;
	}


	public String getAccess() {
		return access;
	}


	public void setAccess(String access) {
		this.access = access;
	}


	public String getRejectReason() {
		return rejectReason;
	}


	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public List<KnowledgeBaseHasArticle> getKnowledgeBaseHasArticles() {
		return knowledgeBaseHasArticles;
	}

	public void setKnowledgeBaseHasArticles(
			List<KnowledgeBaseHasArticle> knowledgeBaseHasArticles) {
		this.knowledgeBaseHasArticles = knowledgeBaseHasArticles;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	
}