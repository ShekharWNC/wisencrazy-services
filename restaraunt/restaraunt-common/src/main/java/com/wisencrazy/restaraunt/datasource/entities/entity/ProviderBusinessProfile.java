package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the provider_buisness_profile database table.
 * 
 */
@Entity
@Table(name="provider_buisness_profile")
public class ProviderBusinessProfile extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String keywords;

	@Column(name="minimum_hourly_rate")
	private float minimumHourlyRate;

	private String overview;

	@Column(name="payment_terms")
	private String paymentTerms;

	@Column(name="service_description")
	private String serviceDescription;

	private String tagline;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private Appuser appuser;

	//bi-directional many-to-one association to Company
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;

	public ProviderBusinessProfile() {
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

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}