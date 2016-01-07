package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author vikash
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryHasAttachmentDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5592773661803924271L;
	private String nm;// name
	private String url;
	private String type;
	private String desc;// description

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
}
