package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the category_has_rating database table.
 * 
 */
@Entity
@Table(name="category_has_rating")
public class CategoryHasRating extends AbsBaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="rating")
	private String rating;


	//bi-directional many-to-one association to Category
	@ManyToOne(fetch=FetchType.LAZY)
	private Category category;

	public CategoryHasRating() {
	
	}


	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}


	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}