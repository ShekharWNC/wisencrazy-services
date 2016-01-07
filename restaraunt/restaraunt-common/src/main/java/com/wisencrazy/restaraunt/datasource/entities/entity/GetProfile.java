package com.wisencrazy.restaraunt.datasource.entities.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="vw_get_profile")
public class GetProfile implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4226312104994764080L;
	@Id
    @Column(name="appuser_Id")
	private String appUserId;
    @Column(name="account_status")
    private String accountStatus;
    @Column(name="display_name")
    private String displayName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="company_id")
    private String companyId;
    @Column(name="name")
    private String companyName;
    @Column(name="first_name")
    private String firstName;
    @Column(name="username")
    private String userName;
    @Column(name="facebook_link")
    private String facebookLink;
    @Column(name="twitter_link")
    private String twitterLink;
    @Column(name="linkedin_link")
    private String linkedinLink;
    @Column(name="file_path")
    private String attachmentPath;
    @Column(name="title")
    private String title;
    @Column(name="contact_number")
    private String contactNumber;
    @Column(name="profile_type")
    private String profileType;
    @Column(name="user_has_address_id")
    private String userHasAddressId;
    @Column(name="address_type_id")
    private String addressTypeId;
    @Column(name="address_id")
    private String addressId;
    @Column(name="address_line1")
    private String addressLine1;
    @Column(name="address_line2")
    private String addressLine2;
    @Column(name="address_line3")
    private String addressLine3;
    @Column(name="pin")
    private String pin;
    @Column(name="country_name")
    private String countryName;
    @Column(name="state_id")
    private int stateId;
    @Column(name="state_name")
    private String stateName;
    @Column(name="country_id")
    private int countryId;
    @Column(name="user_sid")
    private String appuserSid;
    @Column(name="company_sid")
    private String companySid;
    
    @Column(name="member_since")
    private String memberSince;
    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name="user_id")
    private List<UserContact> userContactList;
    
   
	public String getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getStateId() {
		return stateId;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public List<UserContact> getUserContactList() {
		return userContactList;
	}
	public void setUserContactList(List<UserContact> userContactList) {
		this.userContactList = userContactList;
	}
	
	public String getTwitterLink() {
		return twitterLink;
	}
	public void setTwitterLink(String twitterLink) {
		this.twitterLink = twitterLink;
	}
	public String getAppUserId() {
		return appUserId;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public String getDisplayName() {
		return displayName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCompanyId() {
		return companyId;
	}
		public String getFirstName() {
		return firstName;
	}
	public String getUserName() {
		return userName;
	}
	public String getFacebookLink() {
		return facebookLink;
	}
	public String getLinkedinLink() {
		return linkedinLink;
	}
	public String getAttachmentPath() {
		return attachmentPath;
	}
	public String getTitle() {
		return title;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getProfileType() {
		return profileType;
	}
	public String getUserHasAddressId() {
		return userHasAddressId;
	}
	public String getAddressTypeId() {
		return addressTypeId;
	}
	public String getAddressId() {
		return addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public String getPin() {
		return pin;
	}
	public String getCountryName() {
		return countryName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setAppUserId(String appUserId) {
		this.appUserId = appUserId;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
		public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}
		public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}
	public void setUserHasAddressId(String userHasAddressId) {
		this.userHasAddressId = userHasAddressId;
	}
	public void setAddressTypeId(String addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getAppuserSid() {
		return appuserSid;
	}
	public String getCompanySid() {
		return companySid;
	}
	public void setAppuserSid(String appuserSid) {
		this.appuserSid = appuserSid;
	}
	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (appUserId != null ? appUserId.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof GetProfile)) {
	        return false;
	    }
	    GetProfile other = (GetProfile) object;
	    if ((this.appUserId == null && other.appUserId != null) || (this.appUserId != null && !this.appUserId.equals(other.appUserId))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.GetProfile[ appUserId=" + appUserId + " ]";
	}
}
