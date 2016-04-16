package com.wisencrazy.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wisencrazy.common.exception.SmsDeliveryException;

public class SmsServiceProvider {
	
	private static Logger logger=LoggerFactory.getLogger(SmsServiceProvider.class);
	
	public static void sendSingleSms(String telNum, String message, boolean msgType,
			String senderid) throws SmsDeliveryException, UnsupportedEncodingException {
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
			System.out.println(smsWebUri);
			URL myURL = new URL(smsWebUri);
			URLConnection myURLConnection = myURL.openConnection();
			myURLConnection.connect();
			 reader = new BufferedReader(new InputStreamReader(
					myURLConnection.getInputStream()));
			while ((response = reader.readLine()) != null) {
				// print response
				System.out.println(response);
				if (response != null) {
					msgID = response;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
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
            String senderid) throws UnsupportedEncodingException {
      String mainUrl="http://www.smsgatewaycenter.com/library/send_sms_2.php?";
      String username = "fresh4you";
      String apikey = "kywRxt0r";
      StringBuilder sbPostData= new StringBuilder(mainUrl);
      String encoded_message=URLEncoder.encode(message,"UTF-8");
      sbPostData.append("UserName="+username);
      sbPostData.append("&Password="+URLEncoder.encode(apikey,"UTF-8"));
      sbPostData.append("&Type=Individual");
      sbPostData.append("&Mask=FRESHU");
      sbPostData.append("&Message="+encoded_message);
      telNum=telNum.substring(telNum.length()-10);
      sbPostData.append("&To="+telNum);
//      sbPostData.append("&from=????&dlr-mask=19");
      return sbPostData.toString();
   }

	private static boolean IsIndianTelNum(String telNum) throws SmsDeliveryException {
		if(CommonUtils.isEmpty(telNum))throw new SmsDeliveryException("Invalid Telephone Number");
		return telNum.startsWith("+91") || telNum.startsWith("0091");
	}

/*	public static void main(String[] params){
		try {
			sendSingleSms("+919632688020", "Hi Text", false, "");
		} catch (SmsDeliveryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
