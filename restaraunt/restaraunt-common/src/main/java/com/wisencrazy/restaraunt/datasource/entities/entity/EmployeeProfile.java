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
 * The persistent class for the employee_profile database table.
 *
 */
@Entity
@Table(name="employee_profile")
public class EmployeeProfile extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String email;

    @Column(name="employee_id")
    private String employeeId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_date")
    private Date endDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_date")
    private Date startDate;

    private byte status;

    //bi-directional many-to-one association to VirtualAccount
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="virtual_account_id", referencedColumnName = "id")
    private VirtualAccount virtualAccount;

    public EmployeeProfile() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public byte getStatus() {
        return this.status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public VirtualAccount getVirtualAccount() {
        return this.virtualAccount;
    }

    public void setVirtualAccount(VirtualAccount virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

}