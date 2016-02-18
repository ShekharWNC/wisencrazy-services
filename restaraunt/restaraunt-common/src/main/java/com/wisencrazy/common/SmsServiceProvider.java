package com.wisencrazy.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wisencrazy.common.exception.SmsDeliveryException;

public class SmsServiceProvider {
	
	private static Logger logger=LoggerFactory.getLogger(SmsServiceProvider.class);
	
	public static void sendSingleSms(String telNum, String message, boolean msgType,
			String senderid) throws SmsDeliveryException {
		String smsWebUri = null;
		
		boolean isIndianTelNum = IsIndianTelNum(telNum);
		
		if (isIndianTelNum) {
			logger.info("Valid Indian telephone number");
			smsWebUri = constructWebUrl(telNum, message, msgType, senderid);
			logger.info("smsWebUri is : {} ",smsWebUri);
		} else {
			logger.error("The telephone number {} is not a valid Indian telephone number.",telNum);
		}

		
		String smsdeliveryId = sendSMSToServiceProvider(smsWebUri);
		logger.info("SMS delivey id : {}",smsdeliveryId);
	}

	private static String sendSMSToServiceProvider(String smsWebUri) throws SmsDeliveryException {
		// reading response
		String response = "Error sending SMS";
		String msgID = null;
		BufferedReader reader=null;
		try {
			// prepare connection
			URL myURL = new URL(smsWebUri);
			URLConnection myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			 reader = new BufferedReader(new InputStreamReader(
					myURLConnection.getInputStream()));
			while ((response = reader.readLine()) != null) {
				// print response
				if (response != null) {
					msgID = response;
				}
			}
		} catch (IOException e) {
			logger.error("IOException : {}",e.toString());
			throw new SmsDeliveryException("SMS Delivery failed");
		}finally{
			if(reader!=null)
				try {
					reader.close();
				} catch (IOException e) {
					logger.error("IOException : {}",e.toString());
				}
		}
		return msgID;
	}

	
	private static String  constructWebUrl(String telNum, String message, boolean msgType,
            String senderid) {
      String mainUrl="http://203.212.70.200/smpp/sendsms?";
      String username = "";
      String apikey = "";
      StringBuilder sbPostData= new StringBuilder(mainUrl);
      String encoded_message=URLEncoder.encode(message);
      sbPostData.append("username="+username);
      sbPostData.append("&password="+apikey);
      sbPostData.append("&text="+encoded_message);
      sbPostData.append("&to="+telNum);
      sbPostData.append("&from=????&dlr-mask=19");
      return sbPostData.toString();
   }

	private static boolean IsIndianTelNum(String telNum) throws SmsDeliveryException {
		if(CommonUtils.isEmpty(telNum))throw new SmsDeliveryException("Invalid Telephone Number");
		return telNum.startsWith("+91") || telNum.startsWith("0091");
	}



}
