package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@Table(name="category")
@NamedQueries({
	@NamedQuery(name=Article.FIND_BY_CATEGORY_ID,query="SELECT c FROM Category c WHERE c.id = :id"),
	@NamedQuery(name=Category.FIND_BY_KB_SID,query="SELECT c from Category c join c.knowledgeBase kb where hex(kb.sid)=:knowledgebaseSid"),
	@NamedQuery(name=Category.FIND_ARTICLE_BY_CATEGORYSID_STATUS_ACCESS,query="select kha from KnowledgeBaseHasArticle kha join kha.category c join kha.article a where a.access in (:articleAccess) and a.status in (:articleStatus) and hex(c.sid)=:categorySid"),
	@NamedQuery(name = Category.FIND_CATEGORY_SID_BY_NAME_AND_KB_SID, query = "select hex(c.sid) from Category c where c.title = :name and hex(c.knowledgeBase.sid) = :sid")
})
public class Category extends AbsBaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Category";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_KB_SID = PREFIX + ".findByKBSid";
    public static final String FIND_ARTICLE_BY_CATEGORYSID_STATUS_ACCESS = PREFIX + "findByCategorySidAndStatusAndAccess";
    public static final String FIND_CATEGORY_SID_BY_NAME_AND_KB_SID = PREFIX + "findCategorySidByNameAndKbSid";
    

	@ManyToOne
	@JoinColumn(name="appuser_id",referencedColumnName="id")
	private Appuser appuser;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="description")
	private String description;

	@Column(name="status")
	private String status;

	@Column(name="title")
	private String title;

	
	
	//bi-directional many-to-one association to CategoryHasRating
	@OneToMany(mappedBy="category")
	private List<CategoryHasRating> categoryHasRatings;

	//bi-directional many-to-many association to SubCategory
	@OneToMany(cascade = CascadeType.ALL,mappedBy="category")
	/*@JoinTable(
		name="category_has_sub_category"
		, joinColumns={
			@JoinColumn(name="category_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="sub_category_id")
			}
		)*/
	private List<SubCategory> subCategories;
	@ManyToOne
	private KnowledgeBase knowledgeBase;
	@OneToMany(mappedBy="category")
	private List<KnowledgeBaseHasArticle> knowledgebaseHasArticle;
		
	public Category() {
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

	public List<CategoryHasRating> getCategoryHasRatings() {
		return this.categoryHasRatings;
	}

	public void setCategoryHasRatings(List<CategoryHasRating> categoryHasRatings) {
		this.categoryHasRatings = categoryHasRatings;
	}

	public CategoryHasRating addCategoryHasRating(CategoryHasRating categoryHasRating) {
		getCategoryHasRatings().add(categoryHasRating);
		categoryHasRating.setCategory(this);

		return categoryHasRating;
	}

	public CategoryHasRating removeCategoryHasRating(CategoryHasRating categoryHasRating) {
		getCategoryHasRatings().remove(categoryHasRating);
		categoryHasRating.setCategory(null);

		return categoryHasRating;
	}


	public List<SubCategory> getSubCategories() {
		return this.subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	public Appuser getAppuser() {
		return appuser;
	}
	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}
	public List<KnowledgeBaseHasArticle> getKnowledgebaseHasArticle() {
		return knowledgebaseHasArticle;
	}
	public void setKnowledgebaseHasArticle(
			List<KnowledgeBaseHasArticle> knowledgebaseHasArticle) {
		this.knowledgebaseHasArticle = knowledgebaseHasArticle;
	}
	public KnowledgeBase getKnowledgeBase() {
		return knowledgeBase;
	}
	public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
		this.knowledgeBase = knowledgeBase;
	}
	
	
}