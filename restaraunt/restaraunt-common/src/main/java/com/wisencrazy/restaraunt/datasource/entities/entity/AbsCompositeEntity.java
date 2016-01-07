package com.wisencrazy.restaraunt.datasource.entities.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbsCompositeEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5968596201805472444L;

	final protected static char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	public byte[] sid;

	public AbsCompositeEntity() {
		super();
//		this.sid = hexStringToByteArray(UUID.randomUUID().toString().replace("-", "") + UUID.randomUUID().toString().replace("-", ""));
	}

	public byte[] getSid() {
		return sid;
	}

	public void setSid(byte[] sid) {
		this.sid = sid;
	}
	public void setSid(String sid) {
		this.sid = sid.getBytes();
	}
	
	public byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}
	
	public String bytesToHexString() {
		//The below line has been added incase the SID of any row has not been updated. Mainly helpful during testing and development
		if(sid==null || sid.length<=0)return "";
	    char[] hexChars = new char[sid.length * 2];
	    int v;
	    for ( int j = 0; j < sid.length; j++ ) {
	        v = sid[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public String bytesToHexStringBySid(byte[] sid) {
		//The below line has been added incase the SID of any row has not been updated. Mainly helpful during testing and development
		if(sid==null || sid.length<=0)return "";
	    char[] hexChars = new char[sid.length * 2];
	    int v;
	    for ( int j = 0; j < sid.length; j++ ) {
	        v = sid[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	
	public void genereateUuid(String projectSid, String companySid) throws Exception{
		if(projectSid != null && !projectSid.isEmpty()){
			if(companySid != null && !companySid.isEmpty()){
				this.sid = hexStringToByteArray(trimUUID(companySid, 16)+ trimUUID(projectSid, 16)+UUID.randomUUID().toString().replace("-", ""));
			}else{
				throw new Exception("project can't exist without companySid");
			}
		}else if(companySid != null && !companySid.isEmpty()){
			this.sid = hexStringToByteArray(trimUUID(companySid, 16)+"0000000000000000"+UUID.randomUUID().toString().replace("-", ""));
		}
	}
	
	/*
	 * Generating the default uuid with the combination two uuid
	 */
	public void generateUuid(){
		this.sid = hexStringToByteArray(UUID.randomUUID().toString().replace("-", "") + UUID.randomUUID().toString().replace("-", ""));
	}
	
	public String trimUUID(String uuid, int byteCount){ 
        char[] uuidChars = uuid.replace("-","").toCharArray();
        String newUUID ="";
        for(int i = 0; i<byteCount;i++){
            newUUID += uuidChars[i];
        }                           
        return newUUID;
    }
}
