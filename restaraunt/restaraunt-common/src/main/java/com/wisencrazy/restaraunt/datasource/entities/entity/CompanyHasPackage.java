package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "company_has_package")
@NamedQueries({
	/*@NamedQuery(name = CompanyHasPackage.UPDATE_COMPANY_PACKAGE, query = "update CompanyHasPackage chp " +
			"set chp.packaze.id = :packageId, chp.dateOfPurchase = :dateOfPurchase" +
			", chp.activationDate = :activationDate, chp.expirationDate = :expirationDate" +
			", chp.appuser.id = :appuserid where hex(chp.company.sid) = :companysid " +
			"and hex(chp.packaze.sid) = :oldPackageSid"),*/
	@NamedQuery(name = CompanyHasPackage.POPULATE_BY_PACKAGE_AND_COMPANY, query = "from CompanyHasPackage chp " +
			"where hex(chp.company.sid) = :companySid and hex(chp.packaze.sid) = :packageSid"),
	@NamedQuery(name=CompanyHasPackage.POPULATE_BY_PACKAGE_BY_COMPANY, query="select chp.packaze.name from CompanyHasPackage chp where hex(chp.company.sid)=:companySid")
})
public class CompanyHasPackage extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7431272309405157980L;
	
	 public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyHasPackage.";
	 
	 public static final String UPDATE_COMPANY_PACKAGE = PREFIX + "updateCompanyPackage";
	 
	 public static final String POPULATE_BY_PACKAGE_AND_COMPANY = PREFIX + "populateByCompanyAndPackageSid";
	 public static final String POPULATE_BY_PACKAGE_BY_COMPANY = PREFIX + "populatePackageByCompany";

    @JoinColumn(name = "package_id", referencedColumnName = "id")
    @ManyToOne
    private Package packaze;
    
    @Column(name = "no_of_licences")
    private Integer noOfLicences;
    
    @Column(name = "active_licences")
    private Integer activeLicences;
    
    @Column(name = "date_of_purchase")
    private Timestamp dateOfPurchase;
    
    @Column(name = "activation_date")
    private Timestamp activationDate;
    
    @Column(name = "expiration_date")
    private Timestamp expirtationDate;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by")
    private Appuser appuser;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", insertable = false, updatable = false, nullable = false)
    private Company company;

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

	public Package getPackaze() {
		return packaze;
	}

	public void setPackaze(Package packaze) {
		this.packaze = packaze;
	}

	public Appuser getAppuser() {
		return appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
