package com.dto.core.ordermanagement;

import com.dto.AbsCommonDTO;


/**
 * The dto class for the order_status database table.
 * 
 */
public class OrderStatusDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1149268844190505630L;

	private String orderStatus;

	private String orderStatusKey;

	public OrderStatusDTO() {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderStatusDTO [orderStatus=");
		builder.append(orderStatus);
		builder.append(", orderStatusKey=");
		builder.append(orderStatusKey);
		builder.append("]");
		return builder.toString();
	}

}