package com.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompanyHasTemplateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1756921844899323425L;
	private boolean isDefault;
	private TemplateDTO templates;
	public TemplateDTO getTemplates() {
		return templates;
	}
	public void setTemplates(TemplateDTO templates) {
		this.templates = templates;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
}
