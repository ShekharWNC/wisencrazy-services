package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the company_has_printer database table.
 * 
 */
@Embeddable
public class CompanyHasPrinterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ip_address")
	private String ipAddress;

	@Column(name="company_id", insertable=false, updatable=false)
	private int companyId;

	public CompanyHasPrinterPK() {
	}
	public String getIpAddress() {
		return this.ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CompanyHasPrinterPK)) {
			return false;
		}
		CompanyHasPrinterPK castOther = (CompanyHasPrinterPK)other;
		return 
			this.ipAddress.equals(castOther.ipAddress)
			&& (this.companyId == castOther.companyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ipAddress.hashCode();
		hash = hash * prime + this.companyId;
		
		return hash;
	}
}