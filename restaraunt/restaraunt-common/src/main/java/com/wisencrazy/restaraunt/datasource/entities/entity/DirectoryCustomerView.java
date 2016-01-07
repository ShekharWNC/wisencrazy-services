package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.wisencrazy.restaraunt.datasource.entities.entity.Customer.CustomerType;
/**
 * 
 * @author Vikash Pandey
 *
 */
@Entity
@Table(name="directory_customer_view")
@NamedQueries({
	@NamedQuery(name=DirectoryCustomerView.FIND_CUSTOMER_BY_COMPANY_AND_CUSTOMERSID,query="from DirectoryCustomerView a where hex(a.companySid)=:companySid and hex(a.sid)=:customerSid"),
	@NamedQuery(name = DirectoryCustomerView.FIND_CUSTOMERS_BY_EMAILS, query = "select c from DirectoryCustomerView c where hex(c.companySid)=:companySid " +
			"and c.email not like '%unknown%' and c.email in (:email) and c.customerType = :type order by c.name ASC"),
	@NamedQuery(name=DirectoryCustomerView.FIND_CUSTOMER_BY_EMAIL,query="from DirectoryCustomerView a where a.email = :email group by a.email")
})
public class DirectoryCustomerView extends AbsCompositeEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2689270759146084179L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.DirectoryCustomerView.";
	public static final String FIND_CUSTOMER_BY_COMPANY_AND_CUSTOMERSID=PREFIX+"findCustomerByCompanyAndCustomerSid";
	public static final String FIND_CUSTOMERS_BY_EMAILS = PREFIX + "findCustomersByEmails";
	public static final String FIND_CUSTOMER_BY_EMAIL = PREFIX + "findCustomerByEmail";
	
	@Id
	@Column(name="cust_id")
	private String custId;
	
	private Integer id;
	@Column(name="name")
	private String name;
    @Column(name="email")
    private String email;
    @Column(name="title")
    private String title;
    @Column(name = "customer_type")
    @Enumerated(EnumType.STRING)
    private CustomerType customerType;
    @Column(name="company_id")
    private Integer companyId;
    @Column(name="phone")
    private String phone;
    @Column(name = "is_mobile_verified")
    private boolean isMobileVerified;
    @Column(name = "group_name")
    private String groupName;
    @Column(name="company_sid")
    private byte[] companySid;
    @Column(name="country_name")
    private String countryName;
    @Column(name="photo_url")
    private String photoUrl;
    @Column(name="dont_show")
    private boolean isShow;
    @Column(name="signup_type")
    private String signupType;
    
    @Column(name="account_status")
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
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean getIsMobileVerified() {
		return isMobileVerified;
	}
	public void setIsMobileVerified(boolean isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
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
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String companySid(){
		return bytesToHexStringBySid(companySid);
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
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
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof CustomerView)) {
	        return false;
	    }
	    DirectoryCustomerView other = (DirectoryCustomerView) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.DirectoryCustomerView[ id=" + id + " ]";
	}
}
