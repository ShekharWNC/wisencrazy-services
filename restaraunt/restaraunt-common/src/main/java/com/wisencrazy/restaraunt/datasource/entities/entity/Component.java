package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the component database table.
 *
 */
@Entity
@Table(name="component")
public class Component extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="component_name")
    private String componentName;

    //bi-directional many-to-one association to AuditLog
    /*@OneToMany(mappedBy="component")
     private List<AuditLog> auditLogs;*/

    public Component() {
    }

    public String getComponentName() {
        return this.componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /*public List<AuditLog> getAuditLogs() {
         return this.auditLogs;
     }

     public void setAuditLogs(List<AuditLog> auditLogs) {
         this.auditLogs = auditLogs;
     }

     public AuditLog addAuditLog(AuditLog auditLog) {
         getAuditLogs().add(auditLog);
         auditLog.setComponent(this);

         return auditLog;
     }

     public AuditLog removeAuditLog(AuditLog auditLog) {
         getAuditLogs().remove(auditLog);
         auditLog.setComponent(null);

         return auditLog;
     }*/

}
