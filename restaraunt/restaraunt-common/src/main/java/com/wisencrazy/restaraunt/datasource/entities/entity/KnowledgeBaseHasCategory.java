package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: KnowledgeBaseHasCategory
 *
 */
@Entity
@Table(name="knowledgebase_has_category")
public class KnowledgeBaseHasCategory extends AbsBaseEntity{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4171183776605893846L;
	@OneToMany
	@JoinColumn(name="category_id",referencedColumnName="id")
	private List<Category> category;
	@ManyToOne
	@JoinColumn(name="knowledgebase_id",referencedColumnName="id")
	private KnowledgeBase knowledgeBase;
	

	public KnowledgeBaseHasCategory() {

	}

	public KnowledgeBase getKnowledgeBase() {
		return knowledgeBase;
	}

	public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
		this.knowledgeBase = knowledgeBase;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

	
   
}
