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
@Table(name = "item_variety")
@NamedQueries({ @NamedQuery(name = ItemVariety.FIND_ALL_VARIETY, query = "SELECT v from ItemVariety v") })
public class ItemVariety extends AbsBaseEntity {

	private static final long serialVersionUID = 5752828461885401835L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemVariety.";
	public static final String FIND_ALL_VARIETY = PREFIX + "findAllVariety";
	public static String VALIDATE_VARIETY_NAME = "select id from item_variety where name=:name";
	public static String VALIDATE_NAME = "select hex(sid) from item_variety where name=:name";
	public static String FIND_VARIETY_BY_ITEM = "select iv.* from item_has_variety ihv, item_variety iv where ihv.item_verity_id=iv.id and ihv.item_id=:itemId";
	@Column(name = "name")
	private String nm;
	@Column(name = "description")
	private String desc;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
