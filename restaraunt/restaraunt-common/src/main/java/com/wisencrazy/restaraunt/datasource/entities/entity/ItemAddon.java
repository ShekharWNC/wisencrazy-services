package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name = "item_addon")
@NamedQueries({ @NamedQuery(name = ItemAddon.FIND_ALL_ADDON, query = "SELECT v from ItemAddon v") })
public class ItemAddon extends AbsBaseEntity {

	private static final long serialVersionUID = 2466982639305521916L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemAddon.";
	public static final String FIND_ALL_ADDON = PREFIX + "findAllAddon";
	public static String VALIDATE_ADDON_NAME = "select id from item_addon where addon_name=:name";
	public static String VALIDATE_NAME = "select hex(sid) from item_addon where addon_name=:name";
	public static String FIND_ADDON_BY_ITEM = "select ia.* from item_has_addon iha, item_addon ia where iha.item_addon_id=ia.id and iha.item_id=:itemId";
	@Column(name = "addon_name")
	private String addonnm;
	@Column(name = "description")
	private String desc;

	public String getAddonnm() {
		return addonnm;
	}

	public void setAddonnm(String addonnm) {
		this.addonnm = addonnm;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
