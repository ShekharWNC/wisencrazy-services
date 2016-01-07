package com.dto;

import java.io.Serializable;

public class AppUserHasSkillCommonDTO extends AbsCommonDTO  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SkillDTO skill;
	
	public SkillDTO getSkill() {
		return skill;
	}

	public void setSkill(SkillDTO skill) {
		this.skill = skill;
	}
	
}
