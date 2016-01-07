package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the viachat_has_features database table.
 * 
 */
@Entity
@Table(name="viachat_has_features")
@NamedQueries({
	@NamedQuery(name = ViachatHasFeature.FIND_BY_SID, query = "SELECT v FROM ViachatHasFeature v where v.sid = unhex(:sid)"),
	@NamedQuery(name = ViachatHasFeature.FIND_ID_BY_KEY, query = "SELECT v.id FROM ViachatHasFeature v where v.featureKey = :key")
})
@NamedQuery(name="ViachatHasFeature.findAll", query="SELECT v FROM ViachatHasFeature v")
public class ViachatHasFeature extends AbsBaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5549013768911478324L;
	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.ViachatHasFeature.";
	public static final String FIND_BY_SID = PREFIX + "findIdBySid";
	public static final String FIND_ID_BY_KEY = PREFIX + "findIdByKey";

	@Column(name="feature_key")
	private String featureKey;

	@Column(name="feature_name")
	private String featureName;

	@Column(name="is_business_feature")
	private Boolean isBusinessFeature;

	@Column(name="is_subscription_req")
	private Boolean isSubscriptionReq;


	public ViachatHasFeature() {
	}

	public String getFeatureKey() {
		return this.featureKey;
	}

	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public Boolean getIsBusinessFeature() {
		return this.isBusinessFeature;
	}

	public void setIsBusinessFeature(Boolean isBusinessFeature) {
		this.isBusinessFeature = isBusinessFeature;
	}

	public Boolean getIsSubscriptionReq() {
		return this.isSubscriptionReq;
	}

	public void setIsSubscriptionReq(Boolean isSubscriptionReq) {
		this.isSubscriptionReq = isSubscriptionReq;
	}
}