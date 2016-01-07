package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the rule_type database table.
 * 
 * @author Krish Lakshmanan
 * @since 17/02/2014
 */
@Entity
@Table(name="rule_type")
@NamedQueries({ @NamedQuery(name = RuleType.FIND_BY_NAME, query = "SELECT r FROM RuleType r where r.name = :name") })
public class RuleType extends AbsBaseEntity {

	private static final long serialVersionUID = -137638466484310037L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.RuleType.";
	public static final String FIND_BY_NAME = PREFIX + "findByName";

	public enum RuleTypeEnum {
		CASE, TIMER, CHANNEL, GAMIFICATION, VISUALCONNECT
	}
	private String name;

	public RuleType() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}