package com.dto;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectGroupCountViewDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String version;
	private List<ProjectGroupCountViewListDTO> projectGroupCountViewListDTO;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public List<ProjectGroupCountViewListDTO> getProjectGroupCountViewListDTO() {
		return projectGroupCountViewListDTO;
	}
	public void setProjectGroupCountViewListDTO(
			List<ProjectGroupCountViewListDTO> projectGroupCountViewListDTO) {
		this.projectGroupCountViewListDTO = projectGroupCountViewListDTO;
	}
}
