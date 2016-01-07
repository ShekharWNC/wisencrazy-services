package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the order_has_item_detail database table.
 * 
 */
@Entity
@Table(name="order_has_item_detail")
public class OrderHasItemDetail extends AbsBaseEntity  {
	/**
	 * 
	 */
	private static final long serialVersionUID = -307631347759678367L;

	@Lob
	@Column(name="extra_attr")
	private String extraAttr;

	@Column(name="item_price")
	private Double itemPrice;

	private Integer quantity;


	@Column(name="special_price")
	private Double specialPrice;

	@Column(name="total_price")
	private Double totalPrice;

	//bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;


	public OrderHasItemDetail() {
	}


	public String getExtraAttr() {
		return this.extraAttr;
	}

	public void setExtraAttr(String extraAttr) {
		this.extraAttr = extraAttr;
	}

	public Double getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getSpecialPrice() {
		return this.specialPrice;
	}

	public void setSpecialPrice(Double specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}