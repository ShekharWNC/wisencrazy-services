package com.dto;

import java.util.List;

public class BusinessInfoDTO extends AbsCommonDTO {

	private String name;
	
	private String companyLogoUrl;
	
	private String description;
	
	private String emailId;
	
	private String website;
	
	private String primaryContactPhone;
	
	private String addressDetails;
	
	private List<BusinessHourDTO> businessHourList;
	
	private List<CompanyHasPlaceDetailsDTO> companyHasPlaceDetails;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyLogoUrl() {
		return companyLogoUrl;
	}

	public void setCompanyLogoUrl(String companyLogoUrl) {
		this.companyLogoUrl = companyLogoUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPrimaryContactPhone() {
		return primaryContactPhone;
	}

	public void setPrimaryContactPhone(String primaryContactPhone) {
		this.primaryContactPhone = primaryContactPhone;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	public List<BusinessHourDTO> getBusinessHourList() {
		return businessHourList;
	}

	public void setBusinessHourList(List<BusinessHourDTO> businessHourList) {
		this.businessHourList = businessHourList;
	}

	public List<CompanyHasPlaceDetailsDTO> getCompanyHasPlaceDetails() {
		return companyHasPlaceDetails;
	}

	public void setCompanyHasPlaceDetails(
			List<CompanyHasPlaceDetailsDTO> companyHasPlaceDetails) {
		this.companyHasPlaceDetails = companyHasPlaceDetails;
	}
}
