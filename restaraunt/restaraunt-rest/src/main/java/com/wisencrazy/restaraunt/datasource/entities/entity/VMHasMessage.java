package com.wisencrazy.restaraunt.datasource.entities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: VMHasMessage
 * 
 */
@Entity
@Table(name = "vm_has_message")
@NamedQueries({
	@NamedQuery(name=VMHasMessage.FIND_BY_VMSID,query="select vm from VMHasMessage vm where vm.vmSid=:vmSid")
})
public class VMHasMessage extends AbsBaseEntity  {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4935678911976575480L;

	public VMHasMessage() {

	}

	private static final String PREFIX="com.callcomm.eserve.persistence.entity.VMHasMessage";
	public static final String FIND_BY_VMSID=PREFIX+".findByVmSid";
	public enum STATUS {
		IN_PROGRESS, SUCCESS
	}

	@Column(name = "vm_json_message")
	private String vmJsonMessage;
	@Column(name = "vm_sid")
	private String vmSid;
	@Column(name = "status")
	private String status;

	public String getVmJsonMessage() {
		return vmJsonMessage;
	}

	public void setVmJsonMessage(String vmJsonMessage) {
		this.vmJsonMessage = vmJsonMessage;
	}

	public String getVmSid() {
		return vmSid;
	}

	public void setVmSid(String vmSid) {
		this.vmSid = vmSid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
