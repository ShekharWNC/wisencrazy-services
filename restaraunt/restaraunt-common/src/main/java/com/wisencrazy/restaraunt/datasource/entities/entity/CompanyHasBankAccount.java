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
@Table(name = "company_has_bank_account")
@NamedQueries({
	@NamedQuery(name=CompanyHasBankAccount.FIND_BY_COMPANY_ACCOUNT_NUMBER, query = "select hex(cb.sid) from CompanyHasBankAccount cb "
			+ "where cb.company.sid = unhex(:companySid) and cb.accountNumber = :Account"),
	@NamedQuery(name = CompanyHasBankAccount.FIND_BY_SID, query = "select cb from CompanyHasBankAccount cb where cb.sid = unhex(:sid)"),
	@NamedQuery(name = CompanyHasBankAccount.FIND_BY_COMPANY, query = "select cb from CompanyHasBankAccount cb where cb.company.sid = unhex(:companySid)")
})
public class CompanyHasBankAccount extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8312627696899447855L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyHasBankAccount.";
	public static final String FIND_BY_COMPANY_ACCOUNT_NUMBER = PREFIX + "findSidByCompanyAccountNumber";

	public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	public static final String FIND_BY_COMPANY = PREFIX + "findByCompany";

	@Column(name = "account_holder_name")
	private String accountHolderName;
	
	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "branch_name")
	private String branchName;
	
	@Column(name = "bank_address")
	private String bankAddress;
	
	@Column(name = "ifsc_code")
	private String ifscCode;
	
	@Column(name = "additional_details")
	private String additionalDetails;
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	@Column(name = "updated_date")
	private Timestamp updateDate;
	
	@ManyToOne
	@JoinColumn(name ="updated_by", referencedColumnName = "id")
	private VirtualAccount updatedBy;
	
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public VirtualAccount getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(VirtualAccount updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
