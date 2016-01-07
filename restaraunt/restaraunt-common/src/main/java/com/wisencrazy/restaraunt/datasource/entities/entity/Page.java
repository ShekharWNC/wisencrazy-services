package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * User: Hoa Ho
 * Date: 7/23/13
 * Time: 4:36 PM
 */
@Entity
@Table(name = "page")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Page.FIND_ALL, query = "SELECT p FROM Page p"),
        @NamedQuery(name = Page.FIND_BY_ID, query = "SELECT p FROM Page p WHERE p.id = :id"),
        @NamedQuery(name = Page.FIND_BY_SID, query = "SELECT p FROM Page p WHERE hex(p.sid) = :sid"),
        @NamedQuery(name = Page.FIND_WEBSITES_BY_PROJECT_SID, query = "SELECT p.website from Page p where hex(p.website.project.sid) = :sid")})
public class Page extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Page.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_SID = PREFIX + "findBySid";
    public static final String FIND_WEBSITES_BY_PROJECT_SID = PREFIX + "findWebsitesByProjectSid";

    private static final long serialVersionUID = 1L;
    @JoinColumn(name = "website_id", referencedColumnName = "id")
    @ManyToOne(optional = false,fetch=FetchType.LAZY)
    private Website website;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "page")
    private List<PageHasSupportOption> pageHasSupportOptionList;

    public Page() {
    }


    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    @XmlTransient
    public List<PageHasSupportOption> getPageHasSupportOptionList() {
        return pageHasSupportOptionList;
    }

    public void setPageHasSupportOptionList(List<PageHasSupportOption> pageHasSupportOptionList) {
        this.pageHasSupportOptionList = pageHasSupportOptionList;
    }
}
