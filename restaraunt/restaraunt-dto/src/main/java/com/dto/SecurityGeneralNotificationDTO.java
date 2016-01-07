package com.dto;

import java.util.List;

public class SecurityGeneralNotificationDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 1L;

	private CompanyDTO company;
	private String securityNotificationName;
	private boolean securitySsl;
	private List<SecuritySendNotificationDTO> securitySendNotifications;

	public SecurityGeneralNotificationDTO() {
		// TODO Auto-generated constructor stub
	}

	public CompanyDTO getCompany() {
		return company;
	}

	public void setCompany(CompanyDTO company) {
		this.company = company;
	}

	public String getSecurityNotificationName() {
		return securityNotificationName;
	}

	public void setSecurityNotificationName(String securityNotificationName) {
		this.securityNotificationName = securityNotificationName;
	}

	public List<SecuritySendNotificationDTO> getSecuritySendNotifications() {
		return securitySendNotifications;
	}

	public void setSecuritySendNotifications(
			List<SecuritySendNotificationDTO> securitySendNotifications) {
		this.securitySendNotifications = securitySendNotifications;
	}

	public boolean isSecuritySsl() {
		return securitySsl;
	}

	public void setSecuritySsl(boolean securitySsl) {
		this.securitySsl = securitySsl;
	}

}
