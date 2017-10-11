package com.med.ws.controller.endpoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.common.utils.JWTUtils;

public class JWTVerifyInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws MEDException {
		try {
			if (request.getMethod().equals("OPTIONS")) {
				return true;
			}
			JWTUtils.authen(request);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			throw new MEDException(ErrorConstants.UNAUTHORIZED, e.getMessage());
		}
	}
}
