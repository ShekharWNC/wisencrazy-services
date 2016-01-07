package com.dto.constants;

public interface EnumConstants {
	
	public enum SettingFor{
		ANDROID, IOS, BLACKBERRY, WEB
	}
	
	public enum AppSetting {
		LOCATION, BUSINESSCARD
	}
	
	public enum UserType{
    	AUTO_AGENT_USER,GENERAL_USER, CUSTOMER, AGENT
    }
	
	public enum SignupType {
		gmail, facebook, android, viachat
	}
	public enum PlaceOrigin {
		GOOGLE,VIACHAT
	}
	
	public enum PrinterType {
		INVOICE, KOT
	}
	public enum FeatureStatus {
		ACTIVE, INACTIVE, WL
	}
	
	public enum RequestSource {
		WEB, APP
	}
	
	public enum GoogleConstants {
		android, ios, idine_android, idine_ios, extension, gmail, facebook
	}
}
