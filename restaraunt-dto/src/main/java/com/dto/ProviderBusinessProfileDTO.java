package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the provider_buisness_profile database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProviderBusinessProfileDTO extends AbsCommonDTO  implements Serializable {
	private static final long serialVersionUID = 1L;


	private String keywords = "";

	private float minimumHourlyRate = 0;

	private String overview = "";

	private String paymentTerms = "";

	private String serviceDescription = "";

	private String tagline = "";
	

	//bi-directional many-to-one association to Company
	private CompanyDTO company;

//	bi-directional many-to-one association to User
	private AppuserDTO user;

	public ProviderBusinessProfileDTO(String keywords,
			float minimumHourlyRate, String overview, String paymentTerms,
			String serviceDescription, String tagline
			,CompanyDTO company,	AppuserDTO user
			) {
		super();
		this.keywords = keywords;
		this.minimumHourlyRate = minimumHourlyRate;
		this.overview = overview;
		this.paymentTerms = paymentTerms;
		this.serviceDescription = serviceDescription;
		this.tagline = tagline;
		this.company = company;
		this.user = user;
	}

	public ProviderBusinessProfileDTO() {
	}
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public float getMinimumHourlyRate() {
		return this.minimumHourlyRate;
	}

	public void setMinimumHourlyRate(float minimumHourlyRate) {
		this.minimumHourlyRate = minimumHourlyRate;
	}

	public String getOverview() {
		return this.overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public String getTagline() {
		return this.tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public CompanyDTO getCompany() {
		return this.company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}