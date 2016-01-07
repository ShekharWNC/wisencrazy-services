package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Hoa Ho
 * Date: 4/16/13
 * Time: 1:33 PM
 */
@Entity
@Table(name = "case_view_tbl_column")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseViewTblColumn.FIND_ALL, query = "SELECT c FROM CaseViewTblColumn c"),
        @NamedQuery(name = CaseViewTblColumn.FIND_BY_ORDER, query = "SELECT c FROM CaseViewTblColumn c WHERE c.order = :columnOrder"),
        @NamedQuery(name = CaseViewTblColumn.FIND_BY_VIEW_ID, query = "SELECT c FROM CaseViewTblColumn c WHERE c.caseView.id = :caseViewId"),
        @NamedQuery(name = CaseViewTblColumn.FIND_BY_ORDER_N_VIEW_ID, query = "SELECT c FROM CaseViewTblColumn c WHERE c.order = :columnOrder AND c.caseView.id = :caseViewId")})
public class CaseViewTblColumn extends AbsBaseEntity implements Comparable<CaseViewTblColumn> {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseViewTblColumn.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ORDER = PREFIX + "findByOrder";
    public static final String FIND_BY_VIEW_ID = PREFIX + "findByCaseViewId";
    public static final String FIND_BY_ORDER_N_VIEW_ID = PREFIX + "findByOrderNCaseViewId";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order1")
    private short order;
    @JoinColumn(name = "case_view_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CaseView caseView;
    @JoinColumn(name = "case_field_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CaseField caseField;
    
    @Column(name = "is_parent")
    private Boolean isParent;
    
    @JoinColumn(name = "parent", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CaseViewTblColumn> caseViewTblColumns;

    public CaseViewTblColumn() {
    }

    public short getOrder() {
        return order;
    }

    public void setOrder(short order) {
        this.order = order;
    }

    public CaseView getCaseView() {
        return caseView;
    }

    public void setCaseView(CaseView caseView) {
        this.caseView = caseView;
    }

    public CaseField getCaseField() {
        return caseField;
    }

    public void setCaseField(CaseField caseField) {
        this.caseField = caseField;
    }
    
    public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public List<CaseViewTblColumn> getCaseViewTblColumns() {
		return caseViewTblColumns;
	}

	public void setCaseViewTblColumns(List<CaseViewTblColumn> caseViewTblColumns) {
		this.caseViewTblColumns = caseViewTblColumns;
	}

	@Override
    public int compareTo(CaseViewTblColumn o) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if(this == o) return EQUAL;
        if(this.caseView.getId() != o.caseView.getId()) return this.caseView.getId().compareTo(o.caseView.getId());

        if(this.order == o.order) return EQUAL;
        if(this.order < o.order) return BEFORE;
        if(this.order > o.order) return BEFORE;

        return EQUAL;
    }
}

