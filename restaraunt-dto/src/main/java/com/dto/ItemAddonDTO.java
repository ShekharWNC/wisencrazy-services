package com.dto;

/**
 * 
 * @author vikash
 *
 */
public class ItemAddonDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2880674420173607712L;
	private String addonnm;// addonName
	private String desc;// description

	public String getAddonnm() {
		return addonnm;
	}

	public void setAddonnm(String addonnm) {
		this.addonnm = addonnm;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
