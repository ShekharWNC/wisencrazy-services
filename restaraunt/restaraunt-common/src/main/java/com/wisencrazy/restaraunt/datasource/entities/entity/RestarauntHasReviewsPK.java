package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import com.wisencrazy.restaraunt.datasource.entities.entity.RestarauntHasTimings.Timings;

@Embeddable
public class RestarauntHasReviewsPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3553049103013958476L;

	@Basic(optional=false)
	@NotNull
	@Column(name="restaraunt_id")
	private int restarauntId;
	
	@Basic(optional=false)
	@NotNull
	@Column(name="customer_id")
	private int customerId;

	public RestarauntHasReviewsPK(Integer restroId, Integer customerId) {
		this.restarauntId=restroId;
		this.customerId=customerId;
	}
	
	public RestarauntHasReviewsPK() {
		// TODO Auto-generated constructor stub
	}

	public int getRestarauntId() {
		return restarauntId;
	}

	public void setRestarauntId(int restarauntId) {
		this.restarauntId = restarauntId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	
}
