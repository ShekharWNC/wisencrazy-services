package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_user")
public class CompanyUser extends AbsCompositeEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8911718977543365227L;
	@Id
	@Column(name="id")
	private String id;
  
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="virtual_id")
	private Integer virtualId;
	
	@Column(name="skill_id")
	private Integer skillId;
	@Column(name="skill_name")
	private String skillName;
	@Column(name="company_id")
	private Integer companyId;
	
	@Column(name="company_sid")
	private byte[] companySid;
	
	@Column(name="company_role")
	private String companyRole;
		
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_sid")
	private byte[] departmentSid;
		
	@Column(name="account_status")
	private String accountStatus;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="skills_rating_level")
	private Integer skillRatingLevel;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getSkillRatingLevel() {
		return skillRatingLevel;
	}
	public void setSkillRatingLevel(Integer skillRatingLevel) {
		this.skillRatingLevel = skillRatingLevel;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getVirtualId() {
		return virtualId;
	}
	public void setVirtualId(Integer virtualId) {
		this.virtualId = virtualId;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public byte[] getCompanySid() {
		return companySid;
	}
	public void setCompanySid(byte[] companySid) {
		this.companySid = companySid;
	}
	public String getCompanyRole() {
		return companyRole;
	}
	public void setCompanyRole(String companyRole) {
		this.companyRole = companyRole;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public byte[] getDepartmentSid() {
		return departmentSid;
	}
	public void setDepartmentSid(byte[] departmentSid) {
		this.departmentSid = departmentSid;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
    
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String populateCompanySid(){
    	return bytesToHexStringBySid(companySid);
    }
	public String populateDepartmentSid(){
    	return bytesToHexStringBySid(departmentSid);
    }
  @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompanyUser)) {
            return false;
        }
        CompanyUser other = (CompanyUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "com.callcomm.eserve.persistence.entity.CompanyUser[ id=" + id + " ]";
    }

}
