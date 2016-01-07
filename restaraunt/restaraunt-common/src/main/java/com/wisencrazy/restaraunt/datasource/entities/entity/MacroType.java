package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "macro_type")
public class MacroType extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5371071891070972914L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
