package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.wisencrazy.restaraunt.datasource.entities.entity.TwilioMasterAccount.AccountStatusDisable;
import com.wisencrazy.restaraunt.datasource.entities.entity.TwilioMasterAccount.MasterAccStatus;

/**
 * User: Hoa Ho
 * Date: 2/28/13
 * Time: 1:29 PM
 */
@Entity
@Table(name = "twilio_account")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = TwilioAccount.FIND_ALL, query = "SELECT t FROM TwilioAccount t"),
        @NamedQuery(name = TwilioAccount.FIND_BY_COMPANY_ID, query = "SELECT t FROM TwilioAccount t WHERE hex(t.company.sid) = :companySid"),
        @NamedQuery(name = TwilioAccount.FIND_BY_TWILIO_ACCT_SID, query = "SELECT t FROM TwilioAccount t WHERE t.twilioAccountSid = :twilioAccountSid"),
        @NamedQuery(name = TwilioAccount.FIND_BY_SID, query = "SELECT t FROM TwilioAccount t WHERE hex(sid) = :sid"),
        })
public class TwilioAccount extends AbsBaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 867130659963743848L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.TwilioAccount.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_COMPANY_ID = PREFIX + "findByCompanyId";
    public static final String FIND_BY_TWILIO_ACCT_SID = PREFIX + "findByTwilioAccountSid";
    public static final String FIND_BY_SID= PREFIX+"findBySid";
    public static final String FIND_BY_PHONENUMBER = PREFIX+"findByPhoneNumber";
    
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "twilio_account_sid")
    private String twilioAccountSid;
    
    @Column(name="account_name")
    private String accountName;
    
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @OneToOne
    private Company company;

    @Column(name="twilio_auth_token")
    private String twilioAuthToken;
    
       
    @Column(name="status")
    @Enumerated(EnumType.STRING)
    private MasterAccStatus status;
    
    @Column(name="created_date")
    private Timestamp createdDate;
    
    @Column(name="twilio_cap")
    private Double twilioCap;
    
    @Column(name="eserve_cap")
    private Double eserveCap;
    
    @Column(name="minimum_amt_to_recharge")
    private Double minimumAmtToRecharge;
    
    @Column(name="recharge_amount")
    private Double rechargeAmount;
    
    @Column(name="current_balance")
    private Double currentBalance;
    
    @JoinColumn(name = "twilio_master_account_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TwilioMasterAccount twilioMasterAccount;
    
    @Column(name="fall_balance")
    private Double fallBalance;
    
    @Column(name="disabled_by")
    private AccountStatusDisable disabledBy;
    
    public TwilioAccount() {
    }


	public String getTwilioAccountSid() {
        return twilioAccountSid;
    }

    public void setTwilioAccountSid(String twilioAccountSid) {
        this.twilioAccountSid = twilioAccountSid;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Double getTwilioCap() {
		return twilioCap;
	}

	public void setTwilioCap(Double twilioCap) {
		this.twilioCap = twilioCap;
	}

	public Double getEserveCap() {
		return eserveCap;
	}

	public void setEserveCap(Double eserveCap) {
		this.eserveCap = eserveCap;
	}

	public Double getMinimumAmtToRecharge() {
		return minimumAmtToRecharge;
	}

	public void setMinimumAmtToRecharge(Double minimumAmtToRecharge) {
		this.minimumAmtToRecharge = minimumAmtToRecharge;
	}

	public Double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public TwilioMasterAccount getTwilioMasterAccount() {
		return twilioMasterAccount;
	}

	public void setTwilioMasterAccount(TwilioMasterAccount twilioMasterAccount) {
		this.twilioMasterAccount = twilioMasterAccount;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public Double getFallBalance() {
		return fallBalance;
	}


	public void setFallBalance(Double fallBalance) {
		this.fallBalance = fallBalance;
	}


	public AccountStatusDisable getDisabledBy() {
		return disabledBy;
	}


	public void setDisabledBy(AccountStatusDisable disabledBy) {
		this.disabledBy = disabledBy;
	}
	
	
}
