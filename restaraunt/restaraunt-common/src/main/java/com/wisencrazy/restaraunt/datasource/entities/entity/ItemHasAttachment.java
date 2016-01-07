package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "item_has_attachment")
@NamedQueries({ 
	@NamedQuery(name = ItemHasAttachment.FIND_ALL_ATTACHEMENT_BY_ITEM, query = "SELECT c FROM ItemHasAttachment c WHERE c.item.sid =unhex(:itemSid)"),
	})
public class ItemHasAttachment extends AbsBaseEntity {
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemHasAttachment";
	public static final String FIND_ALL_ATTACHEMENT_BY_ITEM = PREFIX+ "findAllAttachementByItem";
	private static final long serialVersionUID = 4561161143958570388L;
	public static final String DELETE_ITEM_ATTACHMENT_BY_ATTACHMENT_SID="delete from item_has_attachment where sid=unhex(:sid)";
	@Column(name = "name")
	private String nm;
	@Column(name = "url")
	private String url;
	@Column(name = "type")
	private String type;
	@Column(name = "description")
	private String desc;
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	@ManyToOne
	private Item item;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
