package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name = "item_has_timing")
@NamedQueries({ 
	@NamedQuery(name = ItemHasTiming.FIND_ALL_TIMING_BY_ITEM, query = "SELECT c FROM ItemHasTiming c WHERE c.item.sid =unhex(:itemSid)"),
	})
public class ItemHasTiming extends AbsBaseEntity {

	private static final long serialVersionUID = 892291292826053556L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemHasTiming";
	public static final String FIND_ALL_TIMING_BY_ITEM = PREFIX+ "findAllTimingByItem";
	public static final String DELETE_ITEM_TIMING_BY_TIMING_SID="delete from item_has_timing where sid=unhex(:sid)";
	@Column(name = "start_time")
	private Integer sTime;
	@Column(name = "end_time")
	private Integer eTime;
	@Column(name = "day_of_week")
	private String week;
	@Column(name = "description")
	private String desc;
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	@ManyToOne
	private Item item;

	public Integer getsTime() {
		return sTime;
	}

	public void setsTime(Integer sTime) {
		this.sTime = sTime;
	}

	public Integer geteTime() {
		return eTime;
	}

	public void seteTime(Integer eTime) {
		this.eTime = eTime;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
