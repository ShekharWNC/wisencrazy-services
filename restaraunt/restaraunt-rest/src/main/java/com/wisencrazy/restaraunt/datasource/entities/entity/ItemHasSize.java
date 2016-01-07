package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "item_has_size")
@NamedQueries({ 
	@NamedQuery(name = ItemHasSize.FIND_ALL_SIZE_BY_ITEM, query = "SELECT c FROM ItemHasSize c WHERE c.item.sid =unhex(:itemSid)"),
	})
public class ItemHasSize extends AbsBaseEntity {

	private static final long serialVersionUID = -8294056610697239139L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemHasSize";
	public static final String FIND_ALL_SIZE_BY_ITEM = PREFIX+ "findAllSizeByItem";
	public static final String DELETE_ITEM_SIZE_BY_SIZE_SID="delete from item_has_size where sid=unhex(:sid)";
	@Column(name = "name")
	private String nm;
	@Column(name = "price")
	private Float price;
	@Column(name = "total_quantity")
	private Float totalQty;// total quantity
	@Column(name = "remaining_quantity")
	private Float rmngQty;// remaining quantity
	@Column(name = "discount")
	private Float disc;
	@Column(name = "is_available")
	private Boolean avail;
	@Column(name = "description")
	private String desc;
	@JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private Item item;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Float totalQty) {
		this.totalQty = totalQty;
	}

	public Float getRmngQty() {
		return rmngQty;
	}

	public void setRmngQty(Float rmngQty) {
		this.rmngQty = rmngQty;
	}
	
	public Float getDisc() {
		return disc;
	}

	public void setDisc(Float disc) {
		this.disc = disc;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void setAvail(Boolean avail) {
		this.avail = avail;
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
