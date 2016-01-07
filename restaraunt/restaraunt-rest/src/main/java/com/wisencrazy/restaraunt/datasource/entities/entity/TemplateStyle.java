package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="template_style")
public class TemplateStyle extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8952276099009929294L;
	@Column(name="name")
	private String name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "logo_id")
	private TemplateLogo templateLogo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TemplateLogo getTemplateLogo() {
		return templateLogo;
	}
	public void setTemplateLogo(TemplateLogo templateLogo) {
		this.templateLogo = templateLogo;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof TemplateStyle)) {
	        return false;
	    }
	    TemplateStyle other = (TemplateStyle) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.TemplateStyle[ id=" + id + " ]";
	}
}
