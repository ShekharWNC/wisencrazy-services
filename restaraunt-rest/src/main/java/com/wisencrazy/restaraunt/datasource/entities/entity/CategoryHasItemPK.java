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
public class CategoryHasItemPK implements Serializable {

	private static final long serialVersionUID = -6003411359513206062L;
	@Basic(optional = false)
	@NotNull
	@Column(name = "item_id")
	private int itemId;
	@Basic(optional = false)
	@NotNull
	@Column(name = "category_id")
	private int categoryId;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
