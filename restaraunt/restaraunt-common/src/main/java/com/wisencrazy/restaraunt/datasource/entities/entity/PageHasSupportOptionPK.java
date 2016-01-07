package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User: Hoa Ho
 * Date: 7/23/13
 * Time: 4:40 PM
 */
@Embeddable
public class PageHasSupportOptionPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "page_id")
    private int pageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "support_option_id")
    private int supportOptionId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "display_option")
    private String displayOption;

    public PageHasSupportOptionPK() {
    }

    public PageHasSupportOptionPK(int pageId, int supportOptionId) {
        this.pageId = pageId;
        this.supportOptionId = supportOptionId;
    }

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getSupportOptionId() {
        return supportOptionId;
    }

    public void setSupportOptionId(int supportOptionId) {
        this.supportOptionId = supportOptionId;
    }
    

    public String getDisplayOption() {
		return displayOption;
	}

	public void setDisplayOption(String displayOption) {
		this.displayOption = displayOption;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pageId;
        hash += (int) supportOptionId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PageHasSupportOptionPK)) {
            return false;
        }
        PageHasSupportOptionPK other = (PageHasSupportOptionPK) object;
        if (this.pageId != other.pageId) {
            return false;
        }
        if (this.supportOptionId != other.supportOptionId) {
            return false;
        }
        
        if(!this.displayOption.equals(other.displayOption)){
        	return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.PageHasSupportOptionPK[ pageId=" + pageId + ", supportOptionId=" + supportOptionId + " ]";
    }
}
