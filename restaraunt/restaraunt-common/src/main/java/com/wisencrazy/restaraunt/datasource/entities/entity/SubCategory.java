package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the sub_category database table.
 * 
 */
@Entity
@Table(name="sub_category")
@NamedQueries({
	@NamedQuery(name=SubCategory.FIND_BY_CATEGORY_SID,query="select sc from SubCategory sc join sc.category c where hex(c.sid)=:categorySid"),
	@NamedQuery(name=SubCategory.FIND_ARTICLE_BY_SUBCATEGORYSID_STATUS_ACCESS,query="select kha from KnowledgeBaseHasArticle kha join kha.subCategory sc join kha.article a where a.access in (:articleAccess) and a.status in (:articleStatus) and hex(sc.sid)=:subCategorySid")
})
public class SubCategory extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	public static final String PREFIX="com.callcomm.eserve.persistence.entity.SubCategory";
	public static final String FIND_BY_CATEGORY_SID = PREFIX+".findByCategorySid";

	public static final String FIND_ARTICLE_BY_SUBCATEGORYSID_STATUS_ACCESS = PREFIX+"findArticlesBySubcategorySid";

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
	
	//bi-directional many-to-many association to Category
	@ManyToOne
	private Category category;
	
	@OneToMany(mappedBy="subCategory",cascade=CascadeType.ALL)
	private List<KnowledgeBaseHasArticle> knowledgebaseHasArticle;
	
	public SubCategory() {
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

	public List<KnowledgeBaseHasArticle> getKnowledgebaseHasArticle() {
		return knowledgebaseHasArticle;
	}


	public void setKnowledgebaseHasArticle(
			List<KnowledgeBaseHasArticle> knowledgebaseHasArticle) {
		this.knowledgebaseHasArticle = knowledgebaseHasArticle;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}

}