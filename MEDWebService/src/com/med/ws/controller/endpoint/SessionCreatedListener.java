package com.med.ws.controller.endpoint;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.session.HttpSessionCreatedEvent;
import org.springframework.stereotype.Service;

@Service
public class SessionCreatedListener implements ApplicationListener<HttpSessionCreatedEvent> {
 
    private static final int SOME_ARBITRARY_NUMBER_OF_REQUESTS = 10;
    
    @Autowired
    private SessionRegistry sessionRegistry;
 
    @SuppressWarnings("serial")
    @Override
    public void onApplicationEvent(HttpSessionCreatedEvent event) {
    	System.out.println("onApplicationEvent");
        event.getSession().setAttribute("monkeys", new LinkedHashMap<String, RequestHashMonkey>(10*4/3, 0.75f, true) {
                /*
                 * Anonymous classes are fun!
                 */
        		
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, RequestHashMonkey> eldest) {
                    return size() > SOME_ARBITRARY_NUMBER_OF_REQUESTS;
                }
            }
        );
        System.out.println("onApplicationEvent>"+event.getSession().getAttribute("monkeys"));
    }
 
}