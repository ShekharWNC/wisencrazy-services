package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "case_view_rules")
@NamedQueries({
	@NamedQuery(name = CaseViewRule.FIND_ALL , query = "from CaseViewRule"),
	@NamedQuery(name = CaseViewRule.FIND_BY_COMPARE_TABLE , query = "from CaseViewRule cvr where cvr.value2CompareTable is not null")
})
public class CaseViewRule extends AbsBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3869255449481434907L;
	
	public static final String prefix = "com.callcomm.eserve.persistence.entity.CaseViewRule.";
	public static final String FIND_ALL = prefix + "findAll";
	public static final String FIND_BY_COMPARE_TABLE = prefix + "findByValue2CompareTable";
	
	@Column(name = "case_view_condition_comparison_url")
	private String comparisonUrl;
	
	@Column(name = "case_view_value2compare_url")
	private String value2CompareUrl;
	
	@Column(name = "value2compare_table")
	private String value2CompareTable;
	
	@Column(name = "field_type")
	private String fieldType;
	
	@ManyToOne
	@JoinColumn(name = "case_view_condition_type_id", referencedColumnName = "id", nullable = false)
	private CaseViewConditionType caseViewConditionType;

	public String getComparisonUrl() {
		return comparisonUrl;
	}

	public void setComparisonUrl(String comparisonUrl) {
		this.comparisonUrl = comparisonUrl;
	}

	public String getValue2CompareUrl() {
		return value2CompareUrl;
	}

	public void setValue2CompareUrl(String value2CompareUrl) {
		this.value2CompareUrl = value2CompareUrl;
	}

	public String getValue2CompareTable() {
		return value2CompareTable;
	}

	public void setValue2CompareTable(String value2CompareTable) {
		this.value2CompareTable = value2CompareTable;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public CaseViewConditionType getCaseViewConditionType() {
		return caseViewConditionType;
	}

	public void setCaseViewConditionType(CaseViewConditionType caseViewConditionType) {
		this.caseViewConditionType = caseViewConditionType;
	}
}
