package com.dto;

/**
 * 
 * @author vikash
 *
 */
public class ItemAddonSizeDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4681854805633868094L;
	private String size;
	private String desc;// description

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
