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
 * Date: 3/5/13
 * Time: 3:26 PM
 */
@Entity
@Table(name = "case_status")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CaseStatus.FIND_ALL, query = "SELECT c FROM CaseStatus c"),
        @NamedQuery(name = CaseStatus.FIND_BY_ID, query = "SELECT c FROM CaseStatus c WHERE c.id = :id"),
        @NamedQuery(name = CaseStatus.FIND_BY_NAME, query = "SELECT c FROM CaseStatus c WHERE c.name = :name")})
public class CaseStatus extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CaseStatus.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseStatus")
    private List<Ecase> ecaseList;

    public CaseStatus() {
    }

    public CaseStatus(Integer id) {
        this.id = id;
    }

    public CaseStatus(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<Ecase> getEcaseList() {
        return ecaseList;
    }

    public void setEcaseList(List<Ecase> ecaseList) {
        this.ecaseList = ecaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseStatus)) {
            return false;
        }
        CaseStatus other = (CaseStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseStatus[ id=" + id + " ]";
    }

}
