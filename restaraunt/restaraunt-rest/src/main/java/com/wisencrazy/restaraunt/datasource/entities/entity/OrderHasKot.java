package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the order_has_kot database table.
 * 
 */
@Entity
@Table(name="order_has_kot")
public class OrderHasKot extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5686545191243162584L;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String kot;

	@Column(name="kot_status")
	private String kotStatus;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="order_id",referencedColumnName="id")
	private Orders order;

	public OrderHasKot() {
	}


	public String getKot() {
		return this.kot;
	}

	public void setKot(String kot) {
		this.kot = kot;
	}

	public String getKotStatus() {
		return this.kotStatus;
	}

	public void setKotStatus(String kotStatus) {
		this.kotStatus = kotStatus;
	}


	public Orders getOrder() {
		return this.order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}


	public Timestamp getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}