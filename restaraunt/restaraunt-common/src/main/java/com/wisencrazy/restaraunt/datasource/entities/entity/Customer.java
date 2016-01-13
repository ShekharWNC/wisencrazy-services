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
	@NamedQuery(name = Customer.FIND_ALL_GROUP_BY_COMPANY, query = "select c from Customer c where c.customerType = :name and hex(c.associatedCompany.sid) = :sid"),
	@NamedQuery(name = Customer.FIND_BY_SID, query = "select c from Customer c where hex(c.sid) = :sid"),
	@NamedQuery(name = Customer.FIND_SID_BY_EMAIL, query = "select hex(c.sid) from Customer c where c.email = :email"),
	@NamedQuery(name = Customer.FIND_ID_BY_SID, query = "select c.id from Customer c where hex(c.sid) = :sid"),
	@NamedQuery(name = Customer.FIND_PASSWORD_BY_EMAIL, query = "select c.password from Customer c where c.email = :email group by c.email"),
	@NamedQuery(name = Customer.FIND_CUSTOMER_BY_EMAIL, query = "from Customer c where c.email = :email group by c.email"),
	@NamedQuery(name = Customer.VALIDATE_GOOGLE_ACCESS_TOKEN, query = "select lower(c.email) from Customer c where c.googleAccessToken = :TOKEN"),
	@NamedQuery(name = Customer.UPDATE_GOOGLE_TOKEN_BY_EMAIL, query = "UPDATE Customer c set c.googleAccessToken = :TOKEN where c.email = :emailId"),
	@NamedQuery(name = Customer.FIND_PASSWORD_BY_SID, query = "select c.password from Customer c where hex(c.sid) = :sid"),
   @NamedQuery(name = Customer.FIND_CUSTOMER_BY_EMAILID, query = "from Customer c where c.email = :email"),
   @NamedQuery(name = Customer.FIND_ACC_STATUS_BY_EMAIL_ID,query = "select accountStatus from Customer c where c.email = :email"),
   @NamedQuery(name = Customer.FIND_ID_BY_EMAIL, query = "select c.id from Customer c where c.email = :email"),
   @NamedQuery(name = Customer.VERIFY_MOBILE, query = "select c.isMobileVerified from Customer c where c.sid = unhex(:sid)"),
   @NamedQuery(name = Customer.UPDATE_MOBILE_STATUS, query = "UPDATE Customer c set c.primaryContact = :contact, c.isMobileVerified = :status where c.sid = unhex(:sid)"),
   @NamedQuery(name = Customer.FIND_CUSTOMER_SID_BY_PHONE, query = "Select hex(c.sid) from Customer c join c.customerHasContacts cc where cc.contactNumber = :phone and c.accountStatus = :status"),
   @NamedQuery(name = Customer.FIND_CUSTOMER_SID_BY_EMAIL, query = "Select hex(c.sid) from Customer c where c.email = :emailId and c.accountStatus = :status "),
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
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Customer.";
	public static final String FIND_CUSTOMER_NAME_BY_SID = PREFIX + "findCustomerNameBySid";
	public static final String FIND_GROUP_BY_COMPANY_SID = PREFIX + "findCustomerByGroupAndCompanySid";
	public static final String FIND_ALL_GROUP_BY_COMPANY = PREFIX + "findAllGroupsByCompany";
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	public static final String VALIDATE_GROUP = PREFIX + "validateCustomerGroup";
	public static final String FIND_CUSTOMERS_BY_GROUP = PREFIX + "findCustomersByGroup";
	public static final String FIND_CUSTOMER_BY_COMPANY = PREFIX + "findCustomerByCompany";
	public static final String FIND_CUSTOMER_BY_ACCOUNT = PREFIX + "findCustomerByAccount";
	public static final String FIND_SID_BY_EMAIL = PREFIX + "findSidByEmail";
	public static final String FIND_ID_BY_SID = PREFIX + "findIdBySid";
	public static final String FIND_PASSWORD_BY_EMAIL = PREFIX + "findPasswordByEmail";
	public static final String FIND_CUSTOMER_BY_EMAIL = PREFIX + "findCustomerByEmail";
	public static final String VALIDATE_GOOGLE_ACCESS_TOKEN = PREFIX + "validateGoogleAccessTokenByEmail";
	public static final String UPDATE_GOOGLE_TOKEN_BY_EMAIL = PREFIX + "updateCustomerWithGoogleToken";
	public static final String FIND_BY_ACTIVATION_TOKEN = PREFIX + "findByActivationToken";
	public static final String UPDATE_BY_ACTIVATION_TOKEN = PREFIX + "updateCustomerByActivationToken";
	public static final String FIND_PASSWORD_BY_SID = PREFIX + "findPasswordBySid";
	public static final String UPDATE_PASSWORD_BY_RESET_EMAIL = PREFIX + "updatePasswordByResetEmail";
	
	public static final String FIND_APP_SETTINGS_BY_SID = PREFIX + "findAppSettingsBySid";
	public static final String FIND_CUSTOMER_BY_EMAILID = PREFIX + "findCustomerByEmailId";
	public static final String FIND_ACC_STATUS_BY_EMAIL_ID = PREFIX + "findAccountStatusByEmailId";
	public static final String FIND_TOKEN_BY_EMAIL = PREFIX + "findTokenByEmail";
	public static final String FIND_ID_BY_EMAIL = PREFIX + "findIdByEmail";
	public static final String VERIFY_MOBILE = PREFIX + "verifyMobileBySid";
	public static final String UPDATE_MOBILE_STATUS = PREFIX + "updateMobileStatus";
	public static final String FIND_CUSTOMER_SID_BY_EMAIL = PREFIX + "findCustomerSidByEmail";
	public static final String FIND_CUSTOMER_SID_BY_PHONE = PREFIX + "findCustomerSidByPhone";
	public static final String FIND_CUSTOMER_SID_BY_DEVICE = PREFIX + "findCustomerSidByDevice";
	
	/*
	 * Native queries
	 */
	public static final String ASSOCIATE_CUSTOMER_COMPANY = "insert into customer_associate_with_company values (:id, :companyId)";
	public static final String ASSOCIATE_CUSTOMER_ACCOUNT = "insert into customer_belongs_to_account values (:id, :companyId)";
	public static final String UPDATE_CUSTOMER_WITH_TOKEN = "update customer set token = :token where hex(sid) = :sid";
	public static final String UPDATE_CUSOMTER_PASSOWRD_BY_EMAIL="update customer set password= :pwd where email_id= :email and password= :password";
	public static String UPDATE_DONT_SHOW_STATUS="update customer set dont_show=:status where email_id=:email";
	public static final String UPDATE_TOKEN_BY_EMAIL = "update customer set token = :TOKEN where email_id = :emailId";
	
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
	
	@Column(name = "group_name")
	private String groupName;
	
	@Column(name = "description")
	private String description;

	private String name;
	
	@ManyToOne
	@JoinColumn(name="photo_id")
	private Attachment photo;

	@Column(name="primary_contact")
	private String primaryContact;
	
	@Column(name = "is_mobile_verified")
	private boolean isMobileVerified;

	private String title;
	@Column(name="dont_show")
	private boolean isShow;
	
	@Column(name="location")
	private String location;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)
	private List<CustomerHasAddress> customerHasAddresses;

	
	@Enumerated(EnumType.STRING)
	@Column(name="signup_type")
	private SignupType signupType;
	
    
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

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

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Attachment getPhoto() {
		return this.photo;
	}

	public void setPhoto(Attachment photo) {
		this.photo = photo;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}
    

	public SignupType getSignupType() {
		return signupType;
	}

	public void setSignupType(SignupType signupType) {
		this.signupType = signupType;
	}
}
