package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.SignupType;
/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name="restaraunt")
@NamedQueries({
	@NamedQuery(name = Restaraunt.FIND_BY_SID, query = "select r from Restaraunt r where hex(r.sid) = :sid"),
})
public class Restaraunt extends AbsBaseEntity {

		
	/**
	 * 
	 */
	private static final long serialVersionUID = 5575479282142712063L;
	
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.Restaraunt.";
	public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	
	@Column(name="email_id")
	private String email;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "photo_url")
	private String photoUrl;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="primary_contact_no")
	private String primaryContact;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="created_date")
	private Timestamp createdDate;
	
	@Column(name="address")
	private String address;
	
	@Column(name="pin")
	private String pin;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="cost_for_2")
	private int costFor2;
	
	@Column(name="area_id")
	private int areaId;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "area_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Area area;
    
    @Column(name="delivery_time")
    private int deliveryTime;
    
    @Column(name="delivery_charge")
    private int deliveryCharge;
    
    @Column(name="min_delivery")
    private int minDelivery;
    
    @Column(name="tags")
    private String tags;

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public int getCostFor2() {
		return costFor2;
	}

	public void setCostFor2(int costFor2) {
		this.costFor2 = costFor2;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getMinDelivery() {
		return minDelivery;
	}

	public void setMinDelivery(int minDelivery) {
		this.minDelivery = minDelivery;
	}

	public int getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(int deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public int getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}


}
