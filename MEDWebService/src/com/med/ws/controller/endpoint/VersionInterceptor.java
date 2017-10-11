package com.med.ws.controller.endpoint;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.google.gson.Gson;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.common.utils.VersionUtils;

public class VersionInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws MEDException, IOException {
		String requestVersion = request.getHeader("version");
		requestVersion = requestVersion != null ? requestVersion : "0";
		if (request.getMethod().equals("OPTIONS")) {
			return true;
		}
		String allowedVersion = ConfigMapHelper.getConfigValue("SYSTEM.VERSION");
		allowedVersion = allowedVersion != null ? allowedVersion : "0";
		if (VersionUtils.compare(requestVersion, allowedVersion) >= 0) {

			return true;
		} else {
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");

			JSONObject json = new JSONObject();

			// put some value pairs into the JSON object .
			json.put("code", ErrorConstants.INVALID_VERSION.getErrorCd());
			json.put("desc", "version=" + requestVersion + " is not allowed. your version must be higher than " + allowedVersion);

			response.getWriter().write(new Gson().toJson(json));
			return false;
		}
	}
}
