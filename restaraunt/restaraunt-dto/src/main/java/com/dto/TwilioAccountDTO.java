package com.dto;

import java.sql.Timestamp;
import java.util.List;


public class TwilioAccountDTO extends AbsCommonDTO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3805191065942801534L;

	public enum MasterAccStatus {
		closed,
		active,
		suspended
	}
	public enum AccountStatusDisable{
		system,
		admin
	}
	private String companySid;

    private String twilioAccountSid;
    
    private String twilioAuthToken;
    
    private MasterAccStatus status;
    
    private Timestamp createdDate;
    
    private Double twilioCap;
    
    private Double eserveCap;
    
    private Double minimumAmtToRecharge;
    
    private Double rechargeAmount;
    
    private Double currentBalance;
    
    private String accountName;
    
    private String masterAccountSid;
    
    private Double fallBalance;
    
    private List<RegisteredPhoneNoDTO> phoneNoList;
    
    private AccountStatusDisable disabledBy;
    
    public  TwilioAccountDTO(){
	   
   }

    public String getTwilioAccountSid() {
        return twilioAccountSid;
    }

    public void setTwilioAccountSid(String twilioAccountSid) {
        this.twilioAccountSid = twilioAccountSid;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getMasterAccountSid() {
		return masterAccountSid;
	}

	public void setMasterAccountSid(String masterAccountSid) {
		this.masterAccountSid = masterAccountSid;
	}

	public Double getFallBalance() {
		return fallBalance;
	}

	public void setFallBalance(Double fallBalance) {
		this.fallBalance = fallBalance;
	}

	public List<RegisteredPhoneNoDTO> getPhoneNoList() {
		return phoneNoList;
	}

	public void setPhoneNoList(List<RegisteredPhoneNoDTO> phoneNoList) {
		this.phoneNoList = phoneNoList;
	}

	public AccountStatusDisable getDisabledBy() {
		return disabledBy;
	}

	public void setDisabledBy(AccountStatusDisable disabledBy) {
		this.disabledBy = disabledBy;
	}
	
}
