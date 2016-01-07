package com.dto.core.ordermanagement;

import com.dto.AbsCommonDTO;


/**
 * The dto class for the tax_catogories database table.
 * 
 */
public class TaxCategoriesDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1604701088136781358L;


	private String taxCategoryName;


	private double taxPercentage;


	public TaxCategoriesDTO() {
	}

	public double getTaxPercentage() {
		return this.taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public String getTaxCategoryName() {
		return taxCategoryName;
	}

	public void setTaxCategoryName(String taxCategoryName) {
		this.taxCategoryName = taxCategoryName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TaxCategoryDTO [taxCategoryName=");
		builder.append(taxCategoryName);
		builder.append(", taxPercentage=");
		builder.append(taxPercentage);
		builder.append("]");
		return builder.toString();
	}
	

}