package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * The persistent class for the provider_profile database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProviderProfileDTO extends AbsCommonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String keywords = "";

	private float minimumHourlyRate = 0;

	private String overview = "";

	private String paymentTerms = "";

	private String serviceDescription = "";

	private byte status = 0;

	private String tagline = "";

	//bi-directional many-to-one association to User
	private AppuserDTO user = null;

	public ProviderProfileDTO() {
	}

	public ProviderProfileDTO(String keywords, float minimumHourlyRate,
			String overview, String paymentTerms, String serviceDescription,
			byte status, String tagline, AppuserDTO user) {
		super();
		this.keywords = keywords;
		this.minimumHourlyRate = minimumHourlyRate;
		this.overview = overview;
		this.paymentTerms = paymentTerms;
		this.serviceDescription = serviceDescription;
		this.status = status;
		this.tagline = tagline;
		this.user = user;
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

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTagline() {
		return this.tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public AppuserDTO getUser() {
		return this.user;
	}

	public void setUser(AppuserDTO user) {
		this.user = user;
	}

}