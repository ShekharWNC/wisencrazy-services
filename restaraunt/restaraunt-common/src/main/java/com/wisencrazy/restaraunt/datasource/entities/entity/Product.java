package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 * 
 */
@Entity
@Table(name = "product")
public class Product extends AbsBaseEntity {

	private static final long serialVersionUID = 5824913024900185031L;
	private String name;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
