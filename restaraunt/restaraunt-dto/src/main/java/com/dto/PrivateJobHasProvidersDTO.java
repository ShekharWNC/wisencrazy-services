/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author ag
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class PrivateJobHasProvidersDTO extends AbsCommonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private JobDTO job;
    
    private ProviderProfileDTO provider;

    public JobDTO getJob() {
        return job;
    }

    public void setJob(JobDTO job) {
        this.job = job;
    }

    public ProviderProfileDTO getProvider() {
        return provider;
    }

    public void setProvider(ProviderProfileDTO provider) {
        this.provider = provider;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        Integer iid=(Integer)id;
        hash += (iid != null ? iid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrivateJobHasProvidersDTO)) {
            return false;
        }
        PrivateJobHasProvidersDTO other = (PrivateJobHasProvidersDTO) object;
        Integer id=(Integer)this.id;
        Integer oid=(Integer)other.id;
        if ((id == null && oid != null) || (id != null && !id.equals(oid))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "PrivateJobHasProvidersDTO [job=" + job + ", provider="
				+ provider + "]";
	}

    
}
