package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 7/8/13
 * Time: 4:23 PM
 */
@Entity
@Table(name = "support_channel")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = SupportChannel.FIND_ALL, query = "SELECT c FROM SupportChannel c"),
        @NamedQuery(name = "SupportChannel.findById", query = "SELECT c FROM SupportChannel c WHERE c.id = :id"),
        @NamedQuery(name = "SupportChannel.findByName", query = "SELECT c FROM SupportChannel c WHERE c.name = :name")})
public class SupportChannel extends AbsBaseEntity{
    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "com.callcomm.eserve.persistence.entity.SupportChannel.findAll";
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supportChannel")
    private List<Ecase> ecaseList;

    public SupportChannel() {
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
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.SupportChannel[ id=" + id + " ]";
    }
}
