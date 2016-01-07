package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class Package extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -769653203024770965L;

	public enum PackageType {
		Basic, Premium, Platinum,GetStarted
	}
	private String name;

	@Column(name = "duration_in_months")
	private Integer durationInMonths;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(Integer durationInMonths) {
		this.durationInMonths = durationInMonths;
	}
}
