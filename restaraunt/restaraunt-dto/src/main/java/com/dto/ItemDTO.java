package com.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class ItemDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4237019838883553966L;

	private String nm;
	
	private String size;
	
	private Float price;
	
	private Float disc;
	
	private Float rmngQty;// remaining quantity
	
	private Float totalQty;// total quantity
	
	private String desc;// description
	
	private Boolean avail;
	
	private String picUrl;
	
	private String itemType;
	
	private String tagName;
	
	private boolean isVeg;
	
	private List<ItemHasSizeDTO> sizes;

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

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public List<ItemHasSizeDTO> getSizes() {
		return sizes;
	}

	public void setSizes(List<ItemHasSizeDTO> sizes) {
		this.sizes = sizes;
	}
	
}
