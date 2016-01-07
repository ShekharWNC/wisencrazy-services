package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the case_custom_field_value database table.
 * 
 */
@Embeddable
public class CaseCustomFieldValuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ecase_id")
	private int ecaseId;

	@Column(name="case_field_id")
	private int caseFieldId;

	public CaseCustomFieldValuePK() {
	}
	public int getEcaseId() {
		return this.ecaseId;
	}
	public void setEcaseId(int ecaseId) {
		this.ecaseId = ecaseId;
	}
	public int getCaseFieldId() {
		return this.caseFieldId;
	}
	public void setCaseFieldId(int caseFieldId) {
		this.caseFieldId = caseFieldId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CaseCustomFieldValuePK)) {
			return false;
		}
		CaseCustomFieldValuePK castOther = (CaseCustomFieldValuePK)other;
		return 
			(this.ecaseId == castOther.ecaseId)
			&& (this.caseFieldId == castOther.caseFieldId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ecaseId;
		hash = hash * prime + this.caseFieldId;
		
		return hash;
	}
}