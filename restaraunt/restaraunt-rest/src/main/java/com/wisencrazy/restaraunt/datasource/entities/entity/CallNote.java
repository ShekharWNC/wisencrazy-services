package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the call_note database table.
 *
 */
@Entity
@Table(name="call_note")
public class CallNote extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    private String note;

    //bi-directional many-to-one association to Appuser
    @ManyToOne
    @JoinColumn(name="creator_user_id")
    private Appuser appuser;

    //bi-directional many-to-one association to CallLog
    @ManyToOne
    @JoinColumn(name="call_log_id")
    private CallLog callLog;

    public CallNote() {
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Appuser getAppuser() {
        return this.appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

    public CallLog getCallLog() {
        return this.callLog;
    }

    public void setCallLog(CallLog callLog) {
        this.callLog = callLog;
    }

}