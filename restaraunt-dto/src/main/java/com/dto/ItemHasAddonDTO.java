package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author vikash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHasAddonDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6835810488542314184L;
	private Float price;
	private Boolean mdatory;
	private Float disc;
	private ItemAddonSizeDTO addonSize;
	private ItemAddonDTO addon;

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getMdatory() {
		return mdatory;
	}

	public void setMdatory(Boolean mdatory) {
		this.mdatory = mdatory;
	}

	public Float getDisc() {
		return disc;
	}

	public void setDisc(Float disc) {
		this.disc = disc;
	}

	public ItemAddonSizeDTO getAddonSize() {
		return addonSize;
	}

	public void setAddonSize(ItemAddonSizeDTO addonSize) {
		this.addonSize = addonSize;
	}

	public ItemAddonDTO getAddon() {
		return addon;
	}

	public void setAddon(ItemAddonDTO addon) {
		this.addon = addon;
	}

}
