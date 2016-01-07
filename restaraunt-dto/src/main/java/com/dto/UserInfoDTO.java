package com.dto;
import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserInfoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8933558468462446984L;
	private String sid;
	private String emailId;
	private String displayName;
	private String phone;
	private String photoUrl;
	private String href;
	private String userType;
	public UserInfoDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	/*public byte[] hexStringToBytes(String sid) {
	    int len = sid.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(sid.charAt(i), 16) << 4)
	                             + Character.digit(sid.charAt(i+1), 16));
	    }
	    return data;
	}*/
}



