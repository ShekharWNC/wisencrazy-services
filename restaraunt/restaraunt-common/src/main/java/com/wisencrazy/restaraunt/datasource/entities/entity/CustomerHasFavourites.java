package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.dto.constants.EnumConstants.PlaceOrigin;

@Entity
@Table(name = "customer_has_favourite")
@NamedQueries({
	@NamedQuery(name=CustomerHasFavourites.FIND_BY_CUSTOMERSID,query="select chf from CustomerHasFavourites chf join chf.customer c where c.sid=unhex(:customerSid)"),
	@NamedQuery(name=CustomerHasFavourites.FIND_BY_PLACEID,query="select chf from CustomerHasFavourites chf join chf.customer c where chf.placeId=:placeId and c.sid=unhex(:customerSid)"),
	@NamedQuery(name=CustomerHasFavourites.FIND_BY_COMPANY_SID,query="select chf from CustomerHasFavourites chf join chf.customer c join chf.company comp where comp.sid=unhex(:companySid) and c.sid=unhex(:customerSid)")
})
public class CustomerHasFavourites extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4375279324878255744L;
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.CustomerHasFavourites.";
	
	public static final String FIND_BY_CUSTOMERSID = "findByCustomerSid";
	
	public static final String FIND_BY_PLACEID = "findByPlaceId";
	
	public static final String FIND_BY_COMPANY_SID = "findByCompanySId";
	
	@Column(name = "place_id")
	private String placeId;
	
	@Column(name = "place_id_origin")
	@Enumerated(EnumType.STRING)
	private PlaceOrigin origin;
	
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}
