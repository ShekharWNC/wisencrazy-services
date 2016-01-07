package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_action database table.
 * 
 */
@Entity
@Table(name="ivr_action")
public class IvrAction extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	/*@Column(name="ivr_action_type")
	private String ivrActionType;*/

	private String name;

	@ManyToOne
	@JoinColumn(name="ivr_service_unit_id")
	private IvrServiceUnit ivrServiceUnit;
	
	@OneToOne
	@JoinColumn(name="ivr_command_id")
	private IvrCommand ivrCommand;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ivr_action_has_ivr_announcement", 
	joinColumns = {
			@JoinColumn(name = "ivr_action_id")
	}, 
	inverseJoinColumns = {
			@JoinColumn(name = "ivr_announcement_id")
	})
	private List<IvrAnnouncement> ivrAnnouncements;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ivr_action_has_ivr_param",
	joinColumns = {
			@JoinColumn(name = "ivr_action_id")
	},
	inverseJoinColumns = {
			@JoinColumn(name = "ivr_param_id")
	})
	private List<IvrParam> ivrParams;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "ivr_action_has_ivr_record",
			joinColumns = {
					@JoinColumn(name = "ivr_action_id")
			}, 
			inverseJoinColumns = {
					@JoinColumn(name = "ivr_record_id")
			})
	private List<IvrRecord> ivrRecords;


	public IvrAction() {
	}

	/*public String getIvrActionType() {
		return this.ivrActionType;
	}

	public void setIvrActionType(String ivrActionType) {
		this.ivrActionType = ivrActionType;
	}*/

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IvrServiceUnit getIvrServiceUnit() {
		return this.ivrServiceUnit;
	}

	public void setIvrServiceUnit(IvrServiceUnit ivrServiceUnit) {
		this.ivrServiceUnit = ivrServiceUnit;
	}
	
	public IvrCommand getIvrCommand() {
		return ivrCommand;
	}

	public void setIvrCommand(IvrCommand ivrCommand) {
		this.ivrCommand = ivrCommand;
	}

	public List<IvrAnnouncement> getIvrAnnouncements() {
		return this.ivrAnnouncements;
	}

	public void setIvrAnnouncements(List<IvrAnnouncement> ivrAnnouncements) {
		this.ivrAnnouncements = ivrAnnouncements;
	}

	public List<IvrParam> getIvrParams() {
		return this.ivrParams;
	}

	public void setIvrParams(List<IvrParam> ivrParams) {
		this.ivrParams = ivrParams;
	}

	public List<IvrRecord> getIvrRecords() {
		return this.ivrRecords;
	}

	public void setIvrRecords(List<IvrRecord> ivrRecords) {
		this.ivrRecords = ivrRecords;
	}
}