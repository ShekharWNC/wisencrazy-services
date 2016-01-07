package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * @author vikash
 */
@Table(name = "vw_category_search")
@Entity
@NamedQueries({
    @NamedQuery(name = CategorySearch.FIND_BY_COMPANYID, query = "FROM CategorySearch c where c.companyId=:companyId")
})
public class CategorySearch extends AbsCompositeEntity {
	private static final long serialVersionUID = -963252102116911699L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.CategorySearch.";
	public static final String FIND_BY_COMPANYID = PREFIX + "findByCompanyId";
	@Id
	private String id;
	@Column(name = "company_id")
	private Integer companyId;
	private String state;
	private String country;
	private String location;
	private String longitude;
	private String latitude;
	@Column(name = "project_sid")
	private byte[] projectSid;
	@Column(name = "visual_connect_sid")
	private byte[] visualConnectSid;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public byte[] getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(byte[] projectSid) {
		this.projectSid = projectSid;
	}

	public byte[] getVisualConnectSid() {
		return visualConnectSid;
	}

	public void setVisualConnectSid(byte[] visualConnectSid) {
		this.visualConnectSid = visualConnectSid;
	}

	public String projectSid() {
		return bytesToHexStringBySid(projectSid);
	}

	public String visualConnectSid() {
		return bytesToHexStringBySid(visualConnectSid);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CategorySearch)) {
			return false;
		}
		CategorySearch other = (CategorySearch) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.callcomm.eserve.persistence.entity.CategorySearch[ id="
				+ id + " ]";
	}
}
