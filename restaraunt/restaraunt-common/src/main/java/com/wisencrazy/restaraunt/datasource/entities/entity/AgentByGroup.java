package com.wisencrazy.restaraunt.datasource.entities.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="vw_agent_by_group")
public class AgentByGroup extends AbsBaseEntity {
  @Column(name="name")
  private String name;
  @Column(name="virtual_sid")
  private byte[] virtualSid;
  @Column(name="first_name")
  private String firstName;
  @Column(name="last_name")
  private String lastName;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public byte[] getVirtualSid() {
	return virtualSid;
}
public void setVirtualSid(byte[] virtualSid) {
	this.virtualSid = virtualSid;
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
public String virtualSid(){
	return bytesToHexStringBySid(virtualSid);
}
@Override
public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
}
@Override
public boolean equals(Object object) {
    if (!(object instanceof AgentByGroup)) {
        return false;
    }
    AgentByGroup other = (AgentByGroup) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
        return false;
    }
    return true;
}
@Override
public String toString() {
    return "com.callcomm.eserve.persistence.entity.AgentByGroup[ id=" + id + " ]";
}
}
