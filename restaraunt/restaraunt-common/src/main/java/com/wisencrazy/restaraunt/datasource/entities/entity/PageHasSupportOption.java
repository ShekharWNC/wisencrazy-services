package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
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
 * Date: 7/23/13
 * Time: 4:42 PM
 */
@Entity
@Table(name = "page_has_support_option")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = PageHasSupportOption.FIND_ALL, query = "SELECT p FROM PageHasSupportOption p"),
        @NamedQuery(name = PageHasSupportOption.FIND_BY_PAGE_ID, query = "SELECT p FROM PageHasSupportOption p WHERE p.pageHasSupportOptionPK.pageId = :pageId"),
        @NamedQuery(name = PageHasSupportOption.FIND_BY_PAGE_SID, query = "SELECT p FROM PageHasSupportOption p " +
                "LEFT JOIN FETCH p.page LEFT JOIN FETCH p.supportOption " +
                "LEFT JOIN FETCH p.defaultChatRequestForm WHERE hex(p.page.sid) = :sid"),
        @NamedQuery(name = PageHasSupportOption.FIND_BY_SUPPORT_OPTION_ID, query = "SELECT p FROM PageHasSupportOption p WHERE p.pageHasSupportOptionPK.supportOptionId = :supportOptionId"),
        @NamedQuery(name = PageHasSupportOption.FIND_BY_DISPLAY_OPTION, query = "SELECT p FROM PageHasSupportOption p WHERE p.pageHasSupportOptionPK.displayOption = :displayOption")})
public class PageHasSupportOption extends AbsCompositeEntity {
    public static final String PREFIX = "com.callcomm.eserve.persistence.entity.PageHasSupportOption.";
    public static final String FIND_ALL = PREFIX + "findAll";
    public static final String FIND_BY_PAGE_ID = PREFIX + "findByPageId";
    public static final String FIND_BY_PAGE_SID = PREFIX + "findByPageSid";
    public static final String FIND_BY_SUPPORT_OPTION_ID = PREFIX + "findBySupportOptionId";
    public static final String FIND_BY_DISPLAY_OPTION = PREFIX + "findByDisplayOption";

    public static final String DISPLAY_OPTION_ALWAYS = "A";
    public static final String DISPLAY_OPTION_DURING_BUSINESS_HR = "BH";
    public static final String DISPLAY_OPTION_NOT_DURING_BUSINESS_HR = "NBH";

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PageHasSupportOptionPK pageHasSupportOptionPK;
    
    @JoinColumn(name = "default_chat_request_form_id", referencedColumnName = "id")
    @ManyToOne
    private DefaultChatRequestForm defaultChatRequestForm;
    @JoinColumn(name = "support_option_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SupportOption supportOption;
    @JoinColumn(name = "page_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Page page;

    public PageHasSupportOption() {
    }

    public PageHasSupportOption(PageHasSupportOptionPK pageHasSupportOptionPK) {
        this.pageHasSupportOptionPK = pageHasSupportOptionPK;
    }

    public PageHasSupportOption(int pageId, int supportOptionId) {
        this.pageHasSupportOptionPK = new PageHasSupportOptionPK(pageId, supportOptionId);
    }

    public PageHasSupportOptionPK getPageHasSupportOptionPK() {
        return pageHasSupportOptionPK;
    }

    public void setPageHasSupportOptionPK(PageHasSupportOptionPK pageHasSupportOptionPK) {
        this.pageHasSupportOptionPK = pageHasSupportOptionPK;
    }

    public DefaultChatRequestForm getDefaultChatRequestForm() {
        return defaultChatRequestForm;
    }

    public void setDefaultChatRequestForm(DefaultChatRequestForm defaultChatRequestForm) {
        this.defaultChatRequestForm = defaultChatRequestForm;
    }

    public SupportOption getSupportOption() {
        return supportOption;
    }

    public void setSupportOption(SupportOption supportOption) {
        this.supportOption = supportOption;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pageHasSupportOptionPK != null ? pageHasSupportOptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PageHasSupportOption)) {
            return false;
        }
        PageHasSupportOption other = (PageHasSupportOption) object;
        if ((this.pageHasSupportOptionPK == null && other.pageHasSupportOptionPK != null) || (this.pageHasSupportOptionPK != null && !this.pageHasSupportOptionPK.equals(other.pageHasSupportOptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.PageHasSupportOption[ pageHasSupportOptionPK=" + pageHasSupportOptionPK + " ]";
    }
}
