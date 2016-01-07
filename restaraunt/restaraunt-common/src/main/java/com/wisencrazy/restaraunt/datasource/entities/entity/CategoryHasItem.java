package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name = "category_has_item")
public class CategoryHasItem extends AbsCompositeEntity {
	
	
	private static final long serialVersionUID = 6386723357336947293L;
	public static String VALIDATE_ITEM_CATEGORY="select hex(sid) from category_has_item where item_id=:itemId and category_id=:categoryId";
	@EmbeddedId
	CategoryHasItemPK itemCategory;
    
	public CategoryHasItemPK getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(CategoryHasItemPK itemCategory) {
		this.itemCategory = itemCategory;
	}

}
