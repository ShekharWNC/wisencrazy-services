package com.dto;

import java.io.Serializable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class DirectoryUserDTO.
 * @author Vikash Pandey
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DirectoryUserDTO implements Serializable{
  
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The version. */
	private String version;
	
	/** Page URL *. */

	private String pageHref;
	
	/** Total Record Count *. */
	private Integer totalCount;
	
    /** Total Number of Page *. */
	private Integer tolalNoOfPage;

	/** The directory list dto. */
	private List<DirectoryListDTO> directoryListDTO;

	/**
	 * Gets the version.
	 * 
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 * 
	 * @param version
	 *            the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the directory list dto.
	 * 
	 * @return the directory list dto
	 */
	public List<DirectoryListDTO> getDirectoryListDTO() {
		return directoryListDTO;
	}

	/**
	 * Sets the directory list dto.
	 * 
	 * @param directoryListDTO
	 *            the new directory list dto
	 */
	public void setDirectoryListDTO(List<DirectoryListDTO> directoryListDTO) {
		this.directoryListDTO = directoryListDTO;
	}

	/**
	 * Gets the page href.
	 * 
	 * @return the page href
	 */
	public String getPageHref() {
		return pageHref;
	}

	/**
	 * Sets the page href.
	 * 
	 * @param pageHref
	 *            the new page href
	 */
	public void setPageHref(String pageHref) {
		this.pageHref = pageHref;
	}

	/**
	 * Gets the total count.
	 *
	 * @return the total count
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * Sets the total count.
	 *
	 * @param totalCount the new total count
	 */
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * Gets the tolal no of page.
	 *
	 * @return the tolal no of page
	 */
	public Integer getTolalNoOfPage() {
		return tolalNoOfPage;
	}

	/**
	 * Sets the tolal no of page.
	 *
	 * @param tolalNoOfPage the new tolal no of page
	 */
	public void setTolalNoOfPage(Integer tolalNoOfPage) {
		this.tolalNoOfPage = tolalNoOfPage;
	}
  
}