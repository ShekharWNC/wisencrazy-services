package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the data_type database table.
 * 
 */
@Entity
@Table(name="data_type")
public class DataType extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String name;

	public DataType() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}