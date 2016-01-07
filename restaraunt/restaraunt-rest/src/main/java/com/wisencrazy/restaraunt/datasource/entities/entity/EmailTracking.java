package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: EmailTracking
 *
 */
@Entity
@Table(name="email_tracking")
public class EmailTracking extends AbsBaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6252969483326487295L;
	@Column(name="device_type")
	private String deviceType;
	@Column(name="url")
	private String url;
	@Column(name="browser_detail")
	private String browserDetail;
	@Column(name="location")
	private String location;
	@Column(name="ip_address")
	private String ipAddress;
	/**
	 * This is the customerSid
	 */
	@Column(name="response_from")
	private String responseFrom;
	@Column(name="opened_date")
	private Date openedDate;
	@Column(name="os_detail")
	private String osDetail;
	@Column(name="country")
	private String country;
	@Column(name="response_type")
	private String responseType;

	@ManyToOne
	@JoinColumn(name="event_id")
	private CampaignEvent campaignEvent;
	
	public EmailTracking() {

	
	}   
	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}   
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}   
	public String getBrowserDetail() {
		return this.browserDetail;
	}

	public void setBrowserDetail(String browserDetail) {
		this.browserDetail = browserDetail;
	}   
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}   
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}   
	public String getResponseFrom() {
		return this.responseFrom;
	}

	public void setResponseFrom(String responseFrom) {
		this.responseFrom = responseFrom;
	}   
	public Date getOpenedDate() {
		return this.openedDate;
	}

	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}   
	public String getOsDetail() {
		return this.osDetail;
	}

	public void setOsDetail(String osDetail) {
		this.osDetail = osDetail;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
	public String getResponseType() {
		return this.responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public CampaignEvent getCampaignEvent() {
		return campaignEvent;
	}
	public void setCampaignEvent(CampaignEvent campaignEvent) {
		this.campaignEvent = campaignEvent;
	}
	
}
