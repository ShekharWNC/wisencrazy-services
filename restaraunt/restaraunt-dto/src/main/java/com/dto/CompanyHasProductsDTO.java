package com.dto;

/**
 * 
 * @author vikash pandey
 * 
 */
public class CompanyHasProductsDTO extends AbsCommonDTO {
	private static final long serialVersionUID = -1649164902262161443L;
	private ProductDTO products;
	private Float productPrice;
	private Integer taxApplicable;

	public ProductDTO getProducts() {
		return products;
	}

	public void setProducts(ProductDTO products) {
		this.products = products;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getTaxApplicable() {
		return taxApplicable;
	}

	public void setTaxApplicable(Integer taxApplicable) {
		this.taxApplicable = taxApplicable;
	}

}
