package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * The persistent class for the client_has_profile database table.
 *
 */
@Entity
@Table(name="client_has_profile")
public class ClientHasProfile implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_id")
    private int userId;

    private byte status;

    //bi-directional one-to-one association to Appuser
    @OneToOne
    @PrimaryKeyJoinColumn
    private Appuser appuser;

    public ClientHasProfile() {
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte getStatus() {
        return this.status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Appuser getAppuser() {
        return this.appuser;
    }

    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }

}