package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "vw_page_details")
@NamedQueries({
 @NamedQuery(name = PageDetailsView.FIND_BY_AUTH_KEY, query = "select p from PageDetailsView p where hex(p.projectSid)=:projectSid and p.authKey = :authKey")
})
public class PageDetailsView extends AbsBaseEntity {

	private static final String PREFIX = "com.callcomm.eserve.persistence.entity.PageDetailsView.";
	public static final String FIND_BY_AUTH_KEY = PREFIX + "findByAuthKey";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String url;
	
	private String name;

	@Column(name = "auth_key")
	private String authKey;
	
	@Column(name = "project_sid")
	private byte[] projectSid;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public byte[] getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}
}
