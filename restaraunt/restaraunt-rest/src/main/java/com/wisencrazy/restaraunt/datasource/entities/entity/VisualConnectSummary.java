package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.*;

import com.wisencrazy.restaraunt.datasource.entities.entity.AbsBaseEntity;
import com.wisencrazy.restaraunt.datasource.entities.entity.VisualConnect.OperationMode;
import com.wisencrazy.restaraunt.datasource.entities.entity.VisualConnect.UserInterfaceMode;



/**
 * The view class for the visual_connect database table.
 * 
 * @author Krish Lakshmanan
 */
@Entity
@Table(name = "vw_visual_connect")
@NamedQueries({
 @NamedQuery(name = VisualConnectSummary.FIND_BY_PROJECT_SID, query = "SELECT vc FROM VisualConnectSummary vc WHERE vc.projectSid = :projectSid")
	})
public class VisualConnectSummary extends AbsBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5998778860731204526L;

	public static final String PREFIX = "com.callcomm.eserve.persistence.entity.VisualConnectSummary.";
	public static final String FIND_BY_PROJECT_SID = PREFIX + "findByProjectSid";

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private boolean status;

	@Column(name="operation_mode")
	@Enumerated(EnumType.STRING)
	private OperationMode operationMode;

	@Column(name = "user_interface_mode")
	@Enumerated(EnumType.STRING)
	private UserInterfaceMode userInterfaceMode;

	@Column(name = "project_sid")
	private String projectSid;

	public VisualConnectSummary() {
	}

	public String getName() {
		return name;
	}

	public boolean getStatus() {
		return status;
	}

	public OperationMode getOperationMode() {
		return operationMode;
	}

	public UserInterfaceMode getUserInterfaceMode() {
		return userInterfaceMode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setOperationMode(OperationMode operationMode) {
		this.operationMode = operationMode;
	}

	public void setUserInterfaceMode(UserInterfaceMode userInterfaceMode) {
		this.userInterfaceMode = userInterfaceMode;
	}

	public String getProjectSid() {
		return projectSid;
	}

	public void setProjectSid(String projectSid) {
		this.projectSid = projectSid;
	}

}