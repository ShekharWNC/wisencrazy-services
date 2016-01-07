package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="template_type")
public class TemplateType extends AbsBaseEntity {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 261821617019663666L;
	@Column(name="name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof TemplateType)) {
	        return false;
	    }
	    TemplateType other = (TemplateType) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.TemplateType[ id=" + id + " ]";
	}

}

