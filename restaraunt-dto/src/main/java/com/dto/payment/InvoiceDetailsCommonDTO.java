package com.dto.payment;

import java.sql.Timestamp;

import com.dto.AbsCommonDTO;
import com.dto.CommonDTO;
import com.dto.CustomerDTO;

/**
 * @author priyatham
 *
 */
public class InvoiceDetailsCommonDTO extends AbsCommonDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9067060424866511556L;
	
	private Float totalAmount;

	private String generatedInvoiceId;

	private CustomerDTO customer;

	private CommonDTO company;
	
	private CommonDTO project;
	
	private Timestamp createdDate;

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

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public CommonDTO getCompany() {
		return company;
	}

	public void setCompany(CommonDTO company) {
		this.company = company;
	}

	public CommonDTO getProject() {
		return project;
	}

	public void setProject(CommonDTO project) {
		this.project = project;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	
}
