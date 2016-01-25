package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
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
	
	@Column(name = "discount")
	private Float disc;
	
	@Column(name = "remaining_quantity")
	private Float rmngQty;// remaining quantity
	
	@Column(name = "total_quantity")
	private Float totalQty;// total quantity
	
	@Column(name = "description")
	private String desc;// description
	
	@Column(name = "is_available")
	private Boolean avail;
	
	@Column(name = "url")
	private String picUrl;
	
	@Column(name="item_type")
	private String itemType;
	
	@Column(name="tag_name")
	private String tagName;
	
	@JoinColumn(name = "restro_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Restaraunt restaraunt;

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

	public Float getDisc() {
		return disc;
	}

	public void setDisc(Float disc) {
		this.disc = disc;
	}

	public Float getRmngQty() {
		return rmngQty;
	}

	public void setRmngQty(Float rmngQty) {
		this.rmngQty = rmngQty;
	}

	public Float getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Float totalQty) {
		this.totalQty = totalQty;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void setAvail(Boolean avail) {
		this.avail = avail;
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

	public Restaraunt getRestaraunt() {
		return restaraunt;
	}

	public void setRestaraunt(Restaraunt restaraunt) {
		this.restaraunt = restaraunt;
	}

	
}
