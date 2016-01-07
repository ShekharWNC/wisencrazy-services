package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the order_status database table.
 * 
 */
@Entity
@Table(name="order_status")
public class OrderStatus extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8776684084641561748L;


	@Column(name="order_status")
	private String orderStatus;

	@Column(name="order_status_key")
	private String orderStatusKey;

	
	public OrderStatus() {
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusKey() {
		return this.orderStatusKey;
	}

	public void setOrderStatusKey(String orderStatusKey) {
		this.orderStatusKey = orderStatusKey;
	}
}