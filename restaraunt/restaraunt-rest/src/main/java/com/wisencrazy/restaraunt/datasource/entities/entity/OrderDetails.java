package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
@Deprecated
public class OrderDetails extends AbsBaseEntity{

	private static final long serialVersionUID = -2216089360930514605L;
    public enum STATUS{
    	ENABLED,DISABLED
    }
    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private STATUS status;
    @Column(name="order_id")
    private String generatedOrderId;
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne
    private Customer customer;
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @ManyToOne
    private Company company;
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public String getGeneratedOrderId() {
		return generatedOrderId;
	}
	public void setGeneratedOrderId(String generatedOrderId) {
		this.generatedOrderId = generatedOrderId;
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
}
