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
 * Date: 4/10/13
 * Time: 5:21 PM
 */
@Entity
@Table(name = "custom_field_type")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = CustomFieldType.FIND_ALL, query = "SELECT c FROM CustomFieldType c"),
        @NamedQuery(name = CustomFieldType.FIND_BY_ID, query = "SELECT c FROM CustomFieldType c WHERE c.id = :id"),
        @NamedQuery(name = CustomFieldType.FIND_BY_NAME, query = "SELECT c FROM CustomFieldType c WHERE c.name = :name")})
public class CustomFieldType extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CustomFieldType.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caseFieldType")
    private List<CaseField> caseFieldList;

    public CustomFieldType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<CaseField> getCaseFieldList() {
        return caseFieldList;
    }

    public void setCaseFieldList(List<CaseField> caseFieldList) {
        this.caseFieldList = caseFieldList;
    }
}

