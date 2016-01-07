package com.dto;

import java.sql.Timestamp;

import javax.persistence.Column;

public class ProjectBasicDTO extends AbsCommonDTO {
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	private String endDate;
	
	private String startDate;
	
	private CompanyCommonDTO company;
	
	private String email;
	
	private int maxChats;
	
	private String chatGreeting;
	
	private String description;
	
	private Boolean isActive;
	
    private String locationName;
    
    private String latitude;
    
    private String longitude;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public CompanyCommonDTO getCompany() {
		return company;
	}
	
	public void setCompany(CompanyCommonDTO company) {
		this.company = company;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMaxChats() {
		return maxChats;
	}
	
	public void setMaxChats(int maxChats) {
		this.maxChats = maxChats;
	}
	
	public String getChatGreeting() {
		return chatGreeting;
	}
	
	public void setChatGreeting(String chatGreeting) {
		this.chatGreeting = chatGreeting;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
