package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * @author vikash
 */
@Embeddable
public class ItemHasAddonPK implements Serializable {

	private static final long serialVersionUID = -1064362724912888200L;
	@Basic(optional = false)
	@NotNull
	@Column(name = "item_id")
	private int itemId;
	@Basic(optional = false)
	@NotNull
	@Column(name = "item_addon_id")
	private int itemAddonId;
	

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemAddonId() {
		return itemAddonId;
	}

	public void setItemAddonId(int itemAddonId) {
		this.itemAddonId = itemAddonId;
	}
}
