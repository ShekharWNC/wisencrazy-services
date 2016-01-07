package com.dto.core.ordermanagement;

import com.dto.AbsCommonDTO;

public class CoreItemDTO extends AbsCommonDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5851082134796455847L;

	private String extraAttr;

	private double itemPrice;

	private int quantity;

	private double specialPrice;

	private double totalPrice;

	private String name;
	
	public String getExtraAttr() {
		return extraAttr;
	}

	public void setExtraAttr(String extraAttr) {
		this.extraAttr = extraAttr;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSpecialPrice() {
		return specialPrice;
	}

	public void setSpecialPrice(double specialPrice) {
		this.specialPrice = specialPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
