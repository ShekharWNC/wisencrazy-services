package com.dto.core.ordermanagement;

import com.dto.AbsCommonDTO;


/**
 * The dto class for the order_status database table.
 * 
 */
public class OrderStateDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1149268844190505630L;

	private String orderstateKey;

	private String orderstateName;

	public OrderStateDTO() {
	}

	public String getOrderstateKey() {
		return orderstateKey;
	}

	public void setOrderstateKey(String orderstateKey) {
		this.orderstateKey = orderstateKey;
	}

	public String getOrderstateName() {
		return orderstateName;
	}

	public void setOrderstateName(String orderstateName) {
		this.orderstateName = orderstateName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderStateDTO [orderstateKey=");
		builder.append(orderstateKey);
		builder.append(", orderstateName=");
		builder.append(orderstateName);
		builder.append("]");
		return builder.toString();
	}

}