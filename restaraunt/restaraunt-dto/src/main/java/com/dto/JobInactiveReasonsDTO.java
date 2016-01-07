/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Transfer Object for Job with Inactive Reasons
 * @author ag
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobInactiveReasonsDTO extends AbsCommonDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private JobDTO job;
    
    private String inactiveDecription;
    
    private Date inactiveOn;
    
    public JobDTO getJob() {
        return job;
    }

    public void setJob(JobDTO job) {
        this.job = job;
    }

    public String getInactiveDecription() {
        return inactiveDecription;
    }

    public void setInactiveDecription(String inactiveDecription) {
        this.inactiveDecription = inactiveDecription;
    }

    public Date getInactiveOn() {
        return inactiveOn;
    }

    public void setInactiveOn(Date inactiveOn) {
        this.inactiveOn = inactiveOn;
    }
    
    @Override
    public int hashCode() {
    	Integer i=(Integer)id;
        int hash = 0;
        hash += (i != null ? i.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    	
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobInactiveReasonsDTO)) {
            return false;
        }
        JobInactiveReasonsDTO other = (JobInactiveReasonsDTO) object;
        Integer id=(Integer)this.id;
        Integer oid=(Integer)this.id;
        if ((id == null && oid != null) || (id != null && !id.equals(oid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eServe.marketPlace.infrastructure.repository.entities.JobInactiveReasons[ id=" + id + " ]";
    }
    
}
