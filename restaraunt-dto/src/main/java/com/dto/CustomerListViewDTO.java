package com.dto;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @author Vikash Pandey
 *
 */
public class CustomerListViewDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6251712409925500036L;
	public String version;
	private String pageHref;
	private Integer totalCount;
	private Integer tolalNoOfPage;
	public List<CustomerViewDTO> directoryList;
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
	public List<CustomerViewDTO> getDirectoryList() {
		return directoryList;
	}
	public void setDirectoryList(List<CustomerViewDTO> directoryList) {
		this.directoryList = directoryList;
	}
	
}
