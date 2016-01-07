package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 4/16/13
 * Time: 1:12 PM
 */
@Entity
@Table(name = "case_view_condition_comparison")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseViewConditionComparison.FIND_ALL, query = "SELECT c FROM CaseViewConditionComparison c"),
        @NamedQuery(name = CaseViewConditionComparison.FIND_BY_ID, query = "SELECT c FROM CaseViewConditionComparison c WHERE c.id = :id"),
        @NamedQuery(name = CaseViewConditionComparison.FIND_BY_VALUE_2_COMPARE, query = "SELECT c FROM CaseViewConditionComparison c WHERE c.value2Compare = :value2Compare"),
        @NamedQuery(name = CaseViewConditionComparison.FIND_BY_CONDITIONS, query = "SELECT c FROM CaseViewConditionComparison c " +
                "JOIN FETCH c.caseViewConditionTypeHasComparisonOperator " +
                "WHERE c.caseViewConditionId.id IN (:conditionList)"),
        @NamedQuery(name = CaseViewConditionComparison.FIND_BY_CASEVIEW, query = "SELECT c FROM CaseViewConditionComparison c " +
                "JOIN FETCH c.caseViewConditionId con " +
                "JOIN FETCH c.caseViewConditionTypeHasComparisonOperator comp " +
                "JOIN FETCH comp.comparisonOperator " +
                "JOIN FETCH comp.caseViewConditionType " +
                "WHERE con.caseView.id = :id")})
public class CaseViewConditionComparison extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseViewConditionComparison.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_VALUE_2_COMPARE = PREFIX + "findByValue2Compare";
    public static final String FIND_BY_CASEVIEW = PREFIX + "findByCaseView";
    public static final String FIND_BY_CONDITIONS = PREFIX + "findByConditions";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(max = 255)
    @Column(name = "value_2_compare")
    private String value2Compare;
    @JoinColumns({
            @JoinColumn(name = "case_view_condition_type_id", referencedColumnName = "case_view_condition_type_id"),
            @JoinColumn(name = "comparison_operator_id", referencedColumnName = "comparison_operator_id")})
    @ManyToOne(optional = false,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CaseViewConditionTypeHasComparisonOperator caseViewConditionTypeHasComparisonOperator;
    @JoinColumn(name = "case_view_condition_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CaseViewCondition caseViewConditionId;
    
    @Column(name = "value_2_compare_sid")
    private String value2CompareSid;

    public CaseViewConditionComparison() {
    }


    public String getValue2Compare() {
        return value2Compare;
    }

    public void setValue2Compare(String value2Compare) {
        this.value2Compare = value2Compare;
    }

    public CaseViewConditionTypeHasComparisonOperator getCaseViewConditionTypeHasComparisonOperator() {
        return caseViewConditionTypeHasComparisonOperator;
    }

    public void setCaseViewConditionTypeHasComparisonOperator(CaseViewConditionTypeHasComparisonOperator caseViewConditionTypeHasComparisonOperator) {
        this.caseViewConditionTypeHasComparisonOperator = caseViewConditionTypeHasComparisonOperator;
    }

    public ComparisonOperator getComparisonOperator() {
        if(this.caseViewConditionTypeHasComparisonOperator != null) return this.caseViewConditionTypeHasComparisonOperator.getComparisonOperator();

        return null;
    }

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        if(this.caseViewConditionTypeHasComparisonOperator == null) this.caseViewConditionTypeHasComparisonOperator = new CaseViewConditionTypeHasComparisonOperator();

        this.caseViewConditionTypeHasComparisonOperator.setComparisonOperator(comparisonOperator);
    }

    public CaseViewConditionType getCaseViewConditionType() {
        if(this.caseViewConditionTypeHasComparisonOperator != null) return this.caseViewConditionTypeHasComparisonOperator.getCaseViewConditionType();

        return null;
    }

    public void setCaseViewConditionType(CaseViewConditionType caseViewConditionType) {
        if(this.caseViewConditionTypeHasComparisonOperator == null) this.caseViewConditionTypeHasComparisonOperator = new CaseViewConditionTypeHasComparisonOperator();

        this.caseViewConditionTypeHasComparisonOperator.setCaseViewConditionType(caseViewConditionType);
    }

    public CaseViewCondition getCaseViewConditionId() {
        return caseViewConditionId;
    }

    public void setCaseViewConditionId(CaseViewCondition caseViewConditionId) {
        this.caseViewConditionId = caseViewConditionId;
    }


	public String getValue2CompareSid() {
		return value2CompareSid;
	}


	public void setValue2CompareSid(String value2CompareSid) {
		this.value2CompareSid = value2CompareSid;
	}
}

