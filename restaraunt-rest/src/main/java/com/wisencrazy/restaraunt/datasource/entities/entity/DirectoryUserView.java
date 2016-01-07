package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc

/**
 * The Class DirectoryUserView.
 */
@Entity
@Table(name="vw_directory_user")
public class DirectoryUserView extends AbsBaseEntity{
   /**
	 * 
	 */
	private static final long serialVersionUID = -3034545201053872250L;

   @Column(name="first_name") 
   private String firstName;
   
   @Column(name="last_name")
   private String lastName;
   
   @Column(name="username")
   private String emailId;
   
   @Column(name="primary_contact")
   private String phone;
  
   @Column(name="photo_url")
   private String photoUrl;
  
   @Column(name="company_id")
   private Integer companyId;

   @Column(name="company_sid")
   private byte[] companySid;
   
   @Column(name="virtual_account_sid")
   private byte[] virtualAccountSid;
 
   
   @Column(name="company_group_sid")
   private byte[] companyGroupSid;
   
   @Column(name="company_group_name")
   private String companyGroupName;
   
   @Column(name="role")
   private String role;
   
   @Column(name="account_status")
   private boolean accountStatus;

	public boolean isAccountStatus() {
	return accountStatus;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public byte[] getVirtualAccountSid() {
		return virtualAccountSid;
	}

	public void setVirtualAccountSid(byte[] virtualAccountSid) {
		this.virtualAccountSid = virtualAccountSid;
	}

	public byte[] getCompanyGroupSid() {
		return companyGroupSid;
	}

	public void setCompanyGroupSid(byte[] companyGroupSid) {
		this.companyGroupSid = companyGroupSid;
	}

	public String getCompanyGroupName() {
		return companyGroupName;
	}

	public void setCompanyGroupName(String companyGroupName) {
		this.companyGroupName = companyGroupName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String populateGroupSid() {
		return bytesToHexStringBySid(virtualAccountSid);
	}

	public String populateCompanySid() {
		return bytesToHexStringBySid(companySid);
	}

	public String populateCompanyGroupSid() {
		return bytesToHexStringBySid(companyGroupSid);
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof DirectoryUserView)) {
			return false;
		}
		DirectoryUserView other = (DirectoryUserView) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.callcomm.eserve.persistence.entity.DirectoryUserView[ id="
				+ id + " ]";
	}
}
