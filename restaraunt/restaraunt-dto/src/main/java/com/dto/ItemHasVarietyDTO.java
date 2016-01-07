package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHasVarietyDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7522506190071073932L;
	private Float price;
	private Boolean mdatory;// mandatory
	private ItemVarietyDTO variety;// variety

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	public ItemVarietyDTO getVariety() {
		return variety;
	}

	public Boolean getMdatory() {
		return mdatory;
	}

	public void setMdatory(Boolean mdatory) {
		this.mdatory = mdatory;
	}

	public void setVariety(ItemVarietyDTO variety) {
		this.variety = variety;
	}
}
