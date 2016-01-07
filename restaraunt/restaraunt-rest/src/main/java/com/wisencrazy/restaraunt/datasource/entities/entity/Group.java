package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the groups database table.
 *
 */
@Entity
@Table(name="groups")
public class Group extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="group_name")
    private String groupName;

    //bi-directional many-to-one association to CalendarHasPermission
    /*@OneToMany(mappedBy="group")
     private List<CalendarHasPermission> calendarHasPermissions;

     //bi-directional many-to-one association to GroupHasUser
     @OneToMany(mappedBy="group")
     private List<GroupHasUser> groupHasUsers;*/

    public Group() {
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /*public List<CalendarHasPermission> getCalendarHasPermissions() {
         return this.calendarHasPermissions;
     }

     public void setCalendarHasPermissions(List<CalendarHasPermission> calendarHasPermissions) {
         this.calendarHasPermissions = calendarHasPermissions;
     }

     public CalendarHasPermission addCalendarHasPermission(CalendarHasPermission calendarHasPermission) {
         getCalendarHasPermissions().add(calendarHasPermission);
         calendarHasPermission.setGroup(this);

         return calendarHasPermission;
     }

     public CalendarHasPermission removeCalendarHasPermission(CalendarHasPermission calendarHasPermission) {
         getCalendarHasPermissions().remove(calendarHasPermission);
         calendarHasPermission.setGroup(null);

         return calendarHasPermission;
     }

     public List<GroupHasUser> getGroupHasUsers() {
         return this.groupHasUsers;
     }

     public void setGroupHasUsers(List<GroupHasUser> groupHasUsers) {
         this.groupHasUsers = groupHasUsers;
     }

     public GroupHasUser addGroupHasUser(GroupHasUser groupHasUser) {
         getGroupHasUsers().add(groupHasUser);
         groupHasUser.setGroup(this);

         return groupHasUser;
     }

     public GroupHasUser removeGroupHasUser(GroupHasUser groupHasUser) {
         getGroupHasUsers().remove(groupHasUser);
         groupHasUser.setGroup(null);

         return groupHasUser;
     }*/

}