package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="twilio_master_account")
@NamedQueries({
	@NamedQuery(name = TwilioMasterAccount.FIND_ALL, query = "SELECT t FROM TwilioMasterAccount t"),
	@NamedQuery(name = TwilioMasterAccount.FIND_BY_SID, query = "SELECT t FROM TwilioMasterAccount t where hex(t.sid)=:sid")
})
public class TwilioMasterAccount extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3232653995922990981L;
	/**
	 * 
	 */
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.TwilioMasterAccount.";
	public static final String FIND_ALL = PREFIX + "findAll";
	public static final String FIND_BY_SID = PREFIX + "findBySId";
	public enum MasterAccStatus{
		active,
		suspended,
		closed
	}
	public enum AccountStatusDisable{
		system,
		admin
	}
	@Column(name="account_name")
	private String accountName;
	
	@Column(name="account_sid")
	private String accountSid;
	
	@Column(name="auth_token")
	private String twilioAuthToken;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private MasterAccStatus status;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "twilioMasterAccount")
	private List<TwilioAccount> twilioAccountsList;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getTwilioAuthToken() {
		return twilioAuthToken;
	}
	public void setTwilioAuthToken(String twilioAuthToken) {
		this.twilioAuthToken = twilioAuthToken;
	}
	public MasterAccStatus getStatus() {
		return status;
	}
	public void setStatus(MasterAccStatus status) {
		this.status = status;
	}
	public List<TwilioAccount> getTwilioAccountsList() {
		return twilioAccountsList;
	}
	public void setTwilioAccountsList(List<TwilioAccount> twilioAccountsList) {
		this.twilioAccountsList = twilioAccountsList;
	}
	
}
