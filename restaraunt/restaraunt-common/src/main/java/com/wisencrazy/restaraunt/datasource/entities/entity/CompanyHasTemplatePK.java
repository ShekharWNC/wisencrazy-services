package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
@Embeddable
public class CompanyHasTemplatePK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6178784346536294724L;
	@Basic(optional = false)
    @NotNull
    @Column(name = "company_id")
    private Integer companyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "template_id")
    private Integer templateId;
    
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public int getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
 @Override
    public int hashCode() {
        int hash = 0;
        hash += (templateId != null ? templateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompanyHasTemplatePK)) {
            return false;
        }
        CompanyHasTemplatePK other = (CompanyHasTemplatePK) object;
        if ((this.templateId == null && other.templateId != null) || (this.templateId != null && !this.templateId.equals(other.templateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CompanyHasTemplatePK[ id=" + templateId + " ]";
    }
}
