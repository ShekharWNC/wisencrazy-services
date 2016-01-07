package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 3/1/13
 * Time: 1:13 PM
 */
@Entity
@Table(name = "routing_rules_group")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = RoutingRulesGroup.FIND_ALL, query = "SELECT r FROM RoutingRulesGroup r"),
        @NamedQuery(name = RoutingRulesGroup.FIND_BY_ID, query = "SELECT r FROM RoutingRulesGroup r WHERE r.id = :id"),
        @NamedQuery(name = RoutingRulesGroup.FIND_BY_NAME, query = "SELECT r FROM RoutingRulesGroup r WHERE r.name = :name"),
		@NamedQuery(name = RoutingRulesGroup.FIND_BY_PROJECT_ID, query = "SELECT r FROM RoutingRulesGroup r WHERE r.project.id = :projectId") })
public class RoutingRulesGroup extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RoutingRulesGroup.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_PROJECT_ID = PREFIX + "findByProjectId";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "routingRulesGroup") //
	 * is dead relation. private List<RoutingRule> routingRules;
	 */
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Project project;

    public RoutingRulesGroup() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	/*
	 * @XmlTransient public List<RoutingRule> getRoutingRules() { return
	 * routingRules; }
	 * 
	 * public void setRoutingRulest(List<RoutingRule> routingRules) {
	 * this.routingRules = routingRules; }
	 */

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
