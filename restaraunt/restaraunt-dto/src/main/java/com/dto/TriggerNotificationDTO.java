package com.dto;

public class TriggerNotificationDTO extends AbsCommonDTO{

	
	private static final long serialVersionUID = 7667325927137866207L;

	public enum TriggerNotificationName{
		email,
		suspended
	}
	
	private TriggerNotificationName name;

	public TriggerNotificationName getName() {
		return name;
	}

	public void setName(TriggerNotificationName name) {
		this.name = name;
	}
	
	
}
