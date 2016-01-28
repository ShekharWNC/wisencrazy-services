package com.dto;

public class OrderHasItemsDTO extends AbsCommonDTO {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 3879033774004756347L;

	private Integer orderId;
	
	private Integer itemId;
	
	private Integer itemHasSizeId;

	private Integer quantity;
	
	private Float itemBill;
	
	private ItemDTO item;

	private ItemHasSizeDTO itemHasSize;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemHasSizeId() {
		return itemHasSizeId;
	}

	public void setItemHasSizeId(Integer itemHasSizeId) {
		this.itemHasSizeId = itemHasSizeId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getItemBill() {
		return itemBill;
	}

	public void setItemBill(Float itemBill) {
		this.itemBill = itemBill;
	}

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}

	public ItemHasSizeDTO getItemHasSize() {
		return itemHasSize;
	}

	public void setItemHasSize(ItemHasSizeDTO itemHasSize) {
		this.itemHasSize = itemHasSize;
	}

	
    
}
