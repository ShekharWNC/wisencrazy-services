package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 4/16/13
 * Time: 1:25 PM
 */
@Entity
@Table(name = "case_view_condition_type_has_comparison_operator")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseViewConditionTypeHasComparisonOperator.FIND_ALL, query = "SELECT c FROM CaseViewConditionTypeHasComparisonOperator c"),
        @NamedQuery(name = CaseViewConditionTypeHasComparisonOperator.FIND_BY_CASE_VIEW_CONDITION_TYPE, query = "SELECT c FROM CaseViewConditionTypeHasComparisonOperator c WHERE c.caseViewConditionTypeHasComparisonOperatorPK.caseViewConditionTypeId = :caseViewConditionTypeId"),
        @NamedQuery(name = CaseViewConditionTypeHasComparisonOperator.FIND_BY_COMPARISON_OPERATOR, query = "SELECT c FROM CaseViewConditionTypeHasComparisonOperator c WHERE c.caseViewConditionTypeHasComparisonOperatorPK.comparisonOperatorId = :comparisonOperatorId")})
public class CaseViewConditionTypeHasComparisonOperator extends AbsCompositeEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseViewConditionTypeHasComparisonOperator.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_CASE_VIEW_CONDITION_TYPE = PREFIX + "findByCaseViewConditionType";
    public static final String FIND_BY_COMPARISON_OPERATOR = PREFIX + "findByComparisonOperator";

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CaseViewConditionTypeHasComparisonOperatorPK caseViewConditionTypeHasComparisonOperatorPK;
    @JoinColumn(name = "comparison_operator_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ComparisonOperator comparisonOperator;
    @JoinColumn(name = "case_view_condition_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CaseViewConditionType caseViewConditionType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseViewConditionTypeHasComparisonOperator", fetch = FetchType.LAZY)
    private List<CaseViewConditionComparison> caseViewConditionComparisonList;

    public CaseViewConditionTypeHasComparisonOperator() {
    }

    public CaseViewConditionTypeHasComparisonOperator(CaseViewConditionTypeHasComparisonOperatorPK caseViewConditionTypeHasComparisonOperatorPK) {
        this.caseViewConditionTypeHasComparisonOperatorPK = caseViewConditionTypeHasComparisonOperatorPK;
    }

    public CaseViewConditionTypeHasComparisonOperator(int caseViewConditionTypeId, int comparisonOperatorId) {
        this.caseViewConditionTypeHasComparisonOperatorPK = new CaseViewConditionTypeHasComparisonOperatorPK(caseViewConditionTypeId, comparisonOperatorId);
    }

    public CaseViewConditionTypeHasComparisonOperatorPK getCaseViewConditionTypeHasComparisonOperatorPK() {
        return caseViewConditionTypeHasComparisonOperatorPK;
    }

    public void setCaseViewConditionTypeHasComparisonOperatorPK(CaseViewConditionTypeHasComparisonOperatorPK caseViewConditionTypeHasComparisonOperatorPK) {
        this.caseViewConditionTypeHasComparisonOperatorPK = caseViewConditionTypeHasComparisonOperatorPK;
    }

    public ComparisonOperator getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public CaseViewConditionType getCaseViewConditionType() {
        return caseViewConditionType;
    }

    public void setCaseViewConditionType(CaseViewConditionType caseViewConditionType) {
        this.caseViewConditionType = caseViewConditionType;
    }

    @XmlTransient
    public List<CaseViewConditionComparison> getCaseViewConditionComparisonList() {
        return caseViewConditionComparisonList;
    }

    public void setCaseViewConditionComparisonList(List<CaseViewConditionComparison> caseViewConditionComparisonList) {
        this.caseViewConditionComparisonList = caseViewConditionComparisonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caseViewConditionTypeHasComparisonOperatorPK != null ? caseViewConditionTypeHasComparisonOperatorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseViewConditionTypeHasComparisonOperator)) {
            return false;
        }
        CaseViewConditionTypeHasComparisonOperator other = (CaseViewConditionTypeHasComparisonOperator) object;
        if ((this.caseViewConditionTypeHasComparisonOperatorPK == null && other.caseViewConditionTypeHasComparisonOperatorPK != null) || (this.caseViewConditionTypeHasComparisonOperatorPK != null && !this.caseViewConditionTypeHasComparisonOperatorPK.equals(other.caseViewConditionTypeHasComparisonOperatorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseViewConditionTypeHasComparisonOperator[ caseViewConditionTypeHasComparisonOperatorPK=" + caseViewConditionTypeHasComparisonOperatorPK + " ]";
    }

}
