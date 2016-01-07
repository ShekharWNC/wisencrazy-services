package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
@Table(name = "item_has_addon")
@NamedQueries({ @NamedQuery(name = ItemHasAddon.FIND_ADDON_BY_ITEM, query = "select i from ItemHasAddon i where i.itemAddon.itemId=:itemId") })
public class ItemHasAddon extends AbsCompositeEntity {
	private static final long serialVersionUID = 5896575329277186901L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemHasAddon.";
	public static final String FIND_ADDON_BY_ITEM = PREFIX
			+ "findItemHasAddonByItemId";
	public static String FIND_ADDON_ID="select item_addon_id from item_has_addon where item_addon_id=:addonId and item_id=:itemId";
	public static final String DELETE_ITEM_ADDON_BY_ADDON_SID="delete from item_has_addon where sid=unhex(:sid)";
	@EmbeddedId
	private ItemHasAddonPK itemAddon;

	@Column(name = "price")
	private Float price;
	@Column(name = "is_mandatory")
	private Boolean mdatory;
	@Column(name = "total_quantity")
	private Float totalQty;
	@Column(name = "remaining_quantity")
	private Float rmngQty;
	@Column(name = "discount")
	private Float disc;
	@JoinColumn(name = "item_addon_id", referencedColumnName = "id", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private ItemAddon addon;
	@JoinColumn(name = "item_addon_size", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private ItemAddonSize addonSize;

	public ItemHasAddonPK getItemAddon() {
		return itemAddon;
	}

	public void setItemAddon(ItemHasAddonPK itemAddon) {
		this.itemAddon = itemAddon;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getMdatory() {
		return mdatory;
	}

	public void setMdatory(Boolean mdatory) {
		this.mdatory = mdatory;
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

	public ItemAddon getAddon() {
		return addon;
	}

	public void setAddon(ItemAddon addon) {
		this.addon = addon;
	}

	public ItemAddonSize getAddonSize() {
		return addonSize;
	}

	public void setAddonSize(ItemAddonSize addonSize) {
		this.addonSize = addonSize;
	}
}