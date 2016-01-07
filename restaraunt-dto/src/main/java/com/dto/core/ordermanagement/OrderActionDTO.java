package com.dto.core.ordermanagement;
import com.dto.AbsCommonDTO;


/**
 * The dto class for the order_actions database table.
 * 
 */
public class OrderActionDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9050086874602511817L;

	private String actionName;

	private String actionType;


	public OrderActionDTO() {
	}


	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderActionDTO [actionName=");
		builder.append(actionName);
		builder.append(", actionType=");
		builder.append(actionType);
		builder.append("]");
		return builder.toString();
	}


}