package com.dto;

/**
 * 
 * @author vikash
 * 
 */
@Deprecated
public class InvoiceDetailsDTO extends AbsCommonDTO {

	private static final long serialVersionUID = -3379259008828487896L;
	private Float totalAmount;
	private String generatedInvoiceId;
	private CustomerSignupDTO customer;

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getGeneratedInvoiceId() {
		return generatedInvoiceId;
	}

	public void setGeneratedInvoiceId(String generatedInvoiceId) {
		this.generatedInvoiceId = generatedInvoiceId;
	}

	public CustomerSignupDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerSignupDTO customer) {
		this.customer = customer;
	}

	

}
