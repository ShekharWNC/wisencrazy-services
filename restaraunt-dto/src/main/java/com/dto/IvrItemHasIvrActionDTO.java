package com.dto;

import java.io.Serializable;

public class IvrItemHasIvrActionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private IvrItemHasIvrActionPKDTO id;

	private String ivrItemActionType;

	private IvrItemDTO ivrItem;

	private IvrActionDTO ivrAction;

	public IvrItemHasIvrActionDTO() {
	}

	public IvrItemHasIvrActionPKDTO getId() {
		return this.id;
	}

	public void setId(IvrItemHasIvrActionPKDTO id) {
		this.id = id;
	}

	public String getIvrItemActionType() {
		return this.ivrItemActionType;
	}

	public void setIvrItemActionType(String ivrItemActionType) {
		this.ivrItemActionType = ivrItemActionType;
	}

	public IvrItemDTO getIvrItem() {
		return this.ivrItem;
	}

	public void setIvrItem(IvrItemDTO ivrItem) {
		this.ivrItem = ivrItem;
	}

	public IvrActionDTO getIvrAction() {
		return this.ivrAction;
	}

	public void setIvrAction(IvrActionDTO ivrAction) {
		this.ivrAction = ivrAction;
	}

}