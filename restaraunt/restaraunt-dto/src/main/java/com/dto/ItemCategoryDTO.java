package com.dto;

import java.util.List;


public class ItemCategoryDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4856958013517778590L;
	private String nm;
	private String desc;
	private String tagName;
	private String photo_url;
	private List<ItemDTO> item;
	
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
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getPhoto_url() {
		return photo_url;
	}
	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}
	public List<ItemDTO> getItem() {
		return item;
	}
	public void setItem(List<ItemDTO> item) {
		this.item = item;
	}
}
