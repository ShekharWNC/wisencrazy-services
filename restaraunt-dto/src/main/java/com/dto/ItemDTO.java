package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author vikash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDTO extends AbsCommonDTO {

	private static final long serialVersionUID = -6861176943054958503L;
	private String nm;// name
	private String size;
	private Float price;
	private Float disc;// discount
	private String desc;// description
	private Boolean avail;// available
	private Float ovrallrting;// overall rating
	private Boolean hasV;// hasVariety
	private Boolean hasA;// hasAddon
	private Boolean hasCF;// hasCustomeField
	private Boolean hasTime;// hasTimingin
	private Boolean hasSize;
	private String picUrl;
	private String attribJson;// attributeJson
	private String attribHref;// attribute href
	private String itemType;
	private String tagName;

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

	public Float getOvrallrting() {
		return ovrallrting;
	}

	public void setOvrallrting(Float ovrallrting) {
		this.ovrallrting = ovrallrting;
	}

	public Boolean getHasV() {
		return hasV;
	}

	public void setHasV(Boolean hasV) {
		this.hasV = hasV;
	}

	public Boolean getHasA() {
		return hasA;
	}

	public void setHasA(Boolean hasA) {
		this.hasA = hasA;
	}

	public Boolean getHasCF() {
		return hasCF;
	}

	public void setHasCF(Boolean hasCF) {
		this.hasCF = hasCF;
	}

	public Boolean getHasTime() {
		return hasTime;
	}

	public void setHasTime(Boolean hasTime) {
		this.hasTime = hasTime;
	}

	public Boolean getHasSize() {
		return hasSize;
	}

	public void setHasSize(Boolean hasSize) {
		this.hasSize = hasSize;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getAttribJson() {
		return attribJson;
	}

	public void setAttribJson(String attribJson) {
		this.attribJson = attribJson;
	}

	public String getAttribHref() {
		return attribHref;
	}

	public void setAttribHref(String attribHref) {
		this.attribHref = attribHref;
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
	
}
