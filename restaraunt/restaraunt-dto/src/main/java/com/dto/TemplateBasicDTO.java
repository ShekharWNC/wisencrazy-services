package com.dto;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * UserTO: Vikash Kumar Pandey
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateBasicDTO extends AbsCommonDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7753075814204837231L;
	/**
	 * 
	 */
	private String name;
	private String status;
	private String templateType;
	private String channelSupports;
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
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getChannelSupports() {
		return channelSupports;
	}
	public void setChannelSupports(String channelSupports) {
		this.channelSupports = channelSupports;
	}
}
