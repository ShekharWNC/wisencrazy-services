package com.dto;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.dto.CustomerDTO.CustomerType;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DirectoryCustomerViewDTO extends AbsCommonDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1747585492255416429L;
	private String name;
    private String email;
    private String title;
    private String phone;
    private boolean isMobileVerified;
    private CustomerType customerType;
    private String countryName;
    private String href;
    private String photoUrl;
    private boolean isShow;
    private String signupType;
    private String accountStatus;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isMobileVerified() {
		return isMobileVerified;
	}
	public void setMobileVerified(boolean isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public boolean isShow() {
		return isShow;
	}
	public boolean getIsShow() {
		return isShow;
	}
	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	public String getSignupType() {
		return signupType;
	}
	public void setSignupType(String signupType) {
		this.signupType = signupType;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
}
