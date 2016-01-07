package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorySearchDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 6624271816360244358L;
	private String name;
	private String description;
	private String keywords;
	private String photoUrl;
	private String location;
	private String city;
	private String state;
	private String country;
	private Float customerRating;
	private String customerFeedbacks;
	private String projectSid;
	private String projectName;
	private String companySid;
	private String visualConnectSid;
	private String href;
	private String longitude;
	private String latitude;
	private String distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Float getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(Float customerRating) {
		this.customerRating = customerRating;
	}

	public String getCustomerFeedbacks() {
		return customerFeedbacks;
	}

	public void setCustomerFeedbacks(String customerFeedbacks) {
		this.customerFeedbacks = customerFeedbacks;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getVisualConnectSid() {
		return visualConnectSid;
	}

	public void setVisualConnectSid(String visualConnectSid) {
		this.visualConnectSid = visualConnectSid;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
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

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
    
}
