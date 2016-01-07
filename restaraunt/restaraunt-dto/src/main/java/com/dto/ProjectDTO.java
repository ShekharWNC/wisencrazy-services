package com.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectDTO extends AbsCommonDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3845565586800564891L;

	private String endDate;
	
	private String description;

	private String startDate;
	
	private CompanyDTO company;

	private String name;
	
	private String email;
	
    private String locationName;
    
    private String latitude;
    
    private String longitude;
	
/*	private List<TemplateDTO> template;
*/	
	
/*
	public List<TemplateDTO> getTemplate() {
		return template;
	}

	public void setTemplate(List<TemplateDTO> template) {
		this.template = template;
	}

*/	public String getName() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
