package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the ivr_item_has_ivr_action database table.
 * 
 */
@Embeddable
public class IvrItemHasIvrActionPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="ivr_item_id")
	private int ivrItemId;

	@Column(name="ivr_action_id")
	private int ivrActionId;

	public IvrItemHasIvrActionPK() {
	}
	public int getIvrItemId() {
		return this.ivrItemId;
	}
	public void setIvrItemId(int ivrItemId) {
		this.ivrItemId = ivrItemId;
	}
	public int getIvrActionId() {
		return this.ivrActionId;
	}
	public void setIvrActionId(int ivrActionId) {
		this.ivrActionId = ivrActionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IvrItemHasIvrActionPK)) {
			return false;
		}
		IvrItemHasIvrActionPK castOther = (IvrItemHasIvrActionPK)other;
		return 
			(this.ivrItemId == castOther.ivrItemId)
			&& (this.ivrActionId == castOther.ivrActionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ivrItemId;
		hash = hash * prime + this.ivrActionId;
		
		return hash;
	}
	
	/*private Integer ivrItem;
	
	private Integer ivrAction;
	
	public IvrItemHasIvrActionPK() {

	}

	public Integer getIvrItem() {
		return ivrItem;
	}

	public void setIvrItem(Integer ivrItem) {
		this.ivrItem = ivrItem;
	}

	public Integer getIvrAction() {
		return ivrAction;
	}

	public void setIvrAction(Integer ivrAction) {
		ivrAction = ivrAction;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IvrItemHasIvrActionPK)) {
			return false;
		}
		IvrItemHasIvrActionPK castOther = (IvrItemHasIvrActionPK)other;
		return 
			(this.ivrItem == castOther.ivrItem)
			&& (this.ivrAction == castOther.ivrAction);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ivrItem;
		hash = hash * prime + this.ivrAction;
		
		return hash;
	}*/
}