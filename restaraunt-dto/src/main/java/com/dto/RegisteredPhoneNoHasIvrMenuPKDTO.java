package com.dto;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the registered_phone_no_has_ivr_menu database table.
 * 
 */
public class RegisteredPhoneNoHasIvrMenuPKDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int registeredPhoneNoId;

	private int ivrMenuId;

	public RegisteredPhoneNoHasIvrMenuPKDTO() {
	}
	public int getRegisteredPhoneNoId() {
		return this.registeredPhoneNoId;
	}
	public void setRegisteredPhoneNoId(int registeredPhoneNoId) {
		this.registeredPhoneNoId = registeredPhoneNoId;
	}
	public int getIvrMenuId() {
		return this.ivrMenuId;
	}
	public void setIvrMenuId(int ivrMenuId) {
		this.ivrMenuId = ivrMenuId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RegisteredPhoneNoHasIvrMenuPKDTO)) {
			return false;
		}
		RegisteredPhoneNoHasIvrMenuPKDTO castOther = (RegisteredPhoneNoHasIvrMenuPKDTO)other;
		return 
			(this.registeredPhoneNoId == castOther.registeredPhoneNoId)
			&& (this.ivrMenuId == castOther.ivrMenuId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.registeredPhoneNoId;
		hash = hash * prime + this.ivrMenuId;
		
		return hash;
	}
}