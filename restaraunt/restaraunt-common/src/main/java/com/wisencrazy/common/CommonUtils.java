package com.wisencrazy.common;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wisencrazy.common.exception.ApplicationException;

public class CommonUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);
	private static final CommonUtils commonUtils = new CommonUtils();
	private CommonUtils(){	}
	public static CommonUtils getInstance(){
		return commonUtils;
	}
	
	public static Response getSuccessCode(Object successCode){
		logger.trace("getSuccessCode(SuccessCode successCode) - start"); 

		Response response = Response.status(201).entity(successCode).build();
		logger.trace("getSuccessCode(SuccessCode successCode) - end"); 
		return response;
	}
	
	public static Response getSuccessResponse(Object responseObject){
		Response response = null;
		if(responseObject != null){
			response = Response.status(200).entity(responseObject).build();
		}else{
			response = Response.status(200).build();
		}
		return response;
	}
	public static SuccessCode generateSuccessCode(String contextPath, String uri, String sid) {
		SuccessCode successCode = new SuccessCode();
		successCode.setHref( contextPath  + uri + sid);
		return successCode;
	}
	public static SuccessCode generateSuccessCode(String name,
			String contextPath, String uri, String sid) {
		SuccessCode successCode = new SuccessCode();
		successCode.setName(name);
		successCode.setHref(contextPath  + uri + sid);
		return successCode;
	}
	public static String getGMTTimeStamp(String strDateFormat,String strTimeZone){
		DateFormat dateFormat=new SimpleDateFormat(strDateFormat);
		dateFormat.setTimeZone(TimeZone.getTimeZone(strTimeZone));
		Calendar gmtTimeZone=Calendar.getInstance(TimeZone.getTimeZone(strTimeZone));
		return dateFormat.format(gmtTimeZone.getTime());
	}
	
	
	public synchronized static byte[] converObjectToByteArray(Object object) {
		byte[] bytes = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			bytes = baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	public synchronized static Object convetByteArrayToObject(byte[] bytes) {
		try {
			ByteArrayInputStream baip = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(baip);
			return ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String readableFileSize(long size) {
	    if(size <= 0) return "0";
	    final String[] units = new String[] { "B", "KB", "MB", "GB", "TB" };
	    int digitGroups = (int) (Math.log10(size)/Math.log10(1024));
	    return new DecimalFormat("#,##0.#").format(size/Math.pow(1024, digitGroups)) + " " + units[digitGroups];
	}
	
	public static boolean isEmpty(String name){
		boolean flag = true;
		if(name != null && !name.trim().isEmpty()){
			flag = false;
		}
		return flag;
	}
	
	public static boolean isEmpty(Integer value){
		boolean flag = true;
		if(value != null && value>0){
			flag = false;
		}
		return flag;
	}

	
		
		public Integer getTotalNumberOfPage(Long totalNumberOfRecord, Integer recordLimit) {
			Integer totalPageCountQuotiant=(int) (totalNumberOfRecord/recordLimit);
			Integer totalPageCountRemainder=(int) (totalNumberOfRecord%recordLimit);
			Integer totalPageCount=null;
			if(totalPageCountQuotiant==0 && totalPageCountRemainder!=0){
				totalPageCount=1;
			}else if(totalPageCountQuotiant!=0 && totalPageCountRemainder==0){
				totalPageCount=totalPageCountQuotiant;
			}else if(totalPageCountQuotiant!=0 && totalPageCountRemainder!=0){
				totalPageCount=totalPageCountQuotiant+1;
			}
			return totalPageCount;
		}
		
		/**
		 * This is used get browser name with version by taking the browser user-agent header information.
		 * @param Information
		 * @return
		 */
		public static String getBrowser(String Information) {
			String browsername = "";
	        String browserversion = "";
			if(!CommonUtils.isEmpty(Information)){
		        String browser = Information  ;
		        if(browser.contains("MSIE")){
		            String subsString = browser.substring( browser.indexOf("MSIE"));
		            String Info[] = (subsString.split(";")[0]).split(" ");
		            browsername = Info[0];
		            browserversion = Info[1];
		         }
		       else if(browser.contains("Firefox")){
		            String subsString = browser.substring( browser.indexOf("Firefox"));
		            String Info[] = (subsString.split(" ")[0]).split("/");
		            browsername = Info[0];
		            browserversion = Info[1];
		       }
		       else if(browser.contains("Chrome")){

		            String subsString = browser.substring( browser.indexOf("Chrome"));
		            String Info[] = (subsString.split(" ")[0]).split("/");
		            browsername = Info[0];
		            browserversion = Info[1];
		       }
		       else if(browser.contains("Opera")){

		            String subsString = browser.substring( browser.indexOf("Opera"));
		            String Info[] = (subsString.split(" ")[0]).split("/");
		            browsername = Info[0];
		            browserversion = Info[1];
		       }
		       else if(browser.contains("Safari")){

		            String subsString = browser.substring( browser.indexOf("Safari"));
		            String Info[] = (subsString.split(" ")[0]).split("/");
		            browsername = Info[0];
		            browserversion = Info[1];
		       }          
			}
			   return browsername + "-" +browserversion;
		}
		
		/**
		 * This will call the rest api of type post and send the response as a string.
		 * @param urlToRead
		 * @return
		 * @throws ApplicationException
		 */
		public static String getUrlResponse(String urlToRead)throws ApplicationException {
			logger.trace("getUrlResponse(String) - Start");
		    return getUrlResponseByMethodType(urlToRead, "POST");
		}
		
		public static String getUrlResponseByMethodType(String urlToRead,
				String methodType) throws ApplicationException {
			logger.trace("getUrlResponseByMethodType(String, String) - Start");
			  URL url;
		      HttpURLConnection connection = null;
		      BufferedReader bufferedReader = 	null;
		      String line = null;
		      String result = "";
		      try {
		         url = new URL(urlToRead);
		         connection = (HttpURLConnection) url.openConnection();
		         connection.setRequestMethod(methodType);
		         connection.connect();
		         logger.debug("url response code : {}",connection.getResponseCode());
		         if(connection.getResponseCode() == HttpStatus.SC_OK){
			         bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			         while ((line = bufferedReader.readLine()) != null) {
			            result += line;
			         }
		        	 bufferedReader.close();
		         }
		      } catch (IOException exception) {
		    	  logger.error("file not found : {}", exception.getLocalizedMessage());
		    	  throw new ApplicationException("", exception); // IoException (Error in file reading)
		      } 
		      logger.trace("getUrlResponseByMethodType(String, String) - End");
		      return result;
		}

	    public static String generatePassword() {
			int passwordLength = 8;
			Random RANDOM = new SecureRandom();
	        // Pick from some letters that won't be easily mistaken for each
	        // other. So, for example, omit o O and 0, 1 l and L.
	        String letters = "abcdefghjkmnpqrstuvwxyzABCD#@$!EFGHJKMNPQRSTUVWXYZ23456789#@$!";

	        String password = "";
	        for (int i=0; i<passwordLength; i++)
	        {
	            int index = (int)(RANDOM.nextDouble()*letters.length());
	            password += letters.substring(index, index+1);
	        }
	        letters = null;
			return password;
		}
		
		public static String encryptPassword(String password){
			return new Sha256Hash(password).toBase64();
		}
		
		public static String getOS(String browserDetails) throws ApplicationException{
			try {
				String os = "";
				if(!CommonUtils.isEmpty(browserDetails)){
			        String  userAgent       =   browserDetails;
			        //=================OS=======================
			         if (userAgent.toLowerCase().indexOf("windows") >= 0 )
			         {
			             os = "Windows";
			         } else if(userAgent.toLowerCase().indexOf("mac") >= 0)
			         {
			             os = "Mac";
			         } else if(userAgent.toLowerCase().indexOf("x11") >= 0)
			         {
			             os = "Unix";
			         } else if(userAgent.toLowerCase().indexOf("android") >= 0)
			         {
			             os = "Android";
			         } else if(userAgent.toLowerCase().indexOf("iphone") >= 0)
			         {
			             os = "IPhone";
			         }else{
			             os = "UnKnown, More-Info: "+userAgent;
			         }
				}
				 return os;
			} catch (Exception exception) {
				logger.error("Exception : ",exception);
				throw new ApplicationException("Error in getting the  os details");
			}
		}
		public static String getDeviceType(String userAgent) throws ApplicationException{
			try {
				 if(!CommonUtils.isEmpty(userAgent)&&userAgent.indexOf("Mobile") != -1) {
					  return "Mobile";
					  } else {
					   return "Desktop";
					  }
			} catch (Exception exception) {
				logger.error("Exception : ",exception);
				throw new ApplicationException("Error in getting the device type");
			}
		}

	
	public static String generateUniqueNumber() {
		int inc = 0;
		Long id = Long.parseLong(String.valueOf(System.currentTimeMillis()).substring(1, 10).concat(String.valueOf(inc)));
		inc = (inc + 1) % 10;
		return id.toString();
	}
	
	/**
	 * Method is used for getting 5 digit random number.
	 * @return
	 */
	@Deprecated
	public static int getRandomNumber() {
	    Random r = new Random( System.currentTimeMillis() );
	    return (1 + r.nextInt(9)) * 10000 + r.nextInt(10000);
	}
	// Generate four digits random number
	public static String generateTwoDegitsRandomNumber(){
		String no=String.valueOf(Math.round(Math.random()*100));
		if(String.valueOf(no).length()!=2)
			no=generateTwoDegitsRandomNumber();
		return no;
	}
	
	/**
	 * Method for validating email.
	 * @param email
	 * @throws ApplicationException
	 */
	public static void validateEmail(String email)throws ApplicationException {
		if(email != null) {
			String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		 
			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			
			Matcher	matcher = pattern.matcher(email);
			if (!matcher.matches()){
				throw new ApplicationException("Email Pattern not matching");
			}
		}
	}
	
}
