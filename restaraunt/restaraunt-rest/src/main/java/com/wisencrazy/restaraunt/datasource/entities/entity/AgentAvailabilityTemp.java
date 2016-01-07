package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agent_availability_temp")
public class AgentAvailabilityTemp extends AbsBaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "availability_data")
	private String availabilityData;
	
	@ManyToOne
	@JoinColumn(name = "project_schedule_id", referencedColumnName = "id")
	private ProjectSchedule projectSchedule;
	
	@ManyToOne
	@JoinColumn(name = "supervisor_id", referencedColumnName = "id")
	private Appuser supervisor;
	
	@Column(name = "creation_date")
	private Timestamp creationDate;

	public AgentAvailabilityTemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAvailabilityData() {
		return availabilityData;
	}

	public void setAvailabilityData(String availabilityData) {
		this.availabilityData = availabilityData;
	}

	public ProjectSchedule getProjectSchedule() {
		return projectSchedule;
	}

	public void setProjectSchedule(ProjectSchedule projectSchedule) {
		this.projectSchedule = projectSchedule;
	}

	public Appuser getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Appuser supervisor) {
		this.supervisor = supervisor;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
}
