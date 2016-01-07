package com.dto;

import java.io.Serializable;

public class RegisteredPhoneNoHasIvrMenuDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private RegisteredPhoneNoHasIvrMenuPKDTO id;

	private IvrMenuDTO ivrMenu;

	public RegisteredPhoneNoHasIvrMenuDTO() {
	}

	public RegisteredPhoneNoHasIvrMenuPKDTO getId() {
		return this.id;
	}

	public void setId(RegisteredPhoneNoHasIvrMenuPKDTO id) {
		this.id = id;
	}

	public IvrMenuDTO getIvrMenu() {
		return this.ivrMenu;
	}

	public void setIvrMenu(IvrMenuDTO ivrMenu) {
		this.ivrMenu = ivrMenu;
	}

}