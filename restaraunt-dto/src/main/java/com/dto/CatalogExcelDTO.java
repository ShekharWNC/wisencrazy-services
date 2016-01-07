package com.dto;

import java.io.Serializable;

/**
 * 
 * @author vikash
 *
 */
public class CatalogExcelDTO implements Serializable {

	private static final long serialVersionUID = 638862695831725228L;
	private String categoryName;
	private String subCategoryName;
	private int categoryId;
	private int subcategoryId;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

}
