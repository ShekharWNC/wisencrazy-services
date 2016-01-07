package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "customer_has_otp_service")
@NamedQueries({
	@NamedQuery(name = CustomerHasOtpService.FIND_BY_SID, query = "from CustomerHasOtpService chos where chos.sid = unhex(:sid)")
})
public class CustomerHasOtpService extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7556498332347400084L;
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CustomerHasOtpService.";

	public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	@Column(name = "otp_key")
	private String otpKey;
	
	@Column(name = "otp_expiray_date")
	private Timestamp otpExpiryDate;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "verification_count")
	private Integer verificationCount;
	
	@Column(name = "resent_count")
	private Integer resentCount;
	
	@Column(name = "verification_date")
	private Timestamp verificationDate;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	public String getOtpKey() {
		return otpKey;
	}

	public void setOtpKey(String otpKey) {
		this.otpKey = otpKey;
	}

	public Timestamp getOtpExpiryDate() {
		return otpExpiryDate;
	}

	public void setOtpExpiryDate(Timestamp otpExpiryDate) {
		this.otpExpiryDate = otpExpiryDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getVerificationCount() {
		return verificationCount;
	}

	public void setVerificationCount(Integer verificationCount) {
		this.verificationCount = verificationCount;
	}

	public Integer getResentCount() {
		return resentCount;
	}

	public void setResentCount(Integer resentCount) {
		this.resentCount = resentCount;
	}

	public Timestamp getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(Timestamp verificationDate) {
		this.verificationDate = verificationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
