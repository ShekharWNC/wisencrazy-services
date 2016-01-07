package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * UserTO: Hoa Ho
 * Date: 2/20/13
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "user_group")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = UserGroup.FIND_ALL, query = "SELECT u FROM UserGroup u"),
        @NamedQuery(name = UserGroup.FIND_BY_ID, query = "SELECT u FROM UserGroup u WHERE u.id = :id"),
        @NamedQuery(name = UserGroup.FIND_BY_NAME, query = "SELECT u FROM UserGroup u WHERE u.name = :name"),
        @NamedQuery(name = UserGroup.FIND_BY_NAME_COMPANY, query = "from UserGroup cr where cr.name = :name and hex(cr.companyId.sid) = :sid")})
public class UserGroup extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.UserGroup.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_NAME_COMPANY = PREFIX + "findByNameCompany";
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @JoinTable(name = "user_group_has_virtual_account", joinColumns = {
            @JoinColumn(name = "user_group_id", referencedColumnName = "id")}, inverseJoinColumns = {
            @JoinColumn(name = "virtual_account_id", referencedColumnName = "id")})
    @ManyToMany
    private List<VirtualAccount> virtualAccountList;
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Company companyId;

    public UserGroup() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<VirtualAccount> getVirtualAccountList() {
        return virtualAccountList;
    }

    public void setVirtualAccountList(List<VirtualAccount> virtualAccountList) {
        this.virtualAccountList = virtualAccountList;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }
}
