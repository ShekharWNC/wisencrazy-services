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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author vikash
 */
@Entity
@Table(name = "item_category")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = ItemCategory.VALIDATE_CATAEGORY_BY_COMPANY, query = "SELECT i from ItemCategory i where nm=:name and i.company.sid=unhex(:companySid) and i.project.sid=unhex(:projectSid)"),
		@NamedQuery(name = ItemCategory.FIND_CATEGORY_BY_COMPANY_SID, query = "from ItemCategory i where i.company.sid=unhex(:companySid) and i.project.sid=unhex(:projectSid) and i.parent=true"),
		@NamedQuery(name = ItemCategory.FIND_ALL_ITEM_CATEGORY_BY_PROJECT, query = "from ItemCategory i where i.company.sid=unhex(:companySid) and i.project.sid=unhex(:projectSid)") })
public class ItemCategory extends AbsBaseEntity {

	private static final long serialVersionUID = -43139407789703374L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ItemCategory.";
	public static final String VALIDATE_CATAEGORY_BY_COMPANY = PREFIX
			+ "validateCategoryByCompany";
	public static final String FIND_CATEGORY_BY_COMPANY_SID = PREFIX
			+ "findCategoryByCompanySid";
	public static final String FIND_ALL_ITEM_CATEGORY_BY_PROJECT = PREFIX
			+ "findAllItemCategoryByProject";
	public static String FIND_SUB_CATEGORY_BY_CATEGORY = "select i.* from item_category i,category_has_sub_category s where s.sub_category_id=i.id and s.category_id=:categoryId";
	@Column(name = "name")
	private String nm;
	@Column(name = "description")
	private String desc;
	@Column(name = "has_sub_category")
	private Boolean hasSC;
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	@ManyToOne
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;
	@Column(name = "is_parent")
	private Boolean parent;
	@Column(name="tag_name")
	private String tagName;
	@Column(name="url")
	private String url;
	@OneToMany(mappedBy = "category", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<CategoryHasAttachment> attached;

	public String getNm() {
		return nm;
	}
	
	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getHasSC() {
		return hasSC;
	}

	public void setHasSC(Boolean hasSC) {
		this.hasSC = hasSC;
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

	public Boolean getParent() {
		return parent;
	}

	public void setParent(Boolean parent) {
		this.parent = parent;
	}

	public List<CategoryHasAttachment> getAttached() {
		return attached;
	}

	public void setAttached(List<CategoryHasAttachment> attached) {
		this.attached = attached;
	}
}
