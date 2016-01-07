package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the user_has_settings database table.
 * 
 */
@Entity
@Table(name="user_has_settings")
public class UserHasSetting extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Appuser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Appuser appuser;

	//bi-directional many-to-one association to Setting
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="settings_id")
	private Setting setting;

	//bi-directional many-to-one association to UserSettingsHasChoice
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_has_settings_id", referencedColumnName = "id")
	private List<UserSettingsHasChoice> userSettingsHasChoices;

	public UserHasSetting() {
	}

	public Appuser getAppuser() {
		return this.appuser;
	}

	public void setAppuser(Appuser appuser) {
		this.appuser = appuser;
	}

	public Setting getSetting() {
		return this.setting;
	}

	public void setSetting(Setting setting) {
		this.setting = setting;
	}

	public List<UserSettingsHasChoice> getUserSettingsHasChoices() {
		return this.userSettingsHasChoices;
	}

	public void setUserSettingsHasChoices(List<UserSettingsHasChoice> userSettingsHasChoices) {
		this.userSettingsHasChoices = userSettingsHasChoices;
	}
}