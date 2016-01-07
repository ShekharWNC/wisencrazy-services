package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash Pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyProjectUserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2681281386179912892L;
	private String version;
	private String pageHref;
	private Integer totalCount;
	private Integer tolalNoOfPage;
	private List<CompanyProjectUserViewDTO> directoryList;
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<CompanyProjectUserViewDTO> getDirectoryList() {
		return directoryList;
	}
	public void setDirectoryList(List<CompanyProjectUserViewDTO> directoryList) {
		this.directoryList = directoryList;
	}
	
}
