package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_service_provider database table.
 * 
 */
@Entity
@Table(name="ivr_service_provider")
public class IvrServiceProvider extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String name;

	@Column(name="service_name")
	private String serviceName;

	public IvrServiceProvider() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}