package com.wisencrazy.restaraunt.account;

import java.util.Arrays;
import java.util.UUID;

import javax.ws.rs.core.NewCookie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dto.CustomerDTO;
import com.dto.constants.EnumConstants.GoogleConstants;
import com.dto.constants.EnumConstants.SignupType;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.dto.CustomerLoginDTO;
import com.google.dto.LoginDetailsDTO;
import com.google.dto.LoginDetailsDTO.LoginType;
import com.wisencrazy.common.ApplicationConstants;
import com.wisencrazy.common.CommonUtils;
import com.wisencrazy.common.EncryptionAlgoImpl;
import com.wisencrazy.common.JsonUtils;
import com.wisencrazy.common.QueryParameter;
import com.wisencrazy.common.exception.ApplicationException;
import com.wisencrazy.restaraunt.datasource.entities.entity.Customer;

public class CustomerLogin extends CustomerSignup {

	private static Logger logger=LoggerFactory.getLogger(CustomerLogin.class);
	
	/**
	 * Default HTTP transport to use to make HTTP requests.
	 */
	private static final HttpTransport TRANSPORT = new NetHttpTransport();
	/**
	 * Default JSON factory to use to deserialize JSON.
	 */
	private static final JacksonFactory JSON_FACTORY = new JacksonFactory();

	
	public CustomerDTO customerLogin(CustomerLoginDTO customerLoginDTO) throws ApplicationException{

		logger.info("login(String, String, HttpServletRequest) - Start");
		CustomerDTO customerInfo = null;
		NewCookie[] cookies = null;
		try {
			validateCustomerLoginDetails(customerLoginDTO);
			
			LoginDetailsDTO loginDetails = new LoginDetailsDTO(customerLoginDTO.getEmailId());
			loginDetails.setLoginType(LoginType.CUSTOMER);
			logger.debug("Getting Email By Access token for {}",customerLoginDTO.getAccessToken());
			getEmailByAccessToken(customerLoginDTO.getAccessToken(),loginDetails, customerLoginDTO.getExtension());
			if(CommonUtils.isEmpty(customerLoginDTO.getEmailId())){
				logger.info("email using access token : {}", loginDetails.getUsername());
				customerLoginDTO.setEmailId(loginDetails.getUsername());
			}
			if(CommonUtils.isEmpty(customerLoginDTO.getPassword()) && !CommonUtils.isEmpty(customerLoginDTO.getAccessToken())){
				customerLoginDTO.setPassword(ApplicationConstants.ACCESS_TOKEN);
			}
			
			String stringToken = customerLoginDTO.getToken();
			if(CommonUtils.isEmpty(stringToken)){
				stringToken = UUID.randomUUID().toString();
				customerLoginDTO.setToken(stringToken);
			}
		
			customerInfo = validateCustomerLogin(customerLoginDTO);			
		} catch (ApplicationException applicationException) {
			throw applicationException;
		}
		logger.info("login(String, String, HttpServletRequest) - End");
		return customerInfo;
	}

	private CustomerDTO validateCustomerLogin(CustomerLoginDTO customerLoginDTO) throws ApplicationException {
		try {
			CustomerDTO customer = commonRepoServ.getDtoByNamedQuery(Customer.class, CustomerDTO.class, Customer.FIND_CUSTOMER_BY_EMAIL, QueryParameter.with("email", customerLoginDTO.getEmailId()).parameters());
			
			if(!customerLoginDTO.getPassword().equals(ApplicationConstants.ACCESS_TOKEN)){
				logger.debug("password before : {}", customerLoginDTO.getPassword());
				if(customer.getSignupType().equals(SignupType.restaraunt)){
					//Checking ori
					customerLoginDTO.setPassword(EncryptionAlgoImpl.generateSha256Password(customerLoginDTO.getPassword()));
					
					if(!CommonUtils.isEmpty(customer.getPassword()) && !customer.getPassword().equals(customerLoginDTO.getPassword())){
						validateUserRegistration(customer.getSignupType());
						throw new ApplicationException(ApplicationConstants.INCORRECT_PWD); //Please provide a valid password.
					}
				}else {
					customerLoginDTO.setPassword(customer.getPassword());
				}
				
			}
			return customer;
		} catch (ApplicationException e) {
			logger.error("loginCheck(String, String)", e.getLocalizedMessage()); 
			throw e;
		} 
	}

	private void validateCustomerLoginDetails(CustomerLoginDTO customerLogin) throws ApplicationException {
		if(customerLogin != null){
			logger.debug("Validating customer login : {}", JsonUtils.toJson(customerLogin));
			if(CommonUtils.isEmpty(customerLogin.getAccessToken()) && CommonUtils.isEmpty(customerLogin.getEmailId())){
				throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG);
			}
			
			if(CommonUtils.isEmpty(customerLogin.getAccessToken()) && CommonUtils.isEmpty(customerLogin.getPassword())){
				throw new ApplicationException(ApplicationConstants.ILLEGAL_ARG);
			}
		}
		
	}
	
	private void getEmailByAccessToken(String accessToken,
			LoginDetailsDTO loginDetails, GoogleConstants extension) throws ApplicationException {
		if(extension != null){
			switch (extension) {
			case gmail:
				logger.debug("Getting email by AccessToken : {}",accessToken);
				getEmailByGoogleAccessToken(accessToken, loginDetails, extension);
				break;
			case facebook:
				logger.warn("Coming Soon");
//				getEmailByFacebookAccessToken(accessToken, loginDetails);
				break;
			default:
				break;
			}
			loginDetails.setPassword(ApplicationConstants.ACCESS_TOKEN);
		}
		
	}
	

//	private void getEmailByFacebookAccessToken(String accessToken,
//			LoginDetailsDTO loginDetails) throws ApplicationException {
//		try{
//		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
//		User user = fbClient.fetchObject("me", User.class);
//		if(user == null || CommonUtils.isEmpty(user.getEmail())){
//			throw new ApplicationException(ApplicationConstants.ES_SECURITY_010);//Facebook token is not valid.
//		}
//		logger.debug("facebook user email: {}", user.getEmail());
//		loginDetails.setUsername(user.getEmail());
//		}catch (Exception exception){
//			throw new ApplicationException(ApplicationConstants.ES_SECURITY_010, exception);//Facebook token is not valid.
//		}
//	}


	private void getEmailByGoogleAccessToken(String accessToken,
			LoginDetailsDTO loginDetails, GoogleConstants extension) throws ApplicationException {
		logger.trace("getEmailByGoogleAccessToken({}, LoginDetails) - Start",accessToken);
		if(!CommonUtils.isEmpty(accessToken)){
			logger.debug("getting google profile info using token : {}", accessToken);
			if(loginDetails.getLoginType() != null && loginDetails.getLoginType().equals(LoginType.CUSTOMER)){
				logger.debug("Validation customer google access token");
				validateCustomerGoogleAccessToken(accessToken, extension, loginDetails.getUsername());
			}else{//To be implemented later for hotels
				}
		}
		logger.trace("getEmailByGoogleAccessToken(String, LoginDetails) - End");
	}

	public void validateCustomerGoogleAccessToken(String accessToken,
			GoogleConstants extension, String email) throws ApplicationException {
		String emailId = null;
		logger.trace("validateCustomerGoogleAccessToken(String, String, String) - Start");
		try{
			logger.debug("Finding emailId by access token: {}",accessToken);
			emailId = (String)commonRepoServ.findSingleByNamedQuery(Customer.VALIDATE_GOOGLE_ACCESS_TOKEN, QueryParameter.with("TOKEN", accessToken).parameters());
			if(!emailId.equalsIgnoreCase(email)){
				logger.debug("access token : {} for email : {}", accessToken, emailId);
				throw new ApplicationException(ApplicationConstants.INVALID_ACCESS_TOKEN);
			}
		}catch(ApplicationException applicationException){
			logger.error("Processing error for Finding EmailId by Access token: {}",JsonUtils.toJson(applicationException));
			if(applicationException.getLocalizedMessage().equals(ApplicationConstants.NO_RESULT)){
				logger.debug("Validating Access token from google {} for extension {}",accessToken,extension);
				emailId = validateGoogleAccessToken(accessToken, extension);
				if(emailId == null || !emailId.equalsIgnoreCase(email)){
					logger.debug("access token : {} for email : {}", accessToken, emailId);
					throw new ApplicationException(ApplicationConstants.INVALID_ACCESS_TOKEN);
				}
				logger.debug("Updating the accessToken for the emailId: {}",email);
				QueryParameter  queryParameter = QueryParameter.with("emailId", email);
				queryParameter.and("TOKEN", accessToken);
				logger.info("email id : {} login with google", email);
				commonRepoServ.insertOrUpdateByNamedQuery(Customer.UPDATE_GOOGLE_TOKEN_BY_EMAIL, queryParameter.parameters());
			}
		}
		logger.trace("validateCustomerGoogleAccessToken(String, String, String) - End");
	}
	
	public String validateGoogleAccessToken(String token, GoogleConstants extension)
			throws ApplicationException {
		logger.trace("validateGoogleAccessToken(String, String) - Start");
		String gmail = null;
		String cid = null;
		String clientId = null;
		
		if(extension != null) {
			cid = extension.name();
		}
		clientId=cid;
		logger.debug("Preparing the token verifer object with clientId: {}",clientId);
		
	if(!CommonUtils.isEmpty(clientId)){	
			GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(TRANSPORT, JSON_FACTORY)
		    .setAudience(Arrays.asList(clientId))
		    .build();
	
		// (Receive idTokenString by HTTPS POST)
	
		GoogleIdToken idToken = null;
		logger.debug("using the verifier to verify the token: {}",token); 
		try {
			idToken = verifier.verify(token);
		} catch (Exception e) {
			logger.error("invalid access token general");
			  throw new ApplicationException(ApplicationConstants.INVALID_ACCESS_TOKEN);
		}
		if (idToken != null) {
			logger.debug("Processing the payload");
		  Payload payload = idToken.getPayload();
		  if (cid.equals(payload.getAuthorizedParty())) {
		    logger.info("Google email: {}" , payload.getEmail());
		    gmail =  payload.getEmail();
		  } else {
			  logger.error("invalid authorized party");
			  throw new ApplicationException(ApplicationConstants.INVALID_ACCESS_TOKEN);
		  }
		} else {
			logger.error("invalid access token null");
			  throw new ApplicationException(ApplicationConstants.INVALID_ACCESS_TOKEN);
		}
	}
	return gmail;
}

	private void validateUserRegistration(SignupType signupType) throws ApplicationException {
		logger.trace("validateUserRegistration(SignupType) - Start");
			if(signupType != null){
				switch (signupType) {
				case gmail:
					throw new ApplicationException(ApplicationConstants.GMAIL_LOGIN);//You have registered using gmail, Please login using gmail.
				case facebook:
					throw new ApplicationException(ApplicationConstants.FB_LOGIN);//You have registered using facebook, Please login using facebook.
				case restaraunt:
					throw new ApplicationException(ApplicationConstants.INCORRECT_PWD); //Please provide a valid password.
				default:
					logger.error("Default Case");
					break;
				}
			}
		logger.trace("validateUserRegistration(SignupType) - End");
	}

	
}
