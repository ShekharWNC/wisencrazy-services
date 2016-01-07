package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Basic;
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
 * Date: 7/23/13
 * Time: 4:47 PM
 */
@Entity
@Table(name = "default_chat_request_form")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = DefaultChatRequestForm.FIND_ALL, query = "SELECT d FROM DefaultChatRequestForm d"),
        @NamedQuery(name = DefaultChatRequestForm.FIND_BY_ID, query = "SELECT d FROM DefaultChatRequestForm d WHERE d.id = :id"),
        @NamedQuery(name = DefaultChatRequestForm.FIND_BY_URL, query = "SELECT d FROM DefaultChatRequestForm d WHERE d.url = :url"),
        @NamedQuery(name = DefaultChatRequestForm.FIND_BY_NAME, query = "SELECT d FROM DefaultChatRequestForm d WHERE d.name = :name")})
public class DefaultChatRequestForm extends AbsBaseEntity{
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.DefaultChatRequestForm.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_ID = PREFIX + "findById";
    public static final String FIND_BY_URL = PREFIX + "findByUrl";
    public static final String FIND_BY_NAME = PREFIX + "findByName";

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "url")
    private String url;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "defaultChatRequestForm")
    private List<PageHasSupportOption> pageHasSupportOptionList;

    public DefaultChatRequestForm() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
