package com.dto;

/**
 * 
 * @author vikash
 * 
 */
public class OrderDetailsHasProductsDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 96715125532837748L;
	private Integer noOfQuantity;
	private CompanyHasProductsDTO companyHasProducts;

	public Integer getNoOfQuantity() {
		return noOfQuantity;
	}

	public void setNoOfQuantity(Integer noOfQuantity) {
		this.noOfQuantity = noOfQuantity;
	}

	public CompanyHasProductsDTO getCompanyHasProducts() {
		return companyHasProducts;
	}

	public void setCompanyHasProducts(CompanyHasProductsDTO companyHasProducts) {
		this.companyHasProducts = companyHasProducts;
	}
}
