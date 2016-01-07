package com.wisencrazy.restaraunt.datasource.entities.entity;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class UserInfo extends AbsBaseEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="email_id")
	private String emailId;
	@Column(name="name")
	private String displayName;
	@Column(name="title")
	private String title;
	@Column(name="primary_contact")
	private String phone;
	@Column(name="member_since")
	private Timestamp memberSince;
	@Column(name="file_path")
	private String photoUrl;
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public Timestamp getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(Timestamp memberSince) {
		this.memberSince = memberSince;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String populateSid(){
		return bytesToHexStringBySid(sid);
	}
	@Override
	public int hashCode() {
	    int hash = 0;
	    hash += (id != null ? id.hashCode() : 0);
	    return hash;
	}

	@Override
	public boolean equals(Object object) {
	    if (!(object instanceof UserInfo)) {
	        return false;
	    }
	    UserInfo other = (UserInfo) object;
	    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	        return false;
	    }
	    return true;
	}
	@Override
	public String toString() {
	    return "com.callcomm.eserve.persistence.entity.UserInfo[ id=" + id + " ]";
	}
    
}

