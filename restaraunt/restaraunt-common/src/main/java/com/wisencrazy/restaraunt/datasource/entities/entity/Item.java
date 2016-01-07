package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author vikash
 */
@Entity
@Table(name = "item")
@NamedQueries({ @NamedQuery(name = Item.FIND_ALL_BY_COMPANY, query = "SELECT c FROM Item c WHERE c.company.sid =unhex(:companySid) and c.project.sid=unhex(:projectSid)"), })
public class Item extends AbsBaseEntity {

	private static final long serialVersionUID = -5911956229150107063L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Item";
	public static final String FIND_ALL_BY_COMPANY = PREFIX
			+ "findAllByCompany";
	public static String VALIDATE_ITEM_BY_COMPANY = "select id from item where name=:name and company_id=:companyId and project_id=:projectId";
	public static String FIND_ITEM_BY_CATEGORY_AND_COMPANY = "select i.* from item i,category_has_item c where i.id=c.item_id and c.category_id=:categoryId";
	public static String UPDATE_ITEM_STATUS = "update item set is_available=:status where sid=unhex(:itemSid)";
	public static String UPDATE_ITEM_ATTACHMENT="update item set url=:URL where id=:itemId";
	public static String UPDATE_ITEM_ATTRIBUTE="update item set attribute_json=:json where name=:name and company_id=:companyId and project_id=:projectId";
	public static String UPDATE_ITEM_ATTACHMENT_BY_ATTACHEMENT_UPDATE="update item set url=:url where id=:id";
	public static String GET_ITEM_ID_BY_COMPANY_AND_PROJECT="select id from item where name=:name and company_id=:companyId and project_id=:projectId";
	public static String DELETE_ITEM_FROM_CATEGORY_HAS_ITEM="delete from category_has_item where item_id=:itemId";
	public static String DELETE_ITEM_VARIETY="delete from item_has_variety where item_id=:itemId";
	public static String DELETE_ITEM_ADDON="delete from item_has_addon where item_id=:itemId";
	@Column(name = "name")
	private String nm;
	@Column(name = "size")
	private String size;
	@Column(name = "price")
	private Float price;
	@Column(name = "discount")
	private Float disc;
	@Column(name = "remaining_quantity")
	private Float rmngQty;// remaining quantity
	@Column(name = "total_quantity")
	private Float totalQty;// total quantity
	@Column(name = "description")
	private String desc;// description
	@Column(name = "is_available")
	private Boolean avail;
	@Column(name = "overall_rating")
	private Float ovrallrting;
	@Column(name = "has_variety")
	private Boolean hasV;
	@Column(name = "has_addon")
	private Boolean hasA;
	@Column(name = "has_custom_field")
	private Boolean hasCF;
	@Column(name = "has_timing")
	private Boolean hasTime;
	@Column(name = "has_size")
	private Boolean hasSize;
	@Column(name = "url")
	private String picUrl;
	@Column(name="item_type")
	private String itemType;
	@Column(name="tag_name")
	private String tagName;
	@Column(name = "attribute_json")
	private String attribJson;
	@OneToMany(mappedBy = "item", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<ItemHasAttachment> attached;
	@OneToMany(mappedBy = "item", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<ItemHasSize> sizes;
	@OneToMany(mappedBy = "item", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<ItemHasTiming> times;
	@OneToMany(mappedBy = "item", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<ItemHasReview> review;
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Company company;
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Project project;

	@ManyToMany
    @JoinTable(name = "item_has_tax_catogories", joinColumns = {
            @JoinColumn(name = "tax_catogory_id", referencedColumnName = "id", nullable = false)}, 
            inverseJoinColumns = {@JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)})
	private List<TaxCategories> taxCatogory;
	
	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}
	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDisc() {
		return disc;
	}

	public void setDisc(Float disc) {
		this.disc = disc;
	}

	public Float getRmngQty() {
		return rmngQty;
	}

	public void setRmngQty(Float rmngQty) {
		this.rmngQty = rmngQty;
	}

	public Float getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Float totalQty) {
		this.totalQty = totalQty;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getAvail() {
		return avail;
	}

	public void setAvail(Boolean avail) {
		this.avail = avail;
	}

	public Float getOvrallrting() {
		return ovrallrting;
	}

	public void setOvrallrting(Float ovrallrting) {
		this.ovrallrting = ovrallrting;
	}

	public Boolean getHasV() {
		return hasV;
	}

	public void setHasV(Boolean hasV) {
		this.hasV = hasV;
	}

	public Boolean getHasA() {
		return hasA;
	}

	public void setHasA(Boolean hasA) {
		this.hasA = hasA;
	}

	public Boolean getHasCF() {
		return hasCF;
	}

	public void setHasCF(Boolean hasCF) {
		this.hasCF = hasCF;
	}

	public Boolean getHasTime() {
		return hasTime;
	}

	public void setHasTime(Boolean hasTime) {
		this.hasTime = hasTime;
	}

	public Boolean getHasSize() {
		return hasSize;
	}

	public void setHasSize(Boolean hasSize) {
		this.hasSize = hasSize;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getAttribJson() {
		return attribJson;
	}

	public void setAttribJson(String attribJson) {
		this.attribJson = attribJson;
	}

	public List<ItemHasAttachment> getAttached() {
		return attached;
	}

	public void setAttached(List<ItemHasAttachment> attached) {
		this.attached = attached;
	}

	public List<ItemHasSize> getSizes() {
		return sizes;
	}

	public void setSizes(List<ItemHasSize> sizes) {
		this.sizes = sizes;
	}

	public List<ItemHasTiming> getTimes() {
		return times;
	}

	public void setTimes(List<ItemHasTiming> times) {
		this.times = times;
	}

	public List<ItemHasReview> getReview() {
		return review;
	}

	public void setReview(List<ItemHasReview> review) {
		this.review = review;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public List<TaxCategories> getTaxCatogory() {
		return taxCatogory;
	}

	public void setTaxCatogory(List<TaxCategories> taxCatogory) {
		this.taxCatogory = taxCatogory;
	}
	
}
