package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the events_has_attachments database table.
 *
 */
@Entity
@Table(name="events_has_attachments")
public class EventsHasAttachment extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="attachement_name")
    private String attachementName;

    @Column(name="attachment_path")
    private String attachmentPath;

    //bi-directional many-to-one association to Event
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="events_id", referencedColumnName = "id")
    private Event event;

    public EventsHasAttachment() {
    }

    public String getAttachementName() {
        return this.attachementName;
    }

    public void setAttachementName(String attachementName) {
        this.attachementName = attachementName;
    }

    public String getAttachmentPath() {
        return this.attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public Event getEvent() {
        return this.event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}