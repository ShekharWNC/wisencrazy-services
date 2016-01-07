package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_view")
public class CustomerView extends AbsCompositeEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4089219964146586220L;
	@Id
	@Column(name="cust_id")
	private String cust_id;
	
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
    @Column(name="email_id")
    private String emailId;
    @Column(name="title")
    private String title;
    @Column(name="company_id")
    private Integer companyId;
    @Column(name="primary_contact")
    private String phone;
    @Column(name="file_path")
    private String photoUrl;
    @Column(name="company_sid")
    private byte[] companySid;
    @Column(name="customer_business_id")
    private Integer customerBusinessId;
    
	public Integer getCustomerBusinessId() {
		return customerBusinessId;
	}
	public void setCustomerBusinessId(Integer customerBusinessId) {
		this.customerBusinessId = customerBusinessId;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public byte[] getCompanySid() {
		return companySid;
	}
	public void setCompanySid(byte[] companySid) {
		this.companySid = companySid;
	}
	public String companySid(){
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
	    if (!(object instanceof CustomerView)) {
	        return false;
	    }
	    CustomerView other = (CustomerView) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.CustomerView[ id=" + id + " ]";
	}
}
