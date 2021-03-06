package com.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.naming.InitialContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.persistence.IDtoPersistence;
import com.dto.utils.DtoMappingUtils;

public abstract class AbstractCommonDTO implements Serializable {
	
	private static final Logger logger = LoggerFactory.getLogger(AbsCommonDTO.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -640345134233408383L;
	/** The Constant hexArray. */
	final protected static char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	protected static IDtoPersistence dtoPersistence;
	
	/** The sid. */

	public String sid;
	
	/**
	 * Gets the sid.
	 *
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}
	
	/**
	 * Sets the sid.
	 *
	 * @param sid the new sid
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	
	/**
	 * Sets the sid.
	 *
	 * @param sid the new sid
	 */
	public void setSidByBytes(byte[] bytes) {
		this.sid = bytesToHexString(bytes);
	}
	
	
	public byte[] hexStringToByteArray() throws Exception{
		return hexStringToBytes(generateSidIfNull());
	}

	public String generateSid() {
		return UUID.randomUUID().toString().replace("-", "") + UUID.randomUUID().toString().replace("-", "");
	}
	
	public String generateSidIfNull() throws Exception {
		if (sid != null && !sid.isEmpty()) {
			if (sid.length() != 64) {
				throw new Exception("Sid should be 64 character length");
			}
			return sid;
		} else {
			sid = generateSid();
			return sid;
		}
	}
	/**
	 * Hex string to byte array.
	 *
	 * @param s the s
	 * @return the byte[]
	 */
	public byte[] hexStringToBytes(String sid) {
	    int len = sid.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(sid.charAt(i), 16) << 4)
	                             + Character.digit(sid.charAt(i+1), 16));
	    }
	    return data;
	}
	
	/**
	 * Bytes to hex.
	 *
	 * @param bytes the bytes
	 * @return the string
	 */
	public  String bytesToHexString(byte[] bytes) {
	    char[] hexChars = new char[bytes.length * 2];
	    int v;
	    for ( int j = 0; j < bytes.length; j++ ) {
	        v = bytes[j] & 0xFF;
	        hexChars[j * 2] = hexArray[v >>> 4];
	        hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	    }
	    return new String(hexChars);
	}
	
	public static IDtoPersistence getDtoPersistence() {
		try {
			if (dtoPersistence == null) {
				Object obj = new InitialContext().lookup("java:global/repositoryservice/repositoryservice-ejb/DtoPersistenceImpl!com.dto.persistence.IDtoPersistence");
				if(obj instanceof IDtoPersistence){
					dtoPersistence = (com.dto.persistence.IDtoPersistence) obj;
				}
			}
		} catch (Exception e) {
			logger.error("Error at getDtoPersistence is - ",e.getMessage());
		}
		return dtoPersistence;
	}
	
	/*public <T> T populateEntityBySid(){
		try{
			return dtoPersistence.getEntityBySid(DtoMappingUtils.getInstance().getEntityClass(this.getClass().getSimpleName()), sid);
		}catch(Exception exception){
			
		}
		return null;
	}*/
}
