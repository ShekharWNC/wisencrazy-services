package com.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * 
 * @author Vikash pandey
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class VirtualAccountHasSkillDTO extends AbsCommonDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 708380775160404912L;
	private String skillLevel;
	private SkillDTO skill;
	//private VirtualAccountDTO virtualAccount;
	
	public String getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}
	public SkillDTO getSkill() {
		return skill;
	}
	public void setSkill(SkillDTO skill) {
		this.skill = skill;
	}
	/*public VirtualAccountDTO getVirtualAccount() {
		return virtualAccount;
	}
	public void setVirtualAccount(VirtualAccountDTO virtualAccount) {
		this.virtualAccount = virtualAccount;
	}*/
	
}
