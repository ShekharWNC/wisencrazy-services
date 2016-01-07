package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.PlaceOrigin;

@Entity
@Table(name = "company_has_place_details")
@NamedQueries({
	
	
})
public class CompanyHasPlaceDetails extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8188113240085184309L;
	
	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.CompanyHasPlaceDetails.";
	
	

	private String longitude;
	
	private String latitude;
	
	@Column(name = "place_id")
	private String placeId;
	
	@Column(name = "place_id_origin")
	@Enumerated(EnumType.STRING)
	private PlaceOrigin origin;
	
	@Column(name = "name")
	private String placeName;
	
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;

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

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public PlaceOrigin getOrigin() {
		return origin;
	}

	public void setOrigin(PlaceOrigin origin) {
		this.origin = origin;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
