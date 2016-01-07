package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "invoice_details")
@NamedQueries({
    @NamedQuery(name=InvoiceDetails.FIND_INVOICE_DETAILS_BY_INVOICEID,query="from InvoiceDetails i where i.generatedInvoiceId=:generatedInvoiceId")
})
@Deprecated
public class InvoiceDetails extends AbsBaseEntity {

	private static final long serialVersionUID = 2456330616758608260L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.InvoiceDetails.";
	public static final String FIND_INVOICE_DETAILS_BY_INVOICEID="findInvoiceDetailsByInvoiceId";
	@Column(name = "total_amount")
	private Float totalAmount;
	@Column(name = "generated_invoice_id")
	private String generatedInvoiceId;
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	@ManyToOne
	private Customer customer;
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	@ManyToOne
	private Company company;
	@JoinColumn(name = "order_details_id", referencedColumnName = "id")
	@OneToOne
	private OrderDetails orderDetails;
	
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@ManyToOne
	private Project project;
	
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
