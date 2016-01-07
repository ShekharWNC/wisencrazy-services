package com.dto;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @author Vikash Pandey
 *
 */
public class DirectoryCustomerBusinessListViewDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1345447975571582959L;
	public String version;
	private String pageHref;
	private Integer totalCount;
	private Integer tolalNoOfPage;
	public List<DirectoryCustomerBusinessViewDTO> directoryList;
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
	public List<DirectoryCustomerBusinessViewDTO> getDirectoryList() {
		return directoryList;
	}
	public void setDirectoryList(
			List<DirectoryCustomerBusinessViewDTO> directoryList) {
		this.directoryList = directoryList;
	}
}
