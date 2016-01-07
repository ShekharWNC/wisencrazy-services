package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="place_holder")
public class PlaceHolder extends AbsBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3637993483010923468L;
	@Column(name="name")
	private String name;
	@Column(name="place_holder_type")
	private String placeHolderType;
	@Column(name="attribute_name")
	private String attributeName;
	
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlaceHolderType() {
		return placeHolderType;
	}
	public void setPlaceHolderType(String placeHolderType) {
		this.placeHolderType = placeHolderType;
	}
}
