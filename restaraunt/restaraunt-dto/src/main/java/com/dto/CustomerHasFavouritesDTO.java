package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.constants.EnumConstants.PlaceOrigin;


@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerHasFavouritesDTO extends AbsCommonDTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3480205476515334291L;

	private String placeId;
	
	private PlaceOrigin origin;
	
	private String customerSid;
	
	private String companySid;

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public PlaceOrigin getOrigin() {
		return origin;
	}

	public void setOrigin(PlaceOrigin origin) {
		this.origin = origin;
	}

	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

}
