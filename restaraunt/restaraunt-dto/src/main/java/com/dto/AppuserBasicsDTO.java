package com.dto;

import java.util.Date;
import java.util.List;
import com.dto.constants.EnumConstants.SignupType;

public class AppuserBasicsDTO extends AbsCommonDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7190845258172085500L;
	private String firstName;
	private Date memberSince;
	private String lastName;
	private String password;
	private String photoUrl;
	private String primaryContact;
	public String displayName;
	protected String publicName;
	public String emailId;
	private float minimumHourlyRate;
	private TimezoneDTO timezone;
	private String mobile;
	private boolean isShow;
	private SignupType signupType;
	private List<AppUserHasSkillCommonDTO> appuserHasSkillList;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(Date memberSince) {
		this.memberSince = memberSince;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public TimezoneDTO getTimezone() {
		return timezone;
	}
	public void setTimezone(TimezoneDTO timezone) {
		this.timezone = timezone;
	}
	public List<AppUserHasSkillCommonDTO> getAppuserHasSkillList() {
		return appuserHasSkillList;
	}
	public void setAppuserHasSkillList(
			List<AppUserHasSkillCommonDTO> appuserHasSkillList) {
		this.appuserHasSkillList = appuserHasSkillList;
	}
		
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
    
	public SignupType getSignupType() {
		return signupType;
	}
	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public float getMinimumHourlyRate() {
		return minimumHourlyRate;
	}

	public void setMinimumHourlyRate(float minimumHourlyRate) {
		this.minimumHourlyRate = minimumHourlyRate;
	}
	public String getPublicName() {
		return publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public boolean isShow() {
		return isShow;
	}
	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
	
}
