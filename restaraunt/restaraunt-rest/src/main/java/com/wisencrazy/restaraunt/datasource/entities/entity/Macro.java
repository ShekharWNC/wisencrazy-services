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

import org.hibernate.type.TrueFalseType;

@Entity
@Table(name = "emacro")
@NamedQueries({
		@NamedQuery(name = Macro.FIND_BY_NAME_PROJECT, query = "from Macro m where m.name = :name and hex(m.project.sid) = :projectSid"),
		@NamedQuery(name = Macro.FIND_ID_BY_NAME_PROJECT, query = "select m.id from Macro m where m.name = :name and hex(m.project.sid) = :projectSid"),
		@NamedQuery(name = Macro.FIND_BY_SID_AND_PROJECT, query = "from Macro m where hex(m.sid) = :sid and hex(m.project.sid) = :projectSid"),
		@NamedQuery(name = Macro.FIND_ID_BY_SID_AND_PROJECT, query = "select m.id from Macro m where hex(m.sid) = :sid and hex(m.project.sid) = :projectSid"),
		@NamedQuery(name = Macro.FIND_BY_SID_TYPE_AND_PROJECT, query = "from Macro m where hex(m.sid) = :sid and m.macroType.name = :macroType and hex(m.project.sid) = :projectSid"),
		@NamedQuery(name = Macro.UPDATE_MACRO_STATUS, query = "update Macro m set m.enable = :status where hex(m.sid) = :sid and m.project.id in (select p.id from Project p where hex(sid) = :projectSid)")
})
public class Macro extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8194653390559631974L;
	
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Macro.";
	public static final String FIND_BY_NAME_PROJECT = PREFIX + "findByNameAndProjectSid";
	public static final String FIND_ID_BY_NAME_PROJECT = PREFIX + "findIdByNameAndProjectSid";
	public static final String FIND_BY_SID_AND_PROJECT = PREFIX + "findBySidAndProjectSid";
	public static final String FIND_ID_BY_SID_AND_PROJECT = PREFIX + "findIdBySidAndProjectSid";
	public static final String FIND_BY_SID_TYPE_AND_PROJECT = PREFIX + "findBySidTypeAndProjectSid";

	public static final String UPDATE_MACRO_STATUS = PREFIX + "updateMacroStatus";

	private String name;
	
	private String description;
	
	@Column(name = "is_enabled")
	private boolean enable;
	
	private String applicability;
	
	@ManyToOne
	@JoinColumn(name = "macro_type_id", referencedColumnName = "id", nullable = false )
	private MacroType macroType;
	
	@ManyToOne
	@JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)
	private Project project;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "emacro_id", nullable = false)
	private List<MacroHasActions> macroHasActions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getApplicability() {
		return applicability;
	}

	public void setApplicability(String applicability) {
		this.applicability = applicability;
	}

	public MacroType getMacroType() {
		return macroType;
	}

	public void setMacroType(MacroType macroType) {
		this.macroType = macroType;
	}

	public List<MacroHasActions> getMacroHasActions() {
		return macroHasActions;
	}

	public void setMacroHasActions(List<MacroHasActions> macroHasActions) {
		this.macroHasActions = macroHasActions;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}
