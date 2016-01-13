package com.wisencrazy.common;
import java.security.MessageDigest;

import org.apache.shiro.crypto.hash.Sha256Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// Encryption Algorithm using MD5
// Through this we have to encrypt the verification link.
public class EncryptionAlgoImpl {
   private static MessageDigest md;
   //configuring sl4j.
   private static final Logger logger=LoggerFactory.getLogger(EncryptionAlgoImpl.class);
   public static String cryptWithMD5(String pass){
	    logger.info("Invoking cryptWithMD5(String pass) method of EncryptionAlgo class");
	    try{
        md = MessageDigest.getInstance("MD5");
	    }catch(Exception e){
            logger.debug("Algoritm Problem");
        }
        byte[] passBytes = pass.getBytes();
        md.reset();
        byte[] digested = md.digest(passBytes);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<digested.length;i++){
            sb.append(Integer.toHexString(0xff & digested[i]));
        }
        logger.info("Returning encrypted password value");
        return sb.toString();
    } 
   
   public static String generateSha256Password(String password){
	   if(!CommonUtils.isEmpty(password)){
		   return new Sha256Hash(password).toBase64();
	   }
	return null;
   }
}