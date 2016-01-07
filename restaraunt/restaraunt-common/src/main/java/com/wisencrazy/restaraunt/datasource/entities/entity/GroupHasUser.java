package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the group_has_users database table.
 *
 */
@Entity
@Table(name="group_has_users")
public class GroupHasUser extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    //bi-directional many-to-one association to Appuser
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private Appuser appuser;

    //bi-directional many-to-one association to Group
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;

    public GroupHasUser() {
    }

    public Appuser getAppuser() {
        return this.appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}