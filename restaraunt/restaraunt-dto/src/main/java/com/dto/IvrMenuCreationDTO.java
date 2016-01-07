package com.dto;

import java.io.Serializable;
import java.util.List;

public class IvrMenuCreationDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private IvrMenuDefault ivrMenu;
	
	private IvrTreeDTO ivrTree;
	
	private List<String> subMenuRemovals;
	
	public IvrMenuDefault getIvrMenu() {
		return ivrMenu;
	}
	
	public void setIvrMenu(IvrMenuDefault ivrMenu) {
		this.ivrMenu = ivrMenu;
	}
	
	public IvrTreeDTO getIvrTree() {
		return ivrTree;
	}
	
	public void setIvrTree(IvrTreeDTO ivrTree) {
		this.ivrTree = ivrTree;
	}

	public List<String> getSubMenuRemovals() {
		return subMenuRemovals;
	}

	public void setSubMenuRemovals(List<String> subMenuRemovals) {
		this.subMenuRemovals = subMenuRemovals;
	}
}
