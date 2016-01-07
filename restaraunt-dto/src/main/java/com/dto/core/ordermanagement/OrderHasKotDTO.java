package com.dto.core.ordermanagement;

import java.sql.Timestamp;

import com.dto.AbsCommonDTO;


/**
 * The dto class for the order_has_kot database table.
 * 
 */
public class OrderHasKotDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -962237099598572393L;

	private Timestamp createdDate;

	private String kot;

	private String kotStatus;

	private String orderSid;

	public OrderHasKotDTO() {
	}


	public String getKot() {
		return this.kot;
	}

	public void setKot(String kot) {
		this.kot = kot;
	}

	public String getKotStatus() {
		return this.kotStatus;
	}

	public void setKotStatus(String kotStatus) {
		this.kotStatus = kotStatus;
	}

	
	public String getOrderSid() {
		return orderSid;
	}


	public void setOrderSid(String orderSid) {
		this.orderSid = orderSid;
	}


	public Timestamp getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderHasKotDTO [createdDate=");
		builder.append(createdDate);
		builder.append(", kot=");
		builder.append(kot);
		builder.append(", kotStatus=");
		builder.append(kotStatus);
		builder.append(", orderSid=");
		builder.append(orderSid);
		builder.append("]");
		return builder.toString();
	}
}