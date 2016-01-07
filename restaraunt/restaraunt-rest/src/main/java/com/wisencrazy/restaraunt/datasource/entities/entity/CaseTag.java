package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * Date: 5/14/13
 * Time: 5:06 PM
 */
@Entity
@Table(name = "case_tag")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "CaseTag.findAll", query = "SELECT c FROM CaseTag c"),
        @NamedQuery(name = "CaseTag.findById", query = "SELECT c FROM CaseTag c WHERE c.id = :id"),
        @NamedQuery(name = "CaseTag.findByTag", query = "SELECT c FROM CaseTag c WHERE c.tag = :tag")})
public class CaseTag extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tag")
    private String tag;
   
    @JoinColumn(name = "case_id",referencedColumnName="id")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Ecase ecase;
   
    public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	public Ecase getEcase() {
		return ecase;
	}

	public void setEcase(Ecase ecase) {
		this.ecase = ecase;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CaseTag)) {
            return false;
        }
        CaseTag other = (CaseTag) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CaseTag[ id=" + id + " ]";
    }

}
