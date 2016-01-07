package com.dto;

/**
 * 
 * @author vikash pandey
 * 
 */
public class OrderDetailsDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 1483925617103618334L;

	public enum STATUS {
		ENABLED, DISABLED
	}

	private STATUS status;
	private String orderId;

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
