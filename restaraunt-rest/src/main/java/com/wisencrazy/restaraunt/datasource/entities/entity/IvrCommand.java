package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_command database table.
 * 
 */
@Entity
@Table(name="ivr_command")
public class IvrCommand extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String name;

	@ManyToMany
	@JoinTable(
		name="ivr_service_unit_has_ivr_command"
		, joinColumns={
			@JoinColumn(name="ivr_command_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ivr_service_unit_id")
			}
		)
	private List<IvrServiceUnit> ivrServiceUnits;

	public IvrCommand() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IvrServiceUnit> getIvrServiceUnits() {
		return this.ivrServiceUnits;
	}

	public void setIvrServiceUnits(List<IvrServiceUnit> ivrServiceUnits) {
		this.ivrServiceUnits = ivrServiceUnits;
	}

}