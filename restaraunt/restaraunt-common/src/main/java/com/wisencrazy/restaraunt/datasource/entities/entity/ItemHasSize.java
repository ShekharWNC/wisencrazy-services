package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "item_has_size")
@NamedQueries({})
public class ItemHasSize extends AbsBaseEntity {

	private static final long serialVersionUID = -8294056610697239139L;
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.ItemHasSize";

	@Column(name = "name")
	private String nm;

	@Column(name = "price")
	private Float price;
	
	@Column(name = "is_available")
	private Boolean avail;
	
	@Column(name = "description")
	private String desc;
	
	@JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private Item item;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void setAvail(Boolean avail) {
		this.avail = avail;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	
}
