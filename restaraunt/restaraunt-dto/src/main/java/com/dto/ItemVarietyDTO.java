package com.dto;

/**
 * 
 * @author vikash
 *
 */
public class ItemVarietyDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4102340680422204489L;
	private String nm;// name
	private String desc;// description

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
}
