package com.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The persistent class for the company_has_address database table.
 * 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyHasPackageDTO extends AbsCommonDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2019184200005973043L;

	private PackageDTO packaze;
    
    private Integer noOfLicences;
    
    private Integer activeLicences;
    
    private Timestamp dateOfPurchase;
    
    private Timestamp activationDate;
    
    private Timestamp expirtationDate;

	public PackageDTO getPackaze() {
		return packaze;
	}

	public void setPackaze(PackageDTO packaze) {
		this.packaze = packaze;
	}

	public Integer getNoOfLicences() {
		return noOfLicences;
	}

	public void setNoOfLicences(Integer noOfLicences) {
		this.noOfLicences = noOfLicences;
	}

	public Integer getActiveLicences() {
		return activeLicences;
	}

	public void setActiveLicences(Integer activeLicences) {
		this.activeLicences = activeLicences;
	}

	public Timestamp getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Timestamp dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Timestamp getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Timestamp activationDate) {
		this.activationDate = activationDate;
	}

	public Timestamp getExpirtationDate() {
		return expirtationDate;
	}

	public void setExpirtationDate(Timestamp expirtationDate) {
		this.expirtationDate = expirtationDate;
	}
    
    
}