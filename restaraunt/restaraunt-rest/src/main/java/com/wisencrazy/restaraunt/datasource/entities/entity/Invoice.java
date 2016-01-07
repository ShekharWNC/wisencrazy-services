package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@Table(name="invoice")
public class Invoice extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3282760629871760534L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="company_id")
	private Company company;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="inv_amount")
	private Double invAmount;

	@Column(name="invoice_status")
	private String invoiceStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="project_id")
	private Project project;
	
	@Column(name="generated_invoice_id")
	private String generatedInvoiceId;

	@Column(name="payment_link")
	private String paymentLink;
	
	@ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(name = "invoice_has_orders", joinColumns = {
            @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)})
	private List<Orders> order;
	
	@ManyToMany
    @JoinTable(name = "table_has_invoice", joinColumns = {
            @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "table_id", referencedColumnName = "id", nullable = false)})
	private List<BusinessTable> businessTable;
	
	@ManyToMany
	@JoinTable(name = "customer_has_invoice", joinColumns = {
            @JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "customer_id", referencedColumnName = "id", nullable = false)})
	private List<Customer> customer;

	@Column(name="payment_gateway")
	private String paymentGateway;
	
	public Invoice() {
	}

	public Double getInvAmount() {
		return this.invAmount;
	}

	public void setInvAmount(Double invAmount) {
		this.invAmount = invAmount;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	public String getGeneratedInvoiceId() {
		return generatedInvoiceId;
	}

	public void setGeneratedInvoiceId(String generatedInvoiceId) {
		this.generatedInvoiceId = generatedInvoiceId;
	}

	public String getPaymentLink() {
		return paymentLink;
	}

	public void setPaymentLink(String paymentLink) {
		this.paymentLink = paymentLink;
	}

	public List<BusinessTable> getBusinessTable() {
		return businessTable;
	}

	public void setBusinessTable(List<BusinessTable> businessTable) {
		this.businessTable = businessTable;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public String getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

}