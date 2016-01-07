package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "category_has_attachment")
public class CategoryHasAttachment extends AbsBaseEntity {

	private static final long serialVersionUID = 7315153665985675103L;
	@Column(name = "name")
	private String nm;
	@Column(name = "url")
	private String url;
	@Column(name = "type")
	private String type;
	@Column(name = "description")
	private String desc;
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ItemCategory category;

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

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}

}