package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author shekhar8161
 *
 */
@Entity
@Table(name = "item_category")
@NamedQueries({
	@NamedQuery(name=ItemCategory.FIND_BY_RESTRO_SID,query="select ic from ItemCategory ic where hex(ic.restaraunt.sid) = :sid"),
})
public class ItemCategory extends AbsBaseEntity {

	private static final long serialVersionUID = -43139407789703374L;
	public static final String PREFIX = "com.wisencrazy.restaraunt.datasource.entities.entity.ItemCategory.";
	public static final String FIND_BY_RESTRO_SID=PREFIX+"findByRestroSid";

	@Column(name = "name")
	private String nm;
	
	@Column(name = "description")
	private String desc;
	
	@Column(name="tag_name")
	private String tagName;
	
	@Column(name="photo_url")
	private String photo_url;

	@JoinColumn(name = "restro_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Restaraunt restaraunt;
	
	@OneToMany(mappedBy = "itemCategory", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Item> item;
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getNm() {
		return nm;
	}
	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Restaraunt getRestaraunt() {
		return restaraunt;
	}

	public void setRestaraunt(Restaraunt restaraunt) {
		this.restaraunt = restaraunt;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

}
