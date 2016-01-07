package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author vikash
 *
 */
@Entity
@Table(name="master_food_data")
@NamedQueries({ @NamedQuery(name =MasterFoodData.GET_URL_BY_NAME,query="select m from MasterFoodData m where m.itemName=:itemName")
	})
public class MasterFoodData extends AbsBaseEntity{

	/**
	 * 
	 */
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.MasterFoodData.";
	public static final String GET_URL_BY_NAME = PREFIX+ "getMasterDataByUrl";
	public static String GET_URL_BY_TAG_NAME="select * from master_food_data where tag_name=:tagName";
	private static final long serialVersionUID = -1223212505488493643L;
	@Column(name="file_name")
	private String fileName;
	@Column(name="item_name")
	private String itemName;
	@Column(name="also_called")
	private String alsoCalled;
	@Column(name="description")
	private String description;
	@Column(name="tag_name")
	private String tagName;
	@Column(name="url")
	private String url;
	
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAlsoCalled() {
		return alsoCalled;
	}
	public void setAlsoCalled(String alsoCalled) {
		this.alsoCalled = alsoCalled;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
