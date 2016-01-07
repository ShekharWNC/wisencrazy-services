package com.dto;

import com.dto.core.ordermanagement.InvoiceDTO;

/**
 * @author vikash
 */
public class TransactionDetailsDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 7694136912545333072L;

	public enum TransactionStatus {
		FAILED, SUCCESS,PROGRESS
	}

	private String transGeneratedId;
	private String hashKey;
	private TransactionStatus status;
	private InvoiceDTO invoiceDetails;

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

	public InvoiceDTO getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(InvoiceDTO invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionDetailsDTO [transGeneratedId=");
		builder.append(transGeneratedId);
		builder.append(", hashKey=");
		builder.append(hashKey);
		builder.append(", status=");
		builder.append(status);
		builder.append(", invoiceDetails=");
		builder.append(invoiceDetails);
		builder.append("]");
		return builder.toString();
	}

}
