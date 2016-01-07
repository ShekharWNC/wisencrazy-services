package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "visual_connect_has_custom_group")
@NamedQueries({
	@NamedQuery(name = VisualConnectHasGroup.FIND_GROUP_SID_BY_NAME_AND_VC_SID, query = "select hex(vcg.sid) from VisualConnectHasGroup vcg where vcg.groupName = :groupName and hex(vcg.visualConnect.sid) = :sid"),
	@NamedQuery(name = VisualConnectHasGroup.FIND_BY_SID, query = "from VisualConnectHasGroup vcg where hex(vcg.sid) = :sid"),
	@NamedQuery(name = VisualConnectHasGroup.FIND_BY_GROUP_SID_AND_VC_SID, query = "from VisualConnectHasGroup vcg where hex(vcg.sid) = :groupSid and hex(vcg.visualConnect.sid) = :sid"),
	@NamedQuery(name = VisualConnectHasGroup.FIND_BY_TABLE_ID, query = "select hex(vcg.sid)  from VisualConnectHasGroup vcg where vcg.tableId = :tableId")
})
public class VisualConnectHasGroup extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8477784143909170767L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VisualConnectHasGroup.";
	
	public static final String FIND_GROUP_SID_BY_NAME_AND_VC_SID = PREFIX + "findSidByNameAndVcSid";

	public static final String FIND_BY_SID = PREFIX + "findBySid";
	
	public static final String FIND_BY_GROUP_SID_AND_VC_SID = PREFIX + "findByGroupSidAndVcSid";
	
	public static final String FIND_BY_TABLE_ID = PREFIX + "findByTableId";

	@Column(name = "group_name")
	private String groupName;
	
	@NotNull 
	@Column(name = "table_id")
	private String tableId;
	
	@ManyToOne
	@JoinColumn(name = "visual_connect_id", referencedColumnName = "id")
	private VisualConnect visualConnect;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "custom_group_id", referencedColumnName = "id", nullable = false)
	private List<CustomTrackingVariable> customTrackingVariables;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public VisualConnect getVisualConnect() {
		return visualConnect;
	}

	public void setVisualConnect(VisualConnect visualConnect) {
		this.visualConnect = visualConnect;
	}

	public List<CustomTrackingVariable> getCustomTrackingVariables() {
		return customTrackingVariables;
	}

	public void setCustomTrackingVariables(
			List<CustomTrackingVariable> customTrackingVariables) {
		this.customTrackingVariables = customTrackingVariables;
	}
}
