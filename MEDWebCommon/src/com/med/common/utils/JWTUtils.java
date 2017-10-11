package com.med.common.utils;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;
import com.med.common.contants.Constants;

public class JWTUtils {
	public static String authenAndGetPersId(String token) throws InvalidKeyException, NoSuchAlgorithmException,
			IllegalStateException, SignatureException, IOException, JWTVerifyException {
		JWTVerifier jwt = new JWTVerifier(Constants.JWT.SECRET);
		Map<String, Object> decodedPayload = jwt.verify(token);
		return (String) decodedPayload.get("persId");
	}

	public static boolean authen(HttpServletRequest request) throws InvalidKeyException, NoSuchAlgorithmException,
			IllegalStateException, SignatureException, IOException, JWTVerifyException {
		String jws = request.getHeader(Constants.JWT.HEADER_NAME);
		JWTVerifier jwt = new JWTVerifier(Constants.JWT.SECRET);
		jwt.verify(jws);
		return true;
	}

	public static boolean authen(HttpServletRequest request, String role) {
		String jws = request.getHeader(Constants.JWT.HEADER_NAME);
		JWTVerifier jwt = new JWTVerifier(Constants.JWT.SECRET);
		try {
			Map<String, Object> decodedPayload = jwt.verify(jws);
			if (decodedPayload.get("role").equals(role)) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public static String sign(String username, String persId, List<?> role) {
		JWTSigner signer = new JWTSigner(Constants.JWT.SECRET);
		HashMap<String, Object> claims = new HashMap<String, Object>();
		claims.put("username", username);
		claims.put("persId", persId);
		if (role != null) {
			claims.put("role", role);
		}
		String signedToken = signer.sign(claims);
//		LoginRsType rs = new LoginRsType();
//		rs.setRole(role);
//		rs.setUsername(username);
//		rs.setSignature(signedToken);
		return signedToken;
	}

	public static String sign(String username, String persId) {
		return sign(username, persId, null);
	}

}
