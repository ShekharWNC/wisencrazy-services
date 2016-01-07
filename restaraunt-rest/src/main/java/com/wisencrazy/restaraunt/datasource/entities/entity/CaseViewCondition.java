package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 4/16/13
 * Time: 1:06 PM
 */
@Entity
@Table(name = "case_view_condition")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseViewCondition.FIND_ALL, query = "SELECT c FROM CaseViewCondition c"),
        @NamedQuery(name = CaseViewCondition.FIND_BY_ID, query = "SELECT c FROM CaseViewCondition c WHERE c.id = :id"),
        @NamedQuery(name = CaseViewCondition.FIND_BY_COMPARISON_CONDITION, query = "SELECT c FROM CaseViewCondition c " +
                "WHERE c.comparisonCondition = :comparisonCondition"),
        @NamedQuery(name = CaseViewCondition.FIND_BY_CASE_VIEW, query = "SELECT c FROM CaseViewCondition  c " +
                "WHERE c.caseView.id=:caseViewId")})
public class CaseViewCondition extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseViewCondition.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_COMPARISON_CONDITION = PREFIX + "findByComparisonCondition";
    public static final String FIND_BY_CASE_VIEW = PREFIX + "findByCaseView";

    public static final String COMPARISON_CONDITION_ALL = "ALL";
    public static final String COMPARISON_CONDITION_ANY = "ANY";

    private static final long serialVersionUID = 1L;

    public enum COMPARISON_CONDITION {
        ALL,
        ANY,
        UNKNOWN
    }

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "comparison_condition")
    private String comparisonCondition;
    @JoinColumn(name = "case_view_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CaseView caseView;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseViewConditionId", orphanRemoval = true)
    private List<CaseViewConditionComparison> caseViewConditionComparisonList;

    public CaseViewCondition() {
    }

    public CaseViewCondition(String comparisonCondition, CaseView caseView) {
        this.comparisonCondition = comparisonCondition;
        this.caseView = caseView;
    }

    public String getComparisonCondition() {
        return comparisonCondition;
    }

    public void setComparisonCondition(String comparisonCondition) {
        this.comparisonCondition = comparisonCondition;
    }

    public COMPARISON_CONDITION getComparisonConditionEnum() {
        if(this.comparisonCondition.equals(COMPARISON_CONDITION_ALL)) return COMPARISON_CONDITION.ALL;
        if(this.comparisonCondition.equals(COMPARISON_CONDITION_ANY)) return COMPARISON_CONDITION.ANY;

        return COMPARISON_CONDITION.UNKNOWN;
    }

    public void setComparisonConditionEnum(COMPARISON_CONDITION comparisonConditionEnum) {
        switch (comparisonConditionEnum) {
            case ALL:
                this.comparisonCondition = COMPARISON_CONDITION_ALL;
                break;
            case ANY:
                this.comparisonCondition = COMPARISON_CONDITION_ANY;
                break;
            default:
                this.comparisonCondition = "UNKNOWN";
                break;
        }
    }

    public CaseView getCaseView() {
        return caseView;
    }

    public void setCaseView(CaseView caseView) {
        this.caseView = caseView;
    }

    @XmlTransient
    public List<CaseViewConditionComparison> getCaseViewConditionComparisonList() {
        return caseViewConditionComparisonList;
    }

    public void setCaseViewConditionComparisonList(List<CaseViewConditionComparison> caseViewConditionComparisonList) {
        this.caseViewConditionComparisonList = caseViewConditionComparisonList;
    }
}
