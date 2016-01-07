package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name="company_has_templates")
public class CompanyHasTemplates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3769397779089266920L;
    
	@EmbeddedId
    protected CompanyHasTemplatePK companyHasTemplatePK;
	@Basic(optional = false)
    @NotNull
    @Column(name = "is_default")
    private boolean isDefault;
	
	@ManyToOne
	@JoinColumn(name = "template_id", insertable = false, updatable = false)
	private Template templates;
	
	
	public Template getTemplates() {
		return templates;
	}
	public void setTemplates(Template templates) {
		this.templates = templates;
	}
	public CompanyHasTemplatePK getCompanyHasTemplatePK() {
		return companyHasTemplatePK;
	}
	public void setCompanyHasTemplatePK(CompanyHasTemplatePK companyHasTemplatePK) {
		this.companyHasTemplatePK = companyHasTemplatePK;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	
}
