package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


/**
 * The persistent class for the security_general_notification database table.
 * 
 */
@Entity
@Table(name="security_general_notification")
public class SecurityGeneralNotification extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name="company_id")
	private Company company;

	@Column(name="security_notification_name")
	private String securityNotificationName;

	@Column(name="security_ssl")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean securitySsl;


	//bi-directional many-to-one association to SecuritySendNotification
	@OneToMany(mappedBy="securityGeneralNotification",orphanRemoval=true)
	private List<SecuritySendNotification> securitySendNotifications;

	public SecurityGeneralNotification() {
	}


	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}

	public String getSecurityNotificationName() {
		return this.securityNotificationName;
	}

	public void setSecurityNotificationName(String securityNotificationName) {
		this.securityNotificationName = securityNotificationName;
	}

	public List<SecuritySendNotification> getSecuritySendNotifications() {
		return this.securitySendNotifications;
	}

	public void setSecuritySendNotifications(List<SecuritySendNotification> securitySendNotifications) {
		this.securitySendNotifications = securitySendNotifications;
	}


	public Boolean getSecuritySsl() {
		return securitySsl;
	}


	public void setSecuritySsl(Boolean securitySsl) {
		this.securitySsl = securitySsl;
	}

}