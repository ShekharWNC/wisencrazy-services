package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "shorturl")
@NamedQueries({
	@NamedQuery(name = ShortUrl.VALIDATE_LONG_URL, query = "from ShortUrl su where su.longUrl = :url"),
	@NamedQuery(name = ShortUrl.FIND_ALL, query = "from ShortUrl"),
	@NamedQuery(name = ShortUrl.FIND_BY_SHORTCODE, query = "from ShortUrl su where su.shortCode = :sid")
})
public class ShortUrl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -920869150757683480L;
	
	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.ShortUrl.";
	
	public static final String VALIDATE_LONG_URL = PREFIX + "validateLongUrl";
	
	public static final String FIND_ALL = PREFIX + "findAll";
	
	public static final String FIND_BY_SHORTCODE = PREFIX + "findByShortCode";

	public enum ShortUrlActionType{
		vc,
		other
	}
	
	public enum ShortUrlStatus{
		active,
		inactive
	}
	@Id
	@Column(name = "short_code")
	private String shortCode;
	
	@Column(name = "long_url")
	private String longUrl;

	@Column(name="action_type")
	@Enumerated(EnumType.STRING)
	private ShortUrlActionType actionType;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private ShortUrlStatus status;
	
	@Column(name="expires_on")
	private Timestamp expiresOn;
	
	
	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getLongUrl() {
		return longUrl;
	}

	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

	public ShortUrlActionType getActionType() {
		return actionType;
	}

	public void setActionType(ShortUrlActionType actionType) {
		this.actionType = actionType;
	}

	public ShortUrlStatus getStatus() {
		return status;
	}

	public void setStatus(ShortUrlStatus status) {
		this.status = status;
	}

	public Timestamp getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(Timestamp expiresOn) {
		this.expiresOn = expiresOn;
	}

}
