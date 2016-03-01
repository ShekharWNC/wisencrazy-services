package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.SignupType;
/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="payment_history")
@NamedQueries({
	@NamedQuery(name = Payment.FIND_BY_SID, query = "select o from Payment o where hex(o.sid) = :sid"),
})
public class Payment extends AbsBaseEntity {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -4889359032975547514L;
	/**
	 * 
	 */
	
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.Payment.";
	public static final String FIND_BY_SID = PREFIX + "findBySid";

	public enum PaymentMode{
		COD,
		ONLINE
	}
	
	public enum PaymentStatus{
		STARTED,
		PENDING,
		COMPLETED,
		PENDING_CONFIRM
	}
	
	@Column(name="payment_mode")
	@Enumerated(EnumType.STRING)
	private PaymentMode paymentMode;
	
	@Column(name="payment_amout")
	private Double paymentAmount;
	
	@Column(name="payment_status")
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	@Column(name="payment_status_time")
	private Timestamp paymentStatusTime;
	
	@OneToOne(optional=false,mappedBy="payment")
	private Order order;

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Timestamp getPaymentStatusTime() {
		return paymentStatusTime;
	}

	public void setPaymentStatusTime(Timestamp paymentStatusTime) {
		this.paymentStatusTime = paymentStatusTime;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
