package com.dto;

import java.io.Serializable;
import java.util.List;

public class CustomerBusinessViewDTO implements Serializable {
	
	private static final long serialVersionUID = -30082675874967775L;
	private String version;
	private String pageHref;
	private Integer totalCount;
	private Integer tolalNoOfPage;
	private List<CustomerBusinessViewListDTO> directoryListDTO;
	
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

	public List<CustomerBusinessViewListDTO> getDirectoryListDTO() {
		return directoryListDTO;
	}

	public void setDirectoryListDTO(
			List<CustomerBusinessViewListDTO> directoryListDTO) {
		this.directoryListDTO = directoryListDTO;
	}

}
