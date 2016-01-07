package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 * 
 */
@Entity
@Table(name = "order_details_has_products")
@NamedQueries({
	@NamedQuery(name=OrderDetailsHasProducts.FIND_PRODUCT_DETAILS_BY_ORDER_ID,query="from OrderDetailsHasProducts o where o.orderDetails.id=:orderDetailsId")
})
public class OrderDetailsHasProducts extends AbsBaseEntity {
    
	private static final long serialVersionUID = -749155253450176283L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.OrderDetailsHasProducts.";
	public static final String FIND_PRODUCT_DETAILS_BY_ORDER_ID="findProductDetailsByOrderId";
	@Column(name = "no_of_quantity")
	private Integer noOfQuantity;
	@JoinColumn(name = "order_details_id", referencedColumnName = "id")
	@ManyToOne
	private OrderDetails orderDetails;
	@JoinColumn(name = "company_has_product_id", referencedColumnName = "id")
	@ManyToOne
	private CompanyHasProducts companyHasProducts;

	public Integer getNoOfQuantity() {
		return noOfQuantity;
	}

	public void setNoOfQuantity(Integer noOfQuantity) {
		this.noOfQuantity = noOfQuantity;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	public CompanyHasProducts getCompanyHasProducts() {
		return companyHasProducts;
	}

	public void setCompanyHasProducts(CompanyHasProducts companyHasProducts) {
		this.companyHasProducts = companyHasProducts;
	}

}
