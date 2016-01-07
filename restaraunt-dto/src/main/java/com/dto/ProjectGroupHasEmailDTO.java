package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ProjectGroupHasEmailDTO extends AbsCommonDTO {
	private static final long serialVersionUID = 228728435443709489L;
	private String email;
	private String forwardEmail;
	private String subDomainUrl;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getForwardEmail() {
		return forwardEmail;
	}
	public void setForwardEmail(String forwardEmail) {
		this.forwardEmail = forwardEmail;
	}
	public String getSubDomainUrl() {
		return subDomainUrl;
	}
	public void setSubDomainUrl(String subDomainUrl) {
		this.subDomainUrl = subDomainUrl;
	}
}
