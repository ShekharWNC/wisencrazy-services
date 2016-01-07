package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the calendar_has_permissions database table.
 *
 */
@Entity
@Table(name="calendar_has_permissions")
public class CalendarHasPermission extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String permissions;

    //bi-directional many-to-one association to Appuser
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private Appuser appuser;

    //bi-directional many-to-one association to Calendar
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "calendar_id", referencedColumnName = "id")
    private Calendar calendar;

    //bi-directional many-to-one association to Group
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;

    public CalendarHasPermission() {
    }

    public String getPermissions() {
        return this.permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Appuser getAppuser() {
        return this.appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}