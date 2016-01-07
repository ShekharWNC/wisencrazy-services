package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: KnowledgeBase
 *
 */
@Entity
@Table(name="knowledge_base")

@NamedQueries({
	@NamedQuery(name=KnowledgeBase.FIND_KB_BY_STATUS_AND_PROJECT_SID,query="select kb from KnowledgeBase kb join kb.projects p where hex(p.sid)=:projectSid and kb.access=:access and kb.status=:status"),
	@NamedQuery(name=KnowledgeBase.FIND_BY_PROJECT_SID,query="select kb from KnowledgeBase kb join kb.projects p where kb.status in (:status) and hex(p.sid)=:projectSid"),
	@NamedQuery(name=KnowledgeBase.FIND_BY_COMPANY_SID,query="select kb from KnowledgeBase kb join kb.companies c where kb.status in (:status) and hex(c.sid)=:companySid"),
	@NamedQuery(name=KnowledgeBase.FIND_BY_DEFAULT_STATUS,query="select kb from KnowledgeBase kb join kb.projects p where hex(p.sid)=:projectSid and kb.isDefault=:default"),
	@NamedQuery(name=KnowledgeBase.FIND_BY_COMPANYSID,query="select kb from KnowledgeBase kb join kb.projects p join p.company c where kb.status=:status and kb.access=:access and hex(c.sid)=:companySid union select kb from KnowledgeBase kb join kb.companies c where kb.access=:access and kb.status=:status and hex(c.sid)=:companySid"),
	@NamedQuery(name=KnowledgeBase.FIND_BY_ARTICLE_ACCESS_AND_STATUS,query="select distinct(kb) from KnowledgeBaseHasArticle kbha join kbha.knowledgeBase kb join kbha.article a where a.access=:access and hex(kb.sid)=:kbSid and a.status=:status")
})
public class KnowledgeBase extends AbsBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4168559006569994884L;
	
	public static final String PREFIX="com.callcomm.eserve.persistence.entity.KnowledgeBase";
	public static final String FIND_KB_BY_STATUS_AND_PROJECT_SID=PREFIX+".findKBByStatusAndProjectSid";
	public static final String FIND_BY_PROJECT_SID = PREFIX+".findByProjectSid"; 
	public static final String FIND_BY_COMPANY_SID = PREFIX+".findByCompanySid"; 
	public static final String FIND_BY_DEFAULT_STATUS = PREFIX+".findByDefaultStatus"; 
	public static final String FIND_BY_COMPANYSID=PREFIX+".findAllByCompanySid";
	public static final String FIND_BY_ARTICLE_ACCESS_AND_STATUS=PREFIX+".findByArticleAccessAndStatus";
	public enum ACCESS{
		INTERNAL,
		EXTERNAL
	}
	public enum STATUS{
		ENABLE,
		DISABLE
	}
	@Column(name="title")
	private String title;
	@Column(name="access")
	private String access;
	@Column(name="status")
	private String status;
	@ManyToMany(mappedBy="knowledgeBases")
	private List<Project> projects;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="knowledgeBase")
	private List<Category> categories;
	
	@ManyToMany(mappedBy="knowledgeBases")
	private List<Company> companies;
	
	@Column(name="is_default")
	private Boolean isDefault;
	
	public KnowledgeBase() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
   
}
