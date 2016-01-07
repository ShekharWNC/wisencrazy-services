package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemCategoryDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3756881743428207604L;
	private String nm;// name
	private String desc;// description
	private Boolean hasSC;// hasSubCategory
	private String hrefSC; // sub category href
	private String url;
	private String tagName;
	private List<CategoryHasAttachmentDTO> attached;// attachment

	public String getNm() {
		return nm;
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

	public String getHrefSC() {
		return hrefSC;
	}

	public void setHrefSC(String hrefSC) {
		this.hrefSC = hrefSC;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<CategoryHasAttachmentDTO> getAttached() {
		return attached;
	}

	public void setAttached(List<CategoryHasAttachmentDTO> attached) {
		this.attached = attached;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}
