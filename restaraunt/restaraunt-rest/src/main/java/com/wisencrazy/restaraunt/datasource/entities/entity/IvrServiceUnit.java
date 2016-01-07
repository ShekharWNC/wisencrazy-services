package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ivr_service_unit database table.
 * 
 */
@Entity
@Table(name="ivr_service_unit")
public class IvrServiceUnit extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String name;

	private String status;

	@ManyToOne
	@JoinColumn(name="ivr_service_provider_id")
	private IvrServiceProvider ivrServiceProvider;

	public IvrServiceUnit() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public IvrServiceProvider getIvrServiceProvider() {
		return this.ivrServiceProvider;
	}

	public void setIvrServiceProvider(IvrServiceProvider ivrServiceProvider) {
		this.ivrServiceProvider = ivrServiceProvider;
	}
}