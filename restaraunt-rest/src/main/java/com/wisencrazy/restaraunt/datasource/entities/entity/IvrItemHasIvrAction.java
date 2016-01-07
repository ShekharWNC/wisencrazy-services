package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_item_has_ivr_action database table.
 * 
 */
@Entity
@Table(name="ivr_item_has_ivr_action")
public class IvrItemHasIvrAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IvrItemHasIvrActionPK id;
	

	@Column(name="ivr_item_action_type")
	private String ivrItemActionType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ivr_action_id", insertable = false, updatable = false)
	private IvrAction ivrAction;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ivr_item_id", insertable = false, updatable = false)
	private IvrItem ivrItem;
	
	public IvrItemHasIvrAction() {
	}

	public IvrItemHasIvrActionPK getId() {
		return this.id;
	}

	public void setId(IvrItemHasIvrActionPK id) {
		this.id = id;
	}

	public String getIvrItemActionType() {
		return this.ivrItemActionType;
	}

	public void setIvrItemActionType(String ivrItemActionType) {
		this.ivrItemActionType = ivrItemActionType;
	}

	public IvrAction getIvrAction() {
		return ivrAction;
	}

	public void setIvrAction(IvrAction ivrAction) {
		this.ivrAction = ivrAction;
	}

	public IvrItem getIvrItem() {
		return ivrItem;
	}

	public void setIvrItem(IvrItem ivrItem) {
		this.ivrItem = ivrItem;
	}
}