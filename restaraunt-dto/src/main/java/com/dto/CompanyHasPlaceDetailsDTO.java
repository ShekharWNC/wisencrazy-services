package com.dto;

import com.dto.constants.EnumConstants.PlaceOrigin;

public class CompanyHasPlaceDetailsDTO extends AbsCommonDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4219686762617745266L;

	private String longitude;
	
	private String latitude;
	
	private String placeId;
	
	private PlaceOrigin origin;
	
	private String placeName;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

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

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
}
