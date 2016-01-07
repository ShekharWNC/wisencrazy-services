package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessTableDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 4182615335131920998L;
	private String name;
	private String description;
	private Integer tableId;
	private String companySid;
	private String companyName;
	private String projectSid;
	private String projectName;
	private VirtualAccountBasicDTO virtualAccount;
	private String status;
	
	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public VirtualAccountBasicDTO getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(VirtualAccountBasicDTO virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
