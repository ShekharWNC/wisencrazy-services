package com.dto;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * UserTO: Vikash Kumar Pandey
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6614417176618996843L;
	private String name;
	private String status;
	private ProjectCommonDTO project;
	private String templateType;
	private String channelSupports;
	private List<TemplateContentDTO> templateContents;
	  
	public ProjectCommonDTO getProject() {
		return project;
	}
	public void setProject(ProjectCommonDTO project) {
		this.project = project;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public List<TemplateContentDTO> getTemplateContents() {
		return templateContents;
	}
	public void setTemplateContents(List<TemplateContentDTO> templateContents) {
		this.templateContents = templateContents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChannelSupports() {
		return channelSupports;
	}
	public void setChannelSupports(String channelSupports) {
		this.channelSupports = channelSupports;
	}
	
}

