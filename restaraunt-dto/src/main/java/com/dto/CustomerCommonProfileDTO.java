package com.dto;

import java.io.Serializable;

import com.dto.CustomerSignupDTO.CustomerAccountStatus;
import com.dto.constants.EnumConstants.SignupType;

public class CustomerCommonProfileDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String customerSid;

	private String name;
	
	private String email;
	
	private String associatedCompanySid;
	
	private String primaryContact;
	
	private String companyName;
	
	private String password;
	
	private SignupType signupType;
	
	private CustomerAccountStatus accountStatus;
	
	
	public String getCustomerSid() {
		return customerSid;
	}

	public void setCustomerSid(String customerSid) {
		this.customerSid = customerSid;
	}

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

	public String getAssociatedCompanySid() {
		return associatedCompanySid;
	}

	public void setAssociatedCompanySid(String associatedCompanySid) {
		this.associatedCompanySid = associatedCompanySid;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}

	public CustomerAccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(CustomerAccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	

}
