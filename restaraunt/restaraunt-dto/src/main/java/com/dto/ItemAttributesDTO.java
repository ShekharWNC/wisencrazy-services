package com.dto;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemAttributesDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 9110365324201883507L;

	private List<ItemHasAttachmentDTO> atments;// attachments
	private List<ItemHasReviewDTO> reviews;
	private List<ItemHasSizeInputDTO> sizes;
	private List<ItemHasVarietyDTO> varieties;
	private List<ItemHasAddonDTO> addons;
	private List<ItemHasTimingDTO> timings;
	

	public List<ItemHasAttachmentDTO> getAtments() {
		return atments;
	}

	public void setAtments(List<ItemHasAttachmentDTO> atments) {
		this.atments = atments;
	}

	public List<ItemHasReviewDTO> getReviews() {
		return reviews;
	}

	public void setReviews(List<ItemHasReviewDTO> reviews) {
		this.reviews = reviews;
	}
	public List<ItemHasSizeInputDTO> getSizes() {
		return sizes;
	}

	public void setSizes(List<ItemHasSizeInputDTO> sizes) {
		this.sizes = sizes;
	}

	public List<ItemHasTimingDTO> getTimings() {
		return timings;
	}

	public void setTimings(List<ItemHasTimingDTO> timings) {
		this.timings = timings;
	}

	public List<ItemHasVarietyDTO> getVarieties() {
		return varieties;
	}

	public void setVarieties(List<ItemHasVarietyDTO> varieties) {
		this.varieties = varieties;
	}

	public List<ItemHasAddonDTO> getAddons() {
		return addons;
	}

	public void setAddons(List<ItemHasAddonDTO> addons) {
		this.addons = addons;
	}

}
