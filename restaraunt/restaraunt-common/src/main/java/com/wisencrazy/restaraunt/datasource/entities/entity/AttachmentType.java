package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the attachment_type database table.
 *
 */
@Entity
@Table(name="attachment_type")
public class AttachmentType extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="attachment_type")
    private String attachmentType;

    //bi-directional many-to-one association to Attachment
    /*@OneToMany(mappedBy="attachmentType")
     private List<Attachment> attachments;*/

    public AttachmentType() {
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /*public List<Attachment> getAttachments() {
         return this.attachments;
     }

     public void setAttachments(List<Attachment> attachments) {
         this.attachments = attachments;
     }

     public Attachment addAttachment(Attachment attachment) {
         getAttachments().add(attachment);
         attachment.setAttachmentType(this);

         return attachment;
     }

     public Attachment removeAttachment(Attachment attachment) {
         getAttachments().remove(attachment);
         attachment.setAttachmentType(null);

         return attachment;
     }*/

}