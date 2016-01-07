package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * Time: 4:32 PM
 */

@Entity
@Table(name = "website")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = Website.FIND_ALL, query = "SELECT w FROM Website w"),
        @NamedQuery(name = Website.FIND_BY_ID, query = "SELECT w FROM Website w WHERE w.id = :id"),
        @NamedQuery(name = Website.FIND_BY_NAME, query = "SELECT w FROM Website w WHERE w.name = :name"),
        @NamedQuery(name = Website.FIND_BY_AUTH_KEY, query = "SELECT w FROM Website w WHERE w.authKey = :authKey"),
        @NamedQuery(name = Website.FIND_BY_URL, query = "SELECT w FROM Website w WHERE w.url = :url")})
public class Website extends AbsBaseEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.Website.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_NAME = PREFIX + "findByName";
    public static final String FIND_BY_AUTH_KEY = PREFIX + "findByAuthKey";
    public static final String FIND_BY_URL = PREFIX + "findByAuthUrl";

    private static final long serialVersionUID = 1L;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "auth_key")
    private String authKey;
    @Size(max = 255)
    @Column(name = "url")
    private String url;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "website")
    private List<Page> pageList;
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Project project;

    public Website() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
