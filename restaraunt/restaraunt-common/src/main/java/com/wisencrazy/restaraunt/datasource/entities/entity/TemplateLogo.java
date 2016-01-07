package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="template_logo")
public class TemplateLogo extends AbsBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1482167496008732521L;
	@Column(name="name")
	private String name;
	@Column(name="logo_url")
	private String logoUrl;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof TemplateLogo)) {
	        return false;
	    }
	    TemplateLogo other = (TemplateLogo) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.TemplateLogo[ id=" + id + " ]";
	}

}

