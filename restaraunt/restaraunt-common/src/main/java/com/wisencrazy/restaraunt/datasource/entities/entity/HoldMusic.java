package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the hold_music database table.
 *
 */
@Entity
@Table(name="hold_music")
public class HoldMusic extends AbsBaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name="account_id")
    private int accountId;

    @Column(name="file_path")
    private String filePath;

    private String name;

    //bi-directional many-to-many association to Project
    @ManyToMany
    @JoinTable(
            name="project_has_hold_music"
            , joinColumns={
            @JoinColumn(name="hold_music_id")
    }
            , inverseJoinColumns={
            @JoinColumn(name="project_id")
    }
    )
    private List<Project> projects;

    public HoldMusic() {
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

}