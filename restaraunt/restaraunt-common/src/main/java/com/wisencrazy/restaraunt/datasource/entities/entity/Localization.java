package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the localization database table.
 * 
 */
@Entity
@Table(name="localization")
@NamedQueries({
	@NamedQuery(name = Localization.FIND_TIMEZONE_BY_COMPANY_ID, query = "SELECT l.timezone FROM Localization l where l.company.id = :id")
})
public class Localization extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Localization.";
	
	public static final String FIND_TIMEZONE_BY_COMPANY_ID = PREFIX + "findTimezoneByCompanyId";


	@OneToOne
	@JoinColumn(name="company_id")
	private Company company;


	@Column(name="time_format")
	private String timeFormat;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="language_id")
	private Language language;

	//bi-directional many-to-one association to Timezone
	@ManyToOne
	@JoinColumn(name="timezone_id")
	private Timezone timezone;

	public Localization() {
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getTimeFormat() {
		return this.timeFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Timezone getTimezone() {
		return this.timezone;
	}

	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}

}