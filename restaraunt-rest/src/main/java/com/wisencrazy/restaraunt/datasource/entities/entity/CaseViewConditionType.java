package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * Time: 1:27 PM
 */
@Entity
@Table(name = "case_view_condition_type")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseViewConditionType.FIND_ALL, query = "SELECT c FROM CaseViewConditionType c"),
        @NamedQuery(name = CaseViewConditionType.FIND_BY_ID, query = "SELECT c FROM CaseViewConditionType c WHERE c.id = :id"),
        @NamedQuery(name = CaseViewConditionType.FIND_BY_NAME, query = "SELECT c FROM CaseViewConditionType c WHERE c.name = :name")})
public class CaseViewConditionType extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseViewConditionType.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseViewConditionType")
    private List<CaseViewConditionTypeHasComparisonOperator> caseViewConditionTypeHasComparisonOperatorList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<CaseViewConditionTypeHasComparisonOperator> getCaseViewConditionTypeHasComparisonOperatorList() {
        return caseViewConditionTypeHasComparisonOperatorList;
    }

    public void setCaseViewConditionTypeHasComparisonOperatorList(List<CaseViewConditionTypeHasComparisonOperator> caseViewConditionTypeHasComparisonOperatorList) {
        this.caseViewConditionTypeHasComparisonOperatorList = caseViewConditionTypeHasComparisonOperatorList;
    }
}

