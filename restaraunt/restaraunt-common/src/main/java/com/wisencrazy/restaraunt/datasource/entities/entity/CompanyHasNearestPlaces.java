package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dto.constants.EnumConstants.PlaceOrigin;

public class CompanyHasNearestPlaces extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4574691940626254416L;
	
	public enum PlaceOrigin{
		GOOGLE, VIACHAT 
	}

	@Column(name = "name")
	private String name;
	
	@Column(name = "nearest_place_id")
	private String nearestPlaceId;
	
	@Column(name = "distance")
	private Integer distance;
	
	@Column(name = "place_id_origin")
	@Enumerated(EnumType.STRING)
	private PlaceOrigin origin;
	
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNearestPlaceId() {
		return nearestPlaceId;
	}

	public void setNearestPlaceId(String nearestPlaceId) {
		this.nearestPlaceId = nearestPlaceId;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public PlaceOrigin getOrigin() {
		return origin;
	}

	public void setOrigin(PlaceOrigin origin) {
		this.origin = origin;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
