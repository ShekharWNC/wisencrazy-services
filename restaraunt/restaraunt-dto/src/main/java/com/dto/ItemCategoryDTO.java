package com.dto;

public class ItemCategoryDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4856958013517778590L;
	private String nm;
	private String desc;
	private String tagName;
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
