package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_gather database table.
 * 
 */
@Entity
@Table(name="ivr_gather")
public class IvrGather extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="data_type")
	private String dataType;

	@Column(name="digit_length")
	private int digitLength;

	private String finishKey;

	@Column(name="parent_action_sid")
	private String parentActionSid;

	private int timeout;

	@ManyToMany
	@JoinTable(
			name = "ivr_gather_has_announcement",
			joinColumns = {
					@JoinColumn(name = "ivr_gather_id")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "ivr_announcement_id")
			})
	private List<IvrAnnouncement> ivrAnnouncements;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ivr_menu_id", nullable = false)
	private IvrMenu ivrMenu;

	public IvrGather() {
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public int getDigitLength() {
		return this.digitLength;
	}

	public void setDigitLength(int digitLength) {
		this.digitLength = digitLength;
	}

	public String getFinishKey() {
		return this.finishKey;
	}

	public void setFinishKey(String finishKey) {
		this.finishKey = finishKey;
	}

	public String getParentActionSid() {
		return this.parentActionSid;
	}

	public void setParentActionSid(String parentActionSid) {
		this.parentActionSid = parentActionSid;
	}

	public int getTimeout() {
		return this.timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public List<IvrAnnouncement> getIvrAnnouncements() {
		return this.ivrAnnouncements;
	}

	public void setIvrAnnouncements(List<IvrAnnouncement> ivrAnnouncements) {
		this.ivrAnnouncements = ivrAnnouncements;
	}

	public IvrMenu getIvrMenu() {
		return ivrMenu;
	}

	public void setIvrMenu(IvrMenu ivrMenu) {
		this.ivrMenu = ivrMenu;
	}
}