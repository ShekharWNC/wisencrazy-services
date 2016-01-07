package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the tax_catogories database table.
 * 
 */
@Entity
@Table(name="tax_categories")
public class TaxCategories extends AbsBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2555661651685305620L;

	@Column(name="tax_category_name")
	private String taxCategoryName;


	@Column(name="tax_percentage")
	private Double taxPercentage;
	

	public TaxCategories() {
	}

	public Double getTaxPercentage() {
		return this.taxPercentage;
	}

	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public String getTaxCategoryName() {
		return taxCategoryName;
	}

	public void setTaxCategoryName(String taxCategoryName) {
		this.taxCategoryName = taxCategoryName;
	}

	
}