package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Template: Vikash Kumar Pandey
 */
@Entity
@Table(name="template")
@NamedQueries({
	@NamedQuery(name = Template.FIND_BY_ID, query = "SELECT t FROM Template t WHERE t.id = :id"),
	@NamedQuery(name = Template.FIND_PLACE_HOLDERS_BY_EMAIL, query = "select p from Template t join t.templateContents tc join tc.placeHolder p where tc.channel.channelName = 'EMAIL' and t.id = :id"),
	@NamedQuery(name =Template.FIND_EMAIL_SUPER_TEMPLATE, query="from Template t where t.project.id=:projectId and t.name='EMAIL_SUPER_TEMPLATE' and t.templateType='SYSTEM_DEFINED'"),
	@NamedQuery(name =Template.FIND_TEMPLATE_BY_NAME, query="from Template t where t.project.id=:projectId and t.name=:templateName and t.templateType='SYSTEM_DEFINED'"),
	@NamedQuery(name =Template.FIND_TEMPLATE_BY_NAME_PROJECT_SID, query="from Template t where hex(t.project.sid)=:projectSid and t.name=:templateName and t.templateType='SYSTEM_DEFINED'"),
	@NamedQuery(name =Template.FIND_TEMPLATE_SID_BY_NAME_PROJECT_SID, query="select hex(t.sid) from Template t where hex(t.project.sid)=:projectSid and t.name=:templateName and t.templateType='SYSTEM_DEFINED'"),
	@NamedQuery(name=Template.FIND_SUPER_TEMPLATE_BY_NAME, query="select t from Template t where t.name=:name")
})
public class Template extends AbsBaseEntity{

	private static final long serialVersionUID = -9136791223899928671L;
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Template.";
	public static final String FIND_BY_ID = PREFIX + "findById";
	public static final String FIND_PLACE_HOLDERS_BY_EMAIL = PREFIX + "findPlaceHoldersByEmail";
	public static final String FIND_EMAIL_SUPER_TEMPLATE=PREFIX+"findEmailSuperTemplate";
	public static final String FIND_TEMPLATE_BY_NAME=PREFIX+"findTemplateByName";
	public static final String FIND_TEMPLATE_BY_NAME_PROJECT_SID=PREFIX+"findTemplateByNameByProjectSid";
	public static final String FIND_TEMPLATE_SID_BY_NAME_PROJECT_SID=PREFIX+"findTemplateSidByNameByProjectSid";
	public static final String FIND_SUPER_TEMPLATE_BY_NAME=PREFIX+"findSuperTemplateByName";
	
	@Column(name="name")
	private String name;
	
	@Column(name="status")
	private String status;

	@Column(name="channel_supports")
	private String channelSupports;
	
	@JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Project project;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "template_id", nullable = false)
	private List<TemplateContent> templateContents;
	
	@Column(name="template_type")
	private String templateType;
    
	public List<TemplateContent> getTemplateContents() {
		return templateContents;
	}

	public void setTemplateContents(List<TemplateContent> templateContents) {
		this.templateContents = templateContents;
	}

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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
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


