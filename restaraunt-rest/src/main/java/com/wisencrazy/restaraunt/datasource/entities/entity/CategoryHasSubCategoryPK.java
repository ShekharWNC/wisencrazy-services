package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author vikash
 *
 */
@Embeddable
public class CategoryHasSubCategoryPK implements Serializable {

	private static final long serialVersionUID = -8169272530257425520L;
	@Basic(optional = false)
	@NotNull
	@Column(name = "sub_category_id")
	private int subCategoryId;
	@Basic(optional = false)
	@NotNull
	@Column(name = "category_id")
	private int categoryId;

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
