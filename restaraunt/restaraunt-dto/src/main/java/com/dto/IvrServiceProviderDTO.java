package com.dto;


public class IvrServiceProviderDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 1L;

	private String name;

	private String serviceName;

	public IvrServiceProviderDTO() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}