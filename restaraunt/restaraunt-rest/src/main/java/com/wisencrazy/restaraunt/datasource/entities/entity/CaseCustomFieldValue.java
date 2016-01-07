package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the case_custom_field_value database table.
 * 
 */
@Entity
@Table(name="case_custom_field_value")
public class CaseCustomFieldValue extends AbsCompositeEntity {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CaseCustomFieldValuePK id;

	private String value;

	//bi-directional many-to-one association to CaseField
	@ManyToOne
	@JoinColumn(name="case_field_id", insertable = false, updatable = false)
	private CaseField caseField;

	//bi-directional many-to-one association to Ecase
	@ManyToOne
	@JoinColumn(name = "ecase_id", insertable = false, updatable = false)
	private Ecase ecase;

	public CaseCustomFieldValue() {
	}

	public CaseCustomFieldValuePK getId() {
		return this.id;
	}

	public void setId(CaseCustomFieldValuePK id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CaseField getCaseField() {
		return this.caseField;
	}

	public void setCaseField(CaseField caseField) {
		this.caseField = caseField;
	}

	public Ecase getEcase() {
		return this.ecase;
	}

	public void setEcase(Ecase ecase) {
		this.ecase = ecase;
	}

}