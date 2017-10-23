package com.med.ws.controller.service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Calendar;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.med.common.contants.Constants;
import com.med.ws.dto.type.rs.LoginRsType;

@Service
@Transactional
public class ASLService {
	private static Logger logger = LogManager.getLogger(ASLService.class);


	public String careateParam(String appId,String username,String password,String service){
		return appId+"|"+username+"|"+password+"|"+Constants.ASL_API.TOKEN_KEY+"|"+service+"|"+Calendar.getInstance().getTime();
	}
	public String AesEncoder(byte[] param){
		String urlParameters  = "appID=ASLHome1&param="+bytesToHex(param);
		return null;
	}
	
	 public byte[] encrypt(String param) {
	        try {
	        	String key = Constants.ASL_API.ENCRYPE_KEY;
	        	String initVector = Constants.ASL_API.VECTORY_KEY;
	            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

	            byte[] encrypted = cipher.doFinal(param.getBytes());
	            System.out.println("encrypted string: "
	                    + Base64.getEncoder().encodeToString(encrypted) + " :: "
	                    + bytesToHex(encrypted));

	            return encrypted;//Base64.getEncoder().encodeToString(encrypted);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return null;
	    }

     public String decrypt(String key, String initVector, byte[] encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(encrypted);
            System.out.println("encrypted string: " + new String(original));
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
     }
	    
	    public String bytesToHex(byte[] bytes) {
	    	char[] hexArray = "0123456789ABCDEF".toCharArray();
	        char[] hexChars = new char[bytes.length * 2];
	        for ( int j = 0; j < bytes.length; j++ ) {
	            int v = bytes[j] & 0xFF;
	            hexChars[j * 2] = hexArray[v >>> 4];
	            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	        }
	        return new String(hexChars);
	    }
	    
	    public LoginRsType aslLogin(String username,String password){
	    	String service = Constants.ASL_API.SERVICE.LOGIN;
    		String appId = Constants.ASL_API.APP_ID;
    		LoginRsType rs = new LoginRsType();
	    	Gson gson = new Gson();
	    	try {
	    		String params = careateParam(appId, username, password, service);
	    		byte[] pamramEndcode = encrypt(params);
	    		String urlParameters  = "appID="+appId+"&param="+bytesToHex(pamramEndcode);
	    		byte[] postData = urlParameters.getBytes( StandardCharsets.UTF_8 );
	    		int    postDataLength = postData.length;
	    		
				URL url = new URL(Constants.ASL_API.URL);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("POST");
//				conn.setRequestProperty("Authorization", SERVER_KEY);
				conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				conn.setDoOutput(true);
				conn.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
				OutputStream os = conn.getOutputStream();
				String msgBody = gson.toJson(null);
				os.write(msgBody.toString().getBytes("UTF-8"));
				os.close();

				if (200 != conn.getResponseCode()) {
					logger.error(conn.getInputStream().toString());
				}
				if (200 == conn.getResponseCode()) {
					rs.setUsername("");
					rs.setSignature("");
					logger.debug("200");
					InputStream in = new BufferedInputStream(conn.getInputStream());
					String result = org.apache.commons.io.IOUtils.toString(in,"UTF-8");
					JsonObject jsonResult = new JsonObject();
					jsonResult = gson.fromJson(result, JsonObject.class);
					logger.info(result);
					logger.info(jsonResult);
					in.close();
				}
				conn.disconnect();
			} catch (IOException io) {
				logger.error(io.getMessage(),io);
			}
	    	return new LoginRsType();
	    }
}
