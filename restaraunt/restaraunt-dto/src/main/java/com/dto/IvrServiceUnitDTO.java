package com.dto;


public class IvrServiceUnitDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String name;

	private String status;

	private IvrServiceProviderDTO ivrServiceProvider;

	public IvrServiceUnitDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public IvrServiceProviderDTO getIvrServiceProvider() {
		return this.ivrServiceProvider;
	}

	public void setIvrServiceProvider(IvrServiceProviderDTO ivrServiceProvider) {
		this.ivrServiceProvider = ivrServiceProvider;
	}
}