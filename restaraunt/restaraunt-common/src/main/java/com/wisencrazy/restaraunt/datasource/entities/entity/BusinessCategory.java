package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the business_catogory database table.
 * 
 */
@Entity
@Table(name="business_category")
public class BusinessCategory extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8768264733393461091L;

	private String description;

	private String name;


	public BusinessCategory() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


}