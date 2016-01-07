package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the action_tag database table.
 *
 */
@Entity
@Table(name="action_tag")
public class ActionTag extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="action_tag")
    private String actionTag;

    //bi-directional many-to-one association to AuditLog
    /*@OneToMany(mappedBy="actionTag")
     private List<AuditLog> auditLogs;*/

    public ActionTag() {
    }

    public String getActionTag() {
        return this.actionTag;
    }

    public void setActionTag(String actionTag) {
        this.actionTag = actionTag;
    }

    /*public List<AuditLog> getAuditLogs() {
         return this.auditLogs;
     }

     public void setAuditLogs(List<AuditLog> auditLogs) {
         this.auditLogs = auditLogs;
     }

     public AuditLog addAuditLog(AuditLog auditLog) {
         getAuditLogs().add(auditLog);
         auditLog.setActionTag(this);

         return auditLog;
     }

     public AuditLog removeAuditLog(AuditLog auditLog) {
         getAuditLogs().remove(auditLog);
         auditLog.setActionTag(null);

         return auditLog;
     }*/

}
