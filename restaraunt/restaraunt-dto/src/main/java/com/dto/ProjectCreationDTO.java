package com.dto;
import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectCreationDTO extends AbsCommonDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8476731802278985518L;
	private String name;
	private String description;
	private TimezoneDTO timezone;
	private List<BusinessHourDTO> businessHours;
	private Boolean isDefault;

	private String locationName;
    
    private String latitude;
    
    private String longitude;
    
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
	public TimezoneDTO getTimezone() {
		return timezone;
	}
	public void setTimezone(TimezoneDTO timezone) {
		this.timezone = timezone;
	}
	public List<BusinessHourDTO> getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(List<BusinessHourDTO> businessHours) {
		this.businessHours = businessHours;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
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
