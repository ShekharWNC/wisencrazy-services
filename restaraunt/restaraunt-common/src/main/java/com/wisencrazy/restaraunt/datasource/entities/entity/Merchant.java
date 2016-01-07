package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 * 
 */
@Entity
@Table(name = "merchant")
@NamedQueries({ @NamedQuery(name = Merchant.FIND_MERCHANT_BY_MERCHANT_NAME, query = "from Merchant m where m.gateway=:gateway") })
public class Merchant extends AbsBaseEntity {
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Merchant.";
	public static final String FIND_MERCHANT_BY_MERCHANT_NAME = PREFIX
			+ "findMerchantByMerchantName";
	private static final long serialVersionUID = 2059595035929840306L;

	public enum GATEWAY {
		payu,ebs
	}

	@Column(name = "api_key")
	private String apiKey;
	private String salt;

	@Enumerated(EnumType.STRING)
	@Column(name = "gateway")
	private GATEWAY gateway;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public GATEWAY getGateway() {
		return gateway;
	}

	public void setGateway(GATEWAY gateway) {
		this.gateway = gateway;
	}
}
