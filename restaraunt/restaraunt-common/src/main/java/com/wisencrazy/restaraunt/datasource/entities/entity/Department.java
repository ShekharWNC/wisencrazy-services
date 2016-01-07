package com.wisencrazy.restaraunt.datasource.entities.entity;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@Table(name="department")
public class Department extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min=1)
	private String name;

	public Department() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
