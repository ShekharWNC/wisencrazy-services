package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the customer_has_features database table.
 * 
 */
@Embeddable
public class CustomerHasFeaturePK implements Serializable {
	//default serial version id, required for serializable classes.

	/**
	 * 
	 */
	private static final long serialVersionUID = -188291733472402626L;

	@Column(name="customer_id")
	private int customerId;

	@Column(name="feature_id", insertable=false, updatable=false)
	private int featureId;

	public CustomerHasFeaturePK() {
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getFeatureId() {
		return this.featureId;
	}
	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CustomerHasFeaturePK)) {
			return false;
		}
		CustomerHasFeaturePK castOther = (CustomerHasFeaturePK)other;
		return 
			(this.customerId == castOther.customerId)
			&& (this.featureId == castOther.featureId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.customerId;
		hash = hash * prime + this.featureId;
		
		return hash;
	}
}