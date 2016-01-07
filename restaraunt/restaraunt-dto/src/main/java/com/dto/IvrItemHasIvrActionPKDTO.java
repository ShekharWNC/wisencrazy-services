package com.dto;

import java.io.Serializable;

public class IvrItemHasIvrActionPKDTO implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int ivrItemId;

	private int ivrActionId;

	public IvrItemHasIvrActionPKDTO() {
	}
	public int getIvrItemId() {
		return this.ivrItemId;
	}
	public void setIvrItemId(int ivrItemId) {
		this.ivrItemId = ivrItemId;
	}
	public int getIvrActionId() {
		return this.ivrActionId;
	}
	public void setIvrActionId(int ivrActionId) {
		this.ivrActionId = ivrActionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IvrItemHasIvrActionPKDTO)) {
			return false;
		}
		IvrItemHasIvrActionPKDTO castOther = (IvrItemHasIvrActionPKDTO)other;
		return 
			(this.ivrItemId == castOther.ivrItemId)
			&& (this.ivrActionId == castOther.ivrActionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ivrItemId;
		hash = hash * prime + this.ivrActionId;
		
		return hash;
	}
}