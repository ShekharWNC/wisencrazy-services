package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ivr_item_has_ivr_data")
public class IvrData extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "data")
	private String data;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ivr_item_id", nullable = false)
	private IvrItem ivrItem;*/
	
	public IvrData() {
	}
	
	/*public IvrItem getIvrItem() {
		return ivrItem;
	}

	public void setIvrItem(IvrItem ivrItem) {
		this.ivrItem = ivrItem;
	}*/

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
