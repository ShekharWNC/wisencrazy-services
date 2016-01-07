package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// TODO: Auto-generated Javadoc

/**
 * The Class CompanyByGroup.
 */
@Entity
@Table(name="vw_company_by_group")
public class CompanyByGroup extends AbsCompositeEntity implements Serializable{
        
        /** The Constant serialVersionUID. */
private static final long serialVersionUID = -1391607175130444390L;

/** The group id. */
        @Id
        @Column(name="id")
        private Integer groupId;
        
        /** The group name. */
        @Column(name="name")
        private String groupName;
        
        /** The company id. */
        @Column(name="company_id")
        private String companyId;
        
        /** The total members. */
        @Column(name="total_count")
        private String totalMembers;
        
        /** The company sid. */
        @Column(name="company_sid")
        private byte[] companySid;
        public int getGroupId() {
			return groupId;
		}



		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}



		public String getGroupName() {
			return groupName;
		}



		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}



		public String getCompanyId() {
			return companyId;
		}



		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}



		public String getTotalMembers() {
			return totalMembers;
		}



		public void setTotalMembers(String totalMembers) {
			this.totalMembers = totalMembers;
		}



		public byte[] getCompanySid() {
			return companySid;
		}



		public void setCompanySid(byte[] companySid) {
			this.companySid = companySid;
		}



		public String populateCompanySid(){
        	return bytesToHexStringBySid(companySid);
        }
	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (groupId != null ? groupId.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        if (!(object instanceof CompanyByGroup)) {
	            return false;
	        }
	        CompanyByGroup other = (CompanyByGroup) object;
	        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "com.callcomm.eserve.persistence.entity.CompanyByGroup[ groupId=" + groupId + " ]";
	    }
}

