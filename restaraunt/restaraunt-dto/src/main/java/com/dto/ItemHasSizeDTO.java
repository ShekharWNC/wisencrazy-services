package com.dto;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "item_has_size")
@NamedQueries({})
public class ItemHasSizeDTO extends AbsCommonDTO {

	private static final long serialVersionUID = -6529456524483888864L;

	private String nm;

	private Float price;
	
	private Boolean avail;
	
	private String desc;
	
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

}
