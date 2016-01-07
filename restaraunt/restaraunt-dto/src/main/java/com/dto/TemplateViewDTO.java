package com.dto;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * Vikash Pandey
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateViewDTO extends AbsCommonDTO {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -6894195256717627076L;
	private String name;
	private String status;
	private String projectName;
	private List<TemplateContentDTO> templateContent;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<TemplateContentDTO> getTemplateContent() {
		return templateContent;
	}
	public void setTemplateContent(List<TemplateContentDTO> templateContent) {
		this.templateContent = templateContent;
	}
	
	
	 
}
