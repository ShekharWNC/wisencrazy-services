package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class ViewProjectUserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2752292272568489070L;
	private String version;
	private String pageHref;
	private Integer totalCount;
	private Integer tolalNoOfPage;
	private List<ProjectUserViewDTO> directoryList;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPageHref() {
		return pageHref;
	}
	public void setPageHref(String pageHref) {
		this.pageHref = pageHref;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTolalNoOfPage() {
		return tolalNoOfPage;
	}
	public void setTolalNoOfPage(Integer tolalNoOfPage) {
		this.tolalNoOfPage = tolalNoOfPage;
	}
	public List<ProjectUserViewDTO> getDirectoryList() {
		return directoryList;
	}
	public void setDirectoryList(List<ProjectUserViewDTO> directoryList) {
		this.directoryList = directoryList;
	}
	

}
