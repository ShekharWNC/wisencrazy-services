package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * Template: Vikash Kumar Pandey
 */
@Entity
@Table(name="template_view")
@NamedQueries({
 @NamedQuery(name = TemplateView.FIND_BY_PROJECT_AND_TYPE, query = "select t from TemplateView t where t.projectId=:projectId and t.templateType = :templateType")
 })
public class TemplateView extends AbsBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4665448062510277314L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.TemplateView.";

	public static final String FIND_BY_PROJECT_AND_TYPE = PREFIX + "findByProjectAndType";
	
	@Column(name="name")
	private String name;
	
	@Column(name="status")
	private String status;

	@Column(name="channel_supports")
	private String channelSupports;
	
	@Column(name = "project_id")
    private Integer projectId;
	
	@Column(name="template_type")
	private String templateType;
    
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

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getTemplateType() {
		return templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof Template)) {
	        return false;
	    }
	    Template other = (Template) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.Template[ id=" + id + " ]";
	}
}

