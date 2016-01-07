package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_param database table.
 * 
 */
@Entity
@Table(name="ivr_param")
public class IvrParam extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String name;

	private String value;

	public IvrParam() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}