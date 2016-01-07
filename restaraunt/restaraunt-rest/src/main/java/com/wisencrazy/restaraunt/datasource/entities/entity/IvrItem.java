package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_item database table.
 * 
 */
@Entity
@Table(name="ivr_item")
public class IvrItem extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="ivr_item_type")
	private String ivrItemType;

	private String name;
	
	private String selection;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ivr_item_id", insertable = false, updatable = false)
	private List<IvrItemHasIvrAction> ivrItemHasIvrActions;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ivr_item_id", nullable = false)
	private List<IvrData> ivrData;

	public IvrItem() {
	}

	public String getIvrItemType() {
		return this.ivrItemType;
	}

	public void setIvrItemType(String ivrItemType) {
		this.ivrItemType = ivrItemType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public List<IvrItemHasIvrAction> getIvrItemHasIvrActions() {
		return this.ivrItemHasIvrActions;
	}

	public void setIvrItemHasIvrActions(List<IvrItemHasIvrAction> ivrItemHasIvrActions) {
		this.ivrItemHasIvrActions = ivrItemHasIvrActions;
	}

	public List<IvrData> getIvrData() {
		return ivrData;
	}

	public void setIvrData(List<IvrData> ivrData) {
		this.ivrData = ivrData;
	}
}