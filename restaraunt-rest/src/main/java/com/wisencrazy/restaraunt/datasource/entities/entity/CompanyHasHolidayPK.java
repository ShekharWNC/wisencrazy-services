package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * The primary key class for the company_has_holiday database table.
 * 
 */
@Embeddable
public class CompanyHasHolidayPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="company_id")
	private int companyId;

	@Column(name = "holiday_date")
	private Date holidayDate;

	public CompanyHasHolidayPK() {
	}
	public int getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public Date getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CompanyHasHolidayPK)) {
			return false;
		}
		CompanyHasHolidayPK castOther = (CompanyHasHolidayPK)other;
		return 
			(this.companyId == castOther.companyId)
			&& this.holidayDate.equals(castOther.holidayDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.companyId;
		hash = hash * prime + this.holidayDate.hashCode();
		return hash;
	}
}