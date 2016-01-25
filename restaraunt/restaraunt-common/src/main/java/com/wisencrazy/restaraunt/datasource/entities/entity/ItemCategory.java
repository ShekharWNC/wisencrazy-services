package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author shekhar8161
 *
 */
@Entity
@Table(name = "item_category")
public class ItemCategory extends AbsBaseEntity {

	private static final long serialVersionUID = -43139407789703374L;
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.ItemCategory.";
	@Column(name = "name")
	private String nm;
	@Column(name = "description")
	private String desc;
	@Column(name="tag_name")
	private String tagName;
	@Column(name="photo_url")
	private String photo_url;

	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getNm() {
		return nm;
	}
	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
