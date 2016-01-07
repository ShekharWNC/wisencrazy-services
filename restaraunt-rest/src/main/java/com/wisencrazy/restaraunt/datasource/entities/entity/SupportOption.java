package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 7/23/13
 * Time: 4:38 PM
 */
@Entity
@Table(name = "support_option")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = SupportOption.FIND_ALL, query = "SELECT s FROM SupportOption s"),
        @NamedQuery(name = SupportOption.FIND_BY_ID, query = "SELECT s FROM SupportOption s WHERE s.id = :id"),
        @NamedQuery(name = SupportOption.FIND_BY_NAME, query = "SELECT s FROM SupportOption s WHERE s.name = :name")})
public class SupportOption implements Serializable {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.SupportOption.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_ID = PREFIX + "findById";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supportOption")
    private List<PageHasSupportOption> pageHasSupportOptionList;

    public SupportOption() {
    }

    public SupportOption(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<PageHasSupportOption> getPageHasSupportOptionList() {
        return pageHasSupportOptionList;
    }

    public void setPageHasSupportOptionList(List<PageHasSupportOption> pageHasSupportOptionList) {
        this.pageHasSupportOptionList = pageHasSupportOptionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SupportOption)) {
            return false;
        }
        SupportOption other = (SupportOption) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.SupportOption[ id=" + id + " ]";
    }
}
