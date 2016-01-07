package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.IvrMenu;
import com.wisencrazy.restaraunt.datasource.entities.entity.Project;

/**
 * Entity implementation class for Entity: ProjectHasDefaultIvrMenu
 *
 */
@Entity
@Table(name = "project_has_default_ivr_menu")
@NamedQueries({
	@NamedQuery(name=ProjectHasDefaultIvrMenu.FIND_BY_PROJECT_SID,query="SELECT p from ProjectHasDefaultIvrMenu p where hex(p.project.sid)=:projectSid"),
	@NamedQuery(name = ProjectHasDefaultIvrMenu.FIND_IVRSID_BY_PROJECT_SID, query = "select hex(p.ivrMenu.sid) from ProjectHasDefaultIvrMenu p where hex(p.project.sid)=:projectSid")
})
public class ProjectHasDefaultIvrMenu implements Serializable {
	
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ProjectHasDefaultIvrMenu.";
    public static final String FIND_BY_PROJECT_SID = PREFIX + "findByProjectSid";
    public static final String FIND_IVRSID_BY_PROJECT_SID = PREFIX + "findIvrSidByProjectSid";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "project_id", referencedColumnName = "id")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "ivr_menu_id", referencedColumnName = "id")
	private IvrMenu ivrMenu;
	
	private static final long serialVersionUID = 1L;

	public ProjectHasDefaultIvrMenu() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}   
	public IvrMenu getIvrMenu() {
		return this.ivrMenu;
	}

	public void setIvrMenu(IvrMenu ivrMenu) {
		this.ivrMenu = ivrMenu;
	}
   
}
