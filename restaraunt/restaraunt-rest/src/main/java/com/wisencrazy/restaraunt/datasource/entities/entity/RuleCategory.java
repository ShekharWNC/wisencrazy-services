package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the rule_category database table.
 * 
 * @author Krish Lakshmanan
 * @since 17/02/2014
 */
@Entity
@Table(name="rule_category")
public class RuleCategory extends AbsBaseEntity {

	public static final String TIMER = "TIMER";

	private static final long serialVersionUID = -4325031562617785169L;

	private String name;

	public RuleCategory() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}