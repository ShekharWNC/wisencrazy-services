package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customer_business_view")
public class CustomerBusinessView extends AbsBaseEntity {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Column(name="account_name")
 private String displayName;
 @Column(name="associated_company_id")
 private String companyId;
 @Column(name="company_sid")
 private byte[] companySid;
 @Column(name="primary_contact")
 private String phone;
 @Column(name="photo_url")
 private String photoUrl;
 @Column(name="title")
 private String title;
 @Column(name="email_id")
 private String emailId;

public String getDisplayName() {
	return displayName;
}
public void setDisplayName(String displayName) {
	this.displayName = displayName;
}
public String getCompanyId() {
	return companyId;
}
public void setCompanyId(String companyId) {
	this.companyId = companyId;
}
public byte[] getCompanySid() {
	return companySid;
}
public void setCompanySid(byte[] companySid) {
	this.companySid = companySid;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPhotoUrl() {
	return photoUrl;
}
public void setPhotoUrl(String photoUrl) {
	this.photoUrl = photoUrl;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
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
    if (!(object instanceof CustomerBusinessView)) {
        return false;
    }
    CustomerBusinessView other = (CustomerBusinessView) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
        return false;
    }
    return true;
}
@Override
public String toString() {
    return "com.callcomm.eserve.persistence.entity.CustomerBusinessView[ id=" + id + " ]";
}
}
