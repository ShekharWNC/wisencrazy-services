package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * User: Hoa Ho
 * Date: 4/16/13
 * Time: 1:31 PM
 */
@Embeddable
public class CaseViewConditionTypeHasComparisonOperatorPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "case_view_condition_type_id")
    private int caseViewConditionTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comparison_operator_id")
    private int comparisonOperatorId;

    public CaseViewConditionTypeHasComparisonOperatorPK() {
    }

    public CaseViewConditionTypeHasComparisonOperatorPK(int caseViewConditionTypeId, int comparisonOperatorId) {
        this.caseViewConditionTypeId = caseViewConditionTypeId;
        this.comparisonOperatorId = comparisonOperatorId;
    }

    public int getCaseViewConditionTypeId() {
        return caseViewConditionTypeId;
    }

    public void setCaseViewConditionTypeId(int caseViewConditionTypeId) {
        this.caseViewConditionTypeId = caseViewConditionTypeId;
    }

    public int getComparisonOperatorId() {
        return comparisonOperatorId;
    }

    public void setComparisonOperatorId(int comparisonOperatorId) {
        this.comparisonOperatorId = comparisonOperatorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) caseViewConditionTypeId;
        hash += (int) comparisonOperatorId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseViewConditionTypeHasComparisonOperatorPK)) {
            return false;
        }
        CaseViewConditionTypeHasComparisonOperatorPK other = (CaseViewConditionTypeHasComparisonOperatorPK) object;
        if (this.caseViewConditionTypeId != other.caseViewConditionTypeId) {
            return false;
        }
        if (this.comparisonOperatorId != other.comparisonOperatorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseViewConditionTypeHasComparisonOperatorPK[ caseViewConditionTypeId=" + caseViewConditionTypeId + ", comparisonOperatorId=" + comparisonOperatorId + " ]";
    }

}
