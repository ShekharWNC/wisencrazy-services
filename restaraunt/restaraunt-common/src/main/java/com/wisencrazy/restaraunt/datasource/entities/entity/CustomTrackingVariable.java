package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;



/**
 * The persistent class for the custom_tracking_variable database table.
 * 
 * @author Krish Lakshmanan
 */
@Entity
@Table(name="custom_tracking_variable")
public class CustomTrackingVariable extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3016488455156546123L;

	public static final String Class = "CustomTrackingVariable";

	@Column(name = "name")
	private String name;

	@Column(name = "value")
	private String value;

	public CustomTrackingVariable() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}