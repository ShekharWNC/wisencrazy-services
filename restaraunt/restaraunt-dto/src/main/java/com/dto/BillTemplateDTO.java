package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 
 * @author vikash
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BillTemplateDTO extends AbsCommonDTO {

	private static final long serialVersionUID = 7516204179164185242L;
	private String status;
	private String templateJson;
	private String companySid;
	private String projectSid;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateJson() {
		return templateJson;
	}

	public void setTemplateJson(String templateJson) {
		this.templateJson = templateJson;
	}

	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}
}
