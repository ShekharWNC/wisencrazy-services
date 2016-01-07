package com.dto.payment;

import com.dto.AbsCommonDTO;

/**
 * @author priyatham
 *
 */
@Deprecated
public class TransacDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6266300016988629373L;

	public enum TransactionStatus{
		FAILED, SUCCESS,PROGRESS
	}

	private String transGeneratedId;

	private String hashKey;

	private TransactionStatus status;

	private InvoiceDetailsCommonDTO invoiceDetails;

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

	public InvoiceDetailsCommonDTO getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDetailsCommonDTO invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}
}
