package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item")
@NamedQueries({ 
	
})
public class Item extends AbsBaseEntity {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8590770211870429635L;

	@Column(name = "name")
	private String nm;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "price")
	private Float price;
	
	@Column(name = "description")
	private String desc;// description
	
	@Column(name = "url")
	private String picUrl;
	
	@Column(name="item_type")
	private String itemType;
	
	@Column(name="tag_name")
	private String tagName;
	
	@Column(name="isVeg")
	private boolean isVeg;
	
	@JoinColumn(name = "item_category_id", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private ItemCategory itemCategory;
	
	@OneToMany(mappedBy = "item", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<ItemHasSize> sizes;
	
	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}


	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public ItemCategory getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public List<ItemHasSize> getSizes() {
		return sizes;
	}

	public void setSizes(List<ItemHasSize> sizes) {
		this.sizes = sizes;
	}

}
