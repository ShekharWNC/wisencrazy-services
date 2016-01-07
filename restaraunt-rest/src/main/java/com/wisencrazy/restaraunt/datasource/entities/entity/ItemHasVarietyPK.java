package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author vikash
 *
 */
@Embeddable
public class ItemHasVarietyPK implements Serializable {

	private static final long serialVersionUID = -6946206738814165015L;
	@Basic(optional = false)
	@NotNull
	@Column(name = "item_id")
	private int itemId;
	@NotNull
	@Column(name = "item_verity_id")
	@Basic(optional = false)
	private int itemVerityId;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemVerityId() {
		return itemVerityId;
	}

	public void setItemVerityId(int itemVerityId) {
		this.itemVerityId = itemVerityId;
	}
}
