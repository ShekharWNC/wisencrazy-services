package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TemplateStyleDTO extends AbsCommonDTO {
   /**
	 * 
	 */
	private static final long serialVersionUID = -5569088383702971238L;
	private String name;
    private TemplateLogoDTO templateLogo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TemplateLogoDTO getTemplateLogo() {
		return templateLogo;
	}
	public void setTemplateLogo(TemplateLogoDTO templateLogo) {
		this.templateLogo = templateLogo;
	}
    
}
