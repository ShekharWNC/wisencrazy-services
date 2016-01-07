/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author ag
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ProposalWithdrawnReasonDTO extends AbsCommonDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private ProposalDTO proposal;
   
    private String withdrawReasons;
    
    private Date withdrawnOn;
    

    public ProposalDTO getProposal() {
        return proposal;
    }

    public void setProposal(ProposalDTO proposal) {
        this.proposal = proposal;
    }

    public String getWithdrawReasons() {
        return withdrawReasons;
    }

    public void setWithdrawReasons(String withdrawReasons) {
        this.withdrawReasons = withdrawReasons;
    }

    public Date getWithdrawnOn() {
        return withdrawnOn;
    }

    public void setWithdrawnOn(Date withdrawnOn) {
        this.withdrawnOn = withdrawnOn;
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
        if (!(object instanceof ProposalWithdrawnReasonDTO)) {
            return false;
        }
        ProposalWithdrawnReasonDTO other = (ProposalWithdrawnReasonDTO) object;
        Integer id=(Integer)this.id;
        Integer oid=(Integer)other.id;
        if ((id== null && oid != null) || (id != null && !id.equals(oid))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "ProposalWithdrawnReasonDTO [proposal=" + proposal
				+ ", withdrawReasons=" + withdrawReasons + ", withdrawnOn="
				+ withdrawnOn + "]";
	}

    
}
