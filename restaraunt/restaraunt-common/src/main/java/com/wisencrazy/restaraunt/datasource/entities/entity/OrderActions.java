package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the order_actions database table.
 * 
 */
@Entity
@Table(name="order_actions")
public class OrderActions extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3335809948424310955L;

	@Column(name="action_name")
	private String actionName;

	@Column(name="action_type")
	private String actionType;


	public OrderActions() {
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


}