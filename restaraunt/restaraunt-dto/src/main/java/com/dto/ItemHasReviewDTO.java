package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemHasReviewDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3123206273810691973L;
	private String review;
	private Float rating;
	private CommonDTO customer;

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public CommonDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CommonDTO customer) {
		this.customer = customer;
	}

}
