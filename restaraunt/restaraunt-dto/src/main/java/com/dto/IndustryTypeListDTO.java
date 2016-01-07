package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class IndustryTypeListDTO implements Serializable {
	private String version;
	private List<IndustryTypeDTO> industryTypeList;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<IndustryTypeDTO> getIndustryTypeList() {
		return industryTypeList;
	}
	public void setIndustryTypeList(List<IndustryTypeDTO> industryTypeList) {
		this.industryTypeList = industryTypeList;
	}
	

}
