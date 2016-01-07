package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.constants.EnumConstants.PlaceOrigin;
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyLocationAndKeywordDTO extends CompanyCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5577511972531114954L;
	private String keywords;
	private String placeName;
	private String longitude;
	private String latitude;
	private String placeId;
	private PlaceOrigin origin;
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
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
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public PlaceOrigin getOrigin() {
		return origin;
	}
	public void setOrigin(PlaceOrigin origin) {
		this.origin = origin;
	}

}
