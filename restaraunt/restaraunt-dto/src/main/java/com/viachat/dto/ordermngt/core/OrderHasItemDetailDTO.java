package com.viachat.dto.ordermngt.core;

import java.io.Serializable;

import com.dto.ItemDTO;




public class OrderHasItemDetailDTO implements Serializable {

	private static final long serialVersionUID = -7913899370090320335L;
	
	private String extraAttr;
	private Double itemPrice;
	private Integer quantity;
	private Double specialPrice;
	private Double totalPrice;
	private ItemDTO item;

	public String getExtraAttr() {
		return extraAttr;
	}

	public void setExtraAttr(String extraAttr) {
		this.extraAttr = extraAttr;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(Double specialPrice) {
		this.specialPrice = specialPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}

}
