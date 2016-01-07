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
@Table(name = "item_has_variety")
@NamedQueries({ @NamedQuery(name = ItemHasVariety.FIND_ITEM_VARIETY_BY_ITEMSID, query = "select s from ItemHasVariety s where s.itemPK.itemId=:itemId") })
public class ItemHasVariety extends AbsCompositeEntity {

	private static final long serialVersionUID = -3989237972630984285L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemHasVariety.";
	public static final String FIND_ITEM_VARIETY_BY_ITEMSID = PREFIX+ "findItemVarietyByItemSid";
	public static String FIND_VARIETY_ID="select item_id from item_has_variety where item_verity_id=:varietyId and item_id=:itemId";
	public static final String DELETE_ITEM_VARIETY_BY_VARIETY_SID="delete from item_has_variety where sid=unhex(:sid)";
	@EmbeddedId
	private ItemHasVarietyPK itemPK;
	@Column(name = "price")
	private Float price;
	@Column(name = "is_mandatory")
	private Boolean mdatory;
	@JoinColumn(name = "item_verity_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ItemVariety variety;

	public ItemHasVarietyPK getItemPK() {
		return itemPK;
	}

	public void setItemPK(ItemHasVarietyPK itemPK) {
		this.itemPK = itemPK;
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

	public ItemVariety getVariety() {
		return variety;
	}

	public void setVariety(ItemVariety variety) {
		this.variety = variety;
	}
}
