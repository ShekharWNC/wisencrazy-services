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
 * Date: 4/12/13
 * Time: 2:04 PM
 */
@Entity
@Table(name = "case_field_option")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseFieldOption.FIND_ALL, query = "SELECT c FROM CaseFieldOption c"),
        @NamedQuery(name = CaseFieldOption.FIND_BY_ID, query = "SELECT c FROM CaseFieldOption c WHERE c.id = :id"),
        @NamedQuery(name = CaseFieldOption.FIND_BY_TITLE, query = "SELECT c FROM CaseFieldOption c WHERE c.title = :title"),
        @NamedQuery(name = CaseFieldOption.FIND_BY_TAG, query = "SELECT c FROM CaseFieldOption c WHERE c.tag = :tag"),
        @NamedQuery(name = CaseFieldOption.FIND_BY_CASE_FIELD_ID, query = "SELECT c FROM CaseFieldOption c WHERE c.caseFieldId.id = :caseFieldId")})
public class CaseFieldOption extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseFieldOption.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_TITLE = PREFIX + "findByTitle";
    public static final String FIND_BY_TAG = PREFIX + "findByTag";
    public static final String FIND_BY_CASE_FIELD_ID = PREFIX + "findByCaseFieldId";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tag")
    private String tag;
    @JoinColumn(name = "case_field_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CaseField caseFieldId;

    public CaseFieldOption() {
    }

    public CaseFieldOption(Integer id) {
        this.id = id;
    }

    public CaseFieldOption(Integer id, String title, String tag) {
        this.id = id;
        this.title = title;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CaseField getCaseFieldId() {
        return caseFieldId;
    }

    public void setCaseFieldId(CaseField caseFieldId) {
        this.caseFieldId = caseFieldId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseFieldOption)) {
            return false;
        }
        CaseFieldOption other = (CaseFieldOption) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseFieldOption[ id=" + id + " ]";
    }

}

