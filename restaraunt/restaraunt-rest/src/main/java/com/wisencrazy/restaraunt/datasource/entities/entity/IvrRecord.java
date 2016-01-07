package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the ivr_record database table.
 * 
 */
@Entity
@Table(name="ivr_record")
public class IvrRecord extends AbsBaseEntity {
	private static final long serialVersionUID = 1L;

	private String finishKey;

	private int length;

	public IvrRecord() {
	}

	public String getFinishKey() {
		return this.finishKey;
	}

	public void setFinishKey(String finishKey) {
		this.finishKey = finishKey;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}