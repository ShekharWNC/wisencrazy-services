package com.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactGroupListDTO.
 */
public class ContactGroupListDTO extends AbsCommonDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String groupName;
    
    private String totalMembers;
    
    private String companyGroupSid;
    
    private String companySid;
    
	private String href;
	
    
	public String getCompanySid() {
		return companySid;
	}

	public void setCompanySid(String companySid) {
		this.companySid = companySid;
	}

	public String getCompanyGroupSid() {
		return companyGroupSid;
	}

	public void setCompanyGroupSid(String companyGroupSid) {
		this.companyGroupSid = companyGroupSid;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
	public String getTotalMembers() {
		return totalMembers;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public void setTotalMembers(String totalMembers) {
		this.totalMembers = totalMembers;
	}
}
