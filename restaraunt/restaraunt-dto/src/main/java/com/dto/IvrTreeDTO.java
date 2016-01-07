package com.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author priyatham
 */
public class IvrTreeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private IvrAnnouncementDTO announcement;
	private List<IvrNodeDTO> nodes;
	
	public IvrAnnouncementDTO getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(IvrAnnouncementDTO announcement) {
		this.announcement = announcement;
	}
	public List<IvrNodeDTO> getNodes() {
		return nodes;
	}
	public void setNodes(List<IvrNodeDTO> nodes) {
		this.nodes = nodes;
	}
}
