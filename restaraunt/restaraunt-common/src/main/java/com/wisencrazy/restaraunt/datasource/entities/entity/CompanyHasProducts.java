package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author vikash pandey
 */
@Entity
@Table(name="company_has_products")
public class CompanyHasProducts extends AbsBaseEntity {

	private static final long serialVersionUID = 3997496095977057709L;

	@Column(name = "product_price")
	private Float productPrice;
	@Column(name = "tax_applicable")
	private Integer taxApplicable;
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	@ManyToOne
	private Company company;
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	@ManyToOne
	private Product products;

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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
}
