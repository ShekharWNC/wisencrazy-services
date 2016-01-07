package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: ProjectHasKnowledgeBase
 *
 */
@Entity
@Table(name="project_has_knowledgebase")
public class ProjectHasKnowledgeBase extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7680805899473585917L;
	@OneToMany
	@JoinColumn(name="knowledgebase_id",referencedColumnName="id")
	private List<KnowledgeBase> knowledgeBase;
	@ManyToOne
	@JoinColumn(name="project_id",referencedColumnName="id")
	private Project project;
	
	public ProjectHasKnowledgeBase() {
		
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public List<KnowledgeBase> getKnowledgeBase() {
		return knowledgeBase;
	}
	public void setKnowledgeBase(List<KnowledgeBase> knowledgeBase) {
		this.knowledgeBase = knowledgeBase;
	}
	
   
}
