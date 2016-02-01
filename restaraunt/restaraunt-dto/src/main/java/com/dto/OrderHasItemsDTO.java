package com.dto;

public class OrderHasItemsDTO extends AbsCommonDTO {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 3879033774004756347L;

	private Integer quantity;
	
	private Float itemBill;
	
	private ItemDTO item;

	private ItemHasSizeDTO itemHasSize;

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
