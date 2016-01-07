package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "item_addon_size")
@NamedQueries({ @NamedQuery(name = ItemAddonSize.FIND_ALL_ADDON_SIZE, query = "SELECT v from ItemAddonSize v"),
})
public class ItemAddonSize extends AbsBaseEntity {

	private static final long serialVersionUID = -6153837520681106351L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemAddonSize.";
	public static final String FIND_ALL_ADDON_SIZE = PREFIX
			+ "findAllAddonSize";
	public static String VALIDATE_ADDON_SIZE_NAME = "select id from item_addon_size where size=:name";
	public static String VALIDATE_NAME = "select hex(sid) from item_addon_size where size=:name";
	public static String FIND_ADDON_SIZE_BY_ITEM = "select iss.* from item_has_addon iha, item_addon_size iss where iha.item_addon_size=iss.id and iha.item_id=:itemId";
	@Column(name = "size")
	private String size;
	@Column(name = "description")
	private String desc;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
