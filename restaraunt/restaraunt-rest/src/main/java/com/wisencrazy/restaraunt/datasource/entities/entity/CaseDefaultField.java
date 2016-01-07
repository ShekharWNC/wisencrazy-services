package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the case_default_field database table.
 * 
 */
@Entity
@Table(name="case_default_field")
public class CaseDefaultField extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="is_required")
	private byte isRequired;

	private String name;
	
	@Column(name = "mapped_field_name")
	private String mappedFieldName;

	//bi-directional many-to-one association to CustomFieldType
	@ManyToOne
	@JoinColumn(name="case_field_type_id")
	private CustomFieldType customFieldType;

	public CaseDefaultField() {
	}

	public byte getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(byte isRequired) {
		this.isRequired = isRequired;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMappedFieldName() {
		return mappedFieldName;
	}

	public void setMappedFieldName(String mappedFieldName) {
		this.mappedFieldName = mappedFieldName;
	}

	public CustomFieldType getCustomFieldType() {
		return this.customFieldType;
	}

	public void setCustomFieldType(CustomFieldType customFieldType) {
		this.customFieldType = customFieldType;
	}

}