package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_menu database table.
 * 
 */
@Entity
@Table(name="ivr_menu")
@NamedQueries({
	@NamedQuery(name=IvrMenu.FIND_BY_SID,query="Select i from IvrMenu i where hex(i.sid)=:sid")
})
public class IvrMenu extends AbsBaseEntity {

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.IvrMenu.";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	
	private static final long serialVersionUID = 1L;

	@Column(name="default_ivr_item_id")
	private int defaultIvrItemId;

	@Column(name="max_retry")
	private int maxRetry;

	private String name;
	
	@Column(name = "voice_gender")
	private String ivrVoiceGender;
	
	@ManyToOne
	@JoinColumn(name = "ivr_item_id"/*, insertable = false, updatable = false*/)
	private IvrItem ivrItem;
	
	/*@Column(name = "ivr_item_id")
	private Integer ivrItemId;*/

	@OneToOne(mappedBy = "ivrMenu", cascade = CascadeType.ALL)
	private IvrGather ivrGather;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name="ivr_menu_has_ivr_announcement"
		, joinColumns={
			@JoinColumn(name="ivr_menu_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ivr_announcement_id")
			}
		)
	private List<IvrAnnouncement> ivrAnnouncements;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name="ivr_menu_has_ivr_item"
		, joinColumns={
			@JoinColumn(name="ivr_menu_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ivr_item_id", insertable = false, updatable = false)
			}
		)
	private List<IvrItem> ivrItems;

	@ManyToMany
	@JoinTable(
			name = "registered_phone_no_has_ivr_menu",
			joinColumns = {
					@JoinColumn(name = "ivr_menu_id")
			}, 
			inverseJoinColumns = {
					@JoinColumn(name = "registered_phone_no_id")
			})
	private List<RegisteredPhoneNo> registeredPhoneNos;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ivr_menu_id", nullable = false)
	private List<IvrRuleTimings> ivrRuleTimings;
	
	@ManyToOne
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;
	
	public IvrMenu() {
	}

	public int getDefaultIvrItemId() {
		return this.defaultIvrItemId;
	}

	public void setDefaultIvrItemId(int defaultIvrItemId) {
		this.defaultIvrItemId = defaultIvrItemId;
	}

	public int getMaxRetry() {
		return this.maxRetry;
	}

	public void setMaxRetry(int maxRetry) {
		this.maxRetry = maxRetry;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IvrGather getIvrGather() {
		return this.ivrGather;
	}

	public void setIvrGather(IvrGather ivrGather) {
		this.ivrGather = ivrGather;
	}

	public IvrItem getIvrItem() {
		return ivrItem;
	}

	public void setIvrItem(IvrItem ivrItem) {
		this.ivrItem = ivrItem;
	}

	public List<IvrAnnouncement> getIvrAnnouncements() {
		return this.ivrAnnouncements;
	}

	public void setIvrAnnouncements(List<IvrAnnouncement> ivrAnnouncements) {
		this.ivrAnnouncements = ivrAnnouncements;
	}

	public List<IvrItem> getIvrItems() {
		return this.ivrItems;
	}

	public void setIvrItems(List<IvrItem> ivrItems) {
		this.ivrItems = ivrItems;
	}

	public List<RegisteredPhoneNo> getRegisteredPhoneNos() {
		return registeredPhoneNos;
	}

	public void setRegisteredPhoneNos(List<RegisteredPhoneNo> registeredPhoneNos) {
		this.registeredPhoneNos = registeredPhoneNos;
	}

	public List<IvrRuleTimings> getIvrRuleTimings() {
		return ivrRuleTimings;
	}

	public void setIvrRuleTimings(List<IvrRuleTimings> ivrRuleTimings) {
		this.ivrRuleTimings = ivrRuleTimings;
	}

	public String getIvrVoiceGender() {
		return ivrVoiceGender;
	}

	public void setIvrVoiceGender(String ivrVoiceGender) {
		this.ivrVoiceGender = ivrVoiceGender;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	/*public Integer getIvrItemId() {
		return ivrItemId;
	}

	public void setIvrItemId(Integer ivrItemId) {
		this.ivrItemId = ivrItemId;
	}*/
}