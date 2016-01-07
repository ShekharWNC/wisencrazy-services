package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the project_has_features database table.
 * 
 */
@Embeddable
public class ProjectHasFeaturePK implements Serializable {
	//default serial version id, required for serializable classes.

	/**
	 * 
	 */
	private static final long serialVersionUID = -6519213511877895893L;

	@Column(name="feature_id")
	private int featureId;

	@Column(name="project_id")
	private int projectId;

	public ProjectHasFeaturePK() {
	}
	public int getFeatureId() {
		return this.featureId;
	}
	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}
	public int getProjectId() {
		return this.projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProjectHasFeaturePK)) {
			return false;
		}
		ProjectHasFeaturePK castOther = (ProjectHasFeaturePK)other;
		return 
			(this.featureId == castOther.featureId)
			&& (this.projectId == castOther.projectId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.featureId;
		hash = hash * prime + this.projectId;
		
		return hash;
	}
}