package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "category_has_sub_category")
public class CategoryHasSubCategory extends AbsCompositeEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6353871416260877388L;
	@EmbeddedId
	CategoryHasSubCategoryPK subcategoryPK;

	public CategoryHasSubCategoryPK getSubcategoryPK() {
		return subcategoryPK;
	}

	public void setSubcategoryPK(CategoryHasSubCategoryPK subcategoryPK) {
		this.subcategoryPK = subcategoryPK;
	}
}
