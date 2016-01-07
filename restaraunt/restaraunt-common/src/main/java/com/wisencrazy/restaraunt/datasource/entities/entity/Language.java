package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;



/**
 * The persistent class for the language database table.
 * 
 */
@Entity
@Table(name="language")
public class Language extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String name;

	public Language() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}