package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.SignupType;
/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="customer")
@NamedQueries({
	@NamedQuery(name = Customer.FIND_CUSTOMER_NAME_BY_SID, query = "SELECT c.name from Customer c where hex(c.sid)=:customerSid"),
	@NamedQuery(name = Customer.FIND_BY_SID, query = "select c from Customer c where hex(c.sid) = :sid"),
	@NamedQuery(name = Customer.FIND_SID_BY_EMAIL, query = "select hex(c.sid) from Customer c where c.email = :email"),
	@NamedQuery(name = Customer.FIND_ID_BY_SID, query = "select c.id from Customer c where hex(c.sid) = :sid"),
	@NamedQuery(name = Customer.FIND_PASSWORD_BY_EMAIL, query = "select c.password from Customer c where c.email = :email group by c.email"),
	@NamedQuery(name = Customer.FIND_CUSTOMER_BY_EMAIL, query = "from Customer c where c.email = :email"),
	@NamedQuery(name = Customer.VALIDATE_GOOGLE_ACCESS_TOKEN, query = "select lower(c.email) from Customer c where c.googleAccessToken = :TOKEN"),
	@NamedQuery(name = Customer.UPDATE_GOOGLE_TOKEN_BY_EMAIL, query = "UPDATE Customer c set c.googleAccessToken = :TOKEN where c.email = :emailId"),
	@NamedQuery(name = Customer.FIND_PASSWORD_BY_SID, query = "select c.password from Customer c where hex(c.sid) = :sid"),
   @NamedQuery(name = Customer.FIND_CUSTOMER_BY_EMAILID, query = "from Customer c where c.email = :email"),
   @NamedQuery(name = Customer.FIND_ACC_STATUS_BY_EMAIL_ID,query = "select accountStatus from Customer c where c.email = :email"),
   @NamedQuery(name = Customer.FIND_ID_BY_EMAIL, query = "select c.id from Customer c where c.email = :email"),
   @NamedQuery(name = Customer.VERIFY_MOBILE, query = "select c.isMobileVerified from Customer c where c.sid = unhex(:sid)"),
   @NamedQuery(name = Customer.UPDATE_MOBILE_STATUS, query = "UPDATE Customer c set c.primaryContact = :contact, c.isMobileVerified = :status where c.sid = unhex(:sid)"),
   @NamedQuery(name = Customer.FIND_CUSTOMER_SID_BY_PHONE, query = "Select hex(c.sid) from Customer c where c.primaryContact = :phone"),
   @NamedQuery(name = Customer.FIND_CUSTOMER_SID_BY_EMAIL, query = "Select hex(c.sid) from Customer c where c.email = :emailId"),
})
public class Customer extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1750727662843114183L;

	public static class P {
		public static final String Sid = "customerSid";
	}
	
	public enum CustomerAccountStatus{
		ACTIVE, IN_ACTIVE, SYSTEM_GENERATED, DISABLE
	}
	
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.Customer.";
	public static final String FIND_CUSTOMER_NAME_BY_SID = PREFIX + "findCustomerNameBySid";
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	public static final String FIND_SID_BY_EMAIL = PREFIX + "findSidByEmail";
	public static final String FIND_ID_BY_SID = PREFIX + "findIdBySid";
	public static final String FIND_PASSWORD_BY_EMAIL = PREFIX + "findPasswordByEmail";
	public static final String FIND_CUSTOMER_BY_EMAIL = PREFIX + "findCustomerByEmail";
	public static final String VALIDATE_GOOGLE_ACCESS_TOKEN = PREFIX + "validateGoogleAccessTokenByEmail";
	public static final String UPDATE_GOOGLE_TOKEN_BY_EMAIL = PREFIX + "updateCustomerWithGoogleToken";
	public static final String FIND_PASSWORD_BY_SID = PREFIX + "findPasswordBySid";
	
	public static final String FIND_CUSTOMER_BY_EMAILID = PREFIX + "findCustomerByEmailId";
	public static final String FIND_ACC_STATUS_BY_EMAIL_ID = PREFIX + "findAccountStatusByEmailId";
	public static final String FIND_ID_BY_EMAIL = PREFIX + "findIdByEmail";
	public static final String VERIFY_MOBILE = PREFIX + "verifyMobileBySid";
	public static final String UPDATE_MOBILE_STATUS = PREFIX + "updateMobileStatus";
	public static final String FIND_CUSTOMER_SID_BY_EMAIL = PREFIX + "findCustomerSidByEmail";
	public static final String FIND_CUSTOMER_SID_BY_PHONE = PREFIX + "findCustomerSidByPhone";
	
	
	@Column(name="email_id")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	
	@Column(name = "account_status")
	@Enumerated(EnumType.STRING)
	private CustomerAccountStatus accountStatus;
	
	@Column(name = "google_access_token")
	private String googleAccessToken;
	
	@Column(name = "photo_url")
	private String photoUrl;
	
	private String name;
	
	@Column(name="primary_contact")
	private String primaryContact;
	
	@Column(name = "is_mobile_verified")
	private boolean isMobileVerified;


	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
	private List<CustomerHasAddress> customerHasAddresses;

	
	@Enumerated(EnumType.STRING)
	@Column(name="signup_type")
	private SignupType signupType;
	
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimaryContact() {
		return this.primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public boolean isMobileVerified() {
		return isMobileVerified;
	}

	public void setMobileVerified(boolean isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
	}

	public List<CustomerHasAddress> getCustomerHasAddresses() {
		return this.customerHasAddresses;
	}

	public void setCustomerHasAddresses(List<CustomerHasAddress> customerHasAddresses) {
		this.customerHasAddresses = customerHasAddresses;
	}


	public CustomerAccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(CustomerAccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}


	public String getGoogleAccessToken() {
		return googleAccessToken;
	}

	public void setGoogleAccessToken(String googleAccessToken) {
		this.googleAccessToken = googleAccessToken;
	}

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}
}
