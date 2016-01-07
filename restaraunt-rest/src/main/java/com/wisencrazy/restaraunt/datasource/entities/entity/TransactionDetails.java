package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "transaction_details")
@NamedQueries({
	@NamedQuery(name = TransactionDetails.FIND_HASH_BY_TRANSACTIONID, query = "select td.hashKey from TransactionDetails td where td.transGeneratedId = :transactionId"),
	@NamedQuery(name = TransactionDetails.UPDATE_STATUS_BY_TRANSACTIONID, query = "update TransactionDetails td set td.status = :status where td.transGeneratedId = :transactionId"),
	@NamedQuery(name = TransactionDetails.FIND_TRANSACTION_BY_GENERATED_ID, query = "from TransactionDetails t where t.transGeneratedId=:txId"),
	@NamedQuery(name = TransactionDetails.FIND_INVOICE_BY_TRANSCTIONID, query = "select t.invoiceDetails from TransactionDetails t where t.transGeneratedId=:txId"),
	@NamedQuery(name = TransactionDetails.FIND_BY_TRANSACTIONID, query = "from TransactionDetails td where td.transGeneratedId = :transactionId"),
	@NamedQuery(name = TransactionDetails.FIND_TRANSACTION_DETAILS_BY_INVOICE_ID, query = "from TransactionDetails td where td.invoiceDetails.id = :invoiceDetailsId and td.status!='FAILED'")
})
public class TransactionDetails extends AbsBaseEntity {

	private static final long serialVersionUID = -1031282147417090284L;
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.TransactionDetails.";
	public static final String FIND_HASH_BY_TRANSACTIONID = PREFIX + "findHashByTransactionId";
    public static final String FIND_TRANSACTION_BY_GENERATED_ID=PREFIX+"findTransactionByGeneratedId";
	public static final String UPDATE_STATUS_BY_TRANSACTIONID = PREFIX + "updateTransactionStatus";
	public static final String FIND_TRANSACTION_DETAILS_BY_INVOICE_ID = PREFIX + "findTransactionDetailsByInvoiceID";
	public static final String FIND_INVOICE_BY_TRANSCTIONID = PREFIX + "findInvoiceByTransactionId";
	public static final String FIND_BY_TRANSACTIONID = PREFIX + "findByTransactionId";

	public enum TransactionStatus {
		FAILED, SUCCESS,PROGRESS,PendingApproval
	}
	@Column(name = "trans_generated_id")
	private String transGeneratedId;
	@Column(name = "hash_key")
	private String hashKey;
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private TransactionStatus status;
	
	@JoinColumn(name = "invoice_details_id", referencedColumnName = "id")
	@ManyToOne(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST})
	private Invoice invoiceDetails;

	public String getTransGeneratedId() {
		return transGeneratedId;
	}

	public void setTransGeneratedId(String transGeneratedId) {
		this.transGeneratedId = transGeneratedId;
	}

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	public Invoice getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(Invoice invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
}
