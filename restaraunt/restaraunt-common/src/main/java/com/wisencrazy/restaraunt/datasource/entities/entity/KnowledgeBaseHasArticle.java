/**
 * 
 */
package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author raviteja
 *
 */
@Entity
@Table(name="knowledgebase_has_article")
@NamedQueries({
	@NamedQuery(name=KnowledgeBaseHasArticle.FIND_KB_BY_STATUS_AND_KB_SID_AND_ACCESS,query="select kha from KnowledgeBaseHasArticle kha join kha.knowledgeBase kb join kha.article a where a.access in (:access) and a.status in (:status) and hex(kb.sid)=:kbSid order by a.createdDate DESC"),
	@NamedQuery(name=KnowledgeBaseHasArticle.FIND_AGENT_ARTICLE_STATUS_ACCESS,query="select kha from KnowledgeBaseHasArticle kha join kha.knowledgeBase kb join kha.article a join a.appuser au where a.access in (:access) and a.status in (:status) and hex(kb.sid)=:kbSid and hex(au.sid)=:appuserSid  order by a.createdDate DESC")
})
public class KnowledgeBaseHasArticle extends AbsBaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8128429830957438581L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.KnowledgeBaseHasArticle";
	public static final String FIND_KB_BY_STATUS_AND_KB_SID_AND_ACCESS = PREFIX+".findArticlesByKbSidAndAccessAndStatus";
	public static final String FIND_AGENT_ARTICLE_STATUS_ACCESS = PREFIX+".findAgentArticleByStatusAndAccess";
	@ManyToOne(fetch=FetchType.LAZY)
	private KnowledgeBase knowledgeBase;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sub_category_id")
	private SubCategory subCategory;
	@ManyToOne(cascade=CascadeType.ALL)
	private Article article;

	public KnowledgeBase getKnowledgeBase() {
		return knowledgeBase;
	}

	public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
		this.knowledgeBase = knowledgeBase;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}
