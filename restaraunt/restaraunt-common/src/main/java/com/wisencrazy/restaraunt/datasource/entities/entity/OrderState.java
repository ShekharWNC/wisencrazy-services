package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the order_states database table.
 * 
 */
@Entity
@Table(name="order_state")
@NamedQuery(name="OrderState.findAll", query="SELECT o FROM OrderState o")
public class OrderState extends com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 517102308583761017L;

	@Column(name="orderstate_key")
	private String orderstateKey;

	@Column(name="orderstate_name")
	private String orderstateName;

	

	public OrderState() {
	}

	
	public String getOrderstateKey() {
		return this.orderstateKey;
	}

	public void setOrderstateKey(String orderstateKey) {
		this.orderstateKey = orderstateKey;
	}

	public String getOrderstateName() {
		return this.orderstateName;
	}

	public void setOrderstateName(String orderstateName) {
		this.orderstateName = orderstateName;
	}

}