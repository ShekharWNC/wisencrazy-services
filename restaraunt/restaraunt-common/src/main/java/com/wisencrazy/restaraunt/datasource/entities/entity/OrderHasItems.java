package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="order_has_items")
@NamedQueries({

})
public class OrderHasItems extends AbsBaseEntity {
		
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5558798029779642735L;

	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.OrderHasItems.";
	
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="item_id")
	private Integer itemId;
	
	@Column(name="item_has_size_id")
	private Integer itemHasSizeId;

	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="item_bill")
	private Float itemBill;
	
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Order order;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Item item;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "item_has_size_id", referencedColumnName = "id", insertable = false, updatable = false)
	private ItemHasSize itemHasSize;

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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getItemHasSizeId() {
		return itemHasSizeId;
	}

	public void setItemHasSizeId(Integer itemHasSizeId) {
		this.itemHasSizeId = itemHasSizeId;
	}

	public Float getItemBill() {
		return itemBill;
	}

	public void setItemBill(Float itemBill) {
		this.itemBill = itemBill;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ItemHasSize getItemHasSize() {
		return itemHasSize;
	}

	public void setItemHasSize(ItemHasSize itemHasSize) {
		this.itemHasSize = itemHasSize;
	}
    
    
}
