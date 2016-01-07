package com.dto;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author vikash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemInputDTO extends ItemDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6190371121033822888L;
	private Float rmngQty;// remaining quantity
	private Float totalQty;// total quantity
	private List<ItemHasAttachmentDTO> attached;// itemHasAttachment
	private List<ItemHasTimingDTO> times;// itemTimining
	private List<ItemHasSizeInputDTO> sizes;// itemTimining
	private List<ItemHasVarietyDTO> variety; // itemHasVariety
	private List<ItemHasAddonInputDTO> addon;// itemHasAddon
	private List<ItemHasReviewDTO> review;

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

	public List<ItemHasAttachmentDTO> getAttached() {
		return attached;
	}

	public void setAttached(List<ItemHasAttachmentDTO> attached) {
		this.attached = attached;
	}

	public List<ItemHasTimingDTO> getTimes() {
		return times;
	}

	public void setTimes(List<ItemHasTimingDTO> times) {
		this.times = times;
	}

	public List<ItemHasSizeInputDTO> getSizes() {
		return sizes;
	}

	public void setSizes(List<ItemHasSizeInputDTO> sizes) {
		this.sizes = sizes;
	}

	public List<ItemHasVarietyDTO> getVariety() {
		return variety;
	}

	public void setVariety(List<ItemHasVarietyDTO> variety) {
		this.variety = variety;
	}

	public List<ItemHasAddonInputDTO> getAddon() {
		return addon;
	}

	public void setAddon(List<ItemHasAddonInputDTO> addon) {
		this.addon = addon;
	}

	public List<ItemHasReviewDTO> getReview() {
		return review;
	}

	public void setReview(List<ItemHasReviewDTO> review) {
		this.review = review;
	}

}
