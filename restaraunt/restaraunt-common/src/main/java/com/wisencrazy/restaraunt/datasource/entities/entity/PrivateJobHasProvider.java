package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the private_job_has_providers database table.
 * 
 */
@Entity
@Table(name="private_job_has_providers")
public class PrivateJobHasProvider extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Job
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id", referencedColumnName = "id")
	private Job job;

	//bi-directional many-to-one association to ProviderProfile
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="provider_id", referencedColumnName = "id")
	private ProviderProfile providerProfile;

	public PrivateJobHasProvider() {
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public ProviderProfile getProviderProfile() {
		return this.providerProfile;
	}

	public void setProviderProfile(ProviderProfile providerProfile) {
		this.providerProfile = providerProfile;
	}

}