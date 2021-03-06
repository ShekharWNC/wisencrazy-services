package com.dto.constants;

public interface EnumConstants {
	
	public enum SettingFor{
		WEB
	}
	
	public enum AppSetting {
		LOCATION, BUSINESSCARD
	}
	
	public enum UserType{
    	AUTO_AGENT_USER,GENERAL_USER, CUSTOMER, AGENT
    }
	
	public enum SignupType {
		gmail, facebook, android, restaraunt
	}
	public enum PlaceOrigin {
		GOOGLE,VIACHAT
	}
	
	public enum RequestSource {
		WEB, APP
	}
	
	public enum GoogleConstants {
		restaraunt,gmail, facebook
	}
}
