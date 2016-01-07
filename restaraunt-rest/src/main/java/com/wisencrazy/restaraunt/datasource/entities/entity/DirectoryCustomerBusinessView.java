package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * 
 * @author Vikash Pandey
 *
 */
@Entity
@Table(name="directory_customer_business_view")
@NamedQueries({
	@NamedQuery(name=DirectoryCustomerBusinessView.FIND_ACCOUNT_BY_COMPANY_AND_ACCOUNTSID,query="from DirectoryCustomerBusinessView a where hex(a.companySid)=:companySid and hex(a.sid)=:accountSid")
	
})
public class DirectoryCustomerBusinessView extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6275027232887274910L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.DirectoryCustomerBusinessView.";
	public static final String FIND_ACCOUNT_BY_COMPANY_AND_ACCOUNTSID=PREFIX+"findAccountByCompanyAndAccountSid";
	
	@Column(name = "account_name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "title")
	private String title;
	@Column(name = "company_id")
	private Integer companyId;
	@Column(name = "company_sid")
	private byte[] companySid;
	@Column(name = "country_name")
	private String countryName;
	@Column(name = "person_name")
	private String personName;
	@Column(name="photo_url")
    private String photoUrl;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public byte[] getCompanySid() {
		return companySid;
	}

	public void setCompanySid(byte[] companySid) {
		this.companySid = companySid;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String populateCompanySid(){
		return bytesToHexStringBySid(companySid);
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof DirectoryCustomerBusinessView)) {
	        return false;
	    }
	    DirectoryCustomerBusinessView other = (DirectoryCustomerBusinessView) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.DirectoryCustomerBusinessView[ id=" + id + " ]";
	}
	

}
