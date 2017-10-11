package com.med.ws.controller.endpoint;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class SingleSubmitInterceptor extends HandlerInterceptorAdapter {

	private static final String GET = "GET";
	private static final Logger logger = LogManager.getLogger(SingleSubmitInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		/* we don't care about get requests */
		if(false){
//		if (!request.getMethod().equals(GET) && handler != null && handler instanceof HandlerMethod && ((HandlerMethod) handler).getMethodAnnotation(SingleSubmit.class) != null) {
//			ConcurrentHashMap<String, RequestHashMonkey> monkeys = (ConcurrentHashMap<String, RequestHashMonkey>) request.getSession().getAttribute("monkeys");
			LinkedHashMap<String, RequestHashMonkey> monkeys = (LinkedHashMap<String, RequestHashMonkey>) request.getSession().getAttribute("monkeys");
			System.out.println(request.getSession().getAttribute("monkeys"));
			RequestHashMonkey monkey = new RequestHashMonkey(request);
			System.out.println(request.getRequestURL());
			RequestHashMonkey previous = monkeys.get(request.getRequestURL().toString());
			if (previous != null && Arrays.equals(monkey.getHash(), previous.getHash())) {
				response.sendError(409, "Duplicate");
				return false;
			} else {
				monkeys.put(request.getRequestURL().toString(), monkey);
			}
		}
		return super.preHandle(request, response, handler);
	}

}