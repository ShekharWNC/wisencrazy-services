package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the consultant_profile database table.
 *
 */
@Entity
@Table(name="consultant_profile")
public class ConsultantProfile extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="consultant_id")
    private String consultantId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_date")
    private Date endDate;

    @Column(name="official_contact_no")
    private String officialContactNo;

    @Column(name="official_email_id")
    private String officialEmailId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_date")
    private Date startDate;

    //bi-directional many-to-one association to VirtualAccount
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="virtual_account_id", referencedColumnName = "id")
    private VirtualAccount virtualAccount;

    public ConsultantProfile() {
    }

    public String getConsultantId() {
        return this.consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOfficialContactNo() {
        return this.officialContactNo;
    }

    public void setOfficialContactNo(String officialContactNo) {
        this.officialContactNo = officialContactNo;
    }

    public String getOfficialEmailId() {
        return this.officialEmailId;
    }

    public void setOfficialEmailId(String officialEmailId) {
        this.officialEmailId = officialEmailId;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public VirtualAccount getVirtualAccount() {
        return this.virtualAccount;
    }

    public void setVirtualAccount(VirtualAccount virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

}