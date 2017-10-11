package com.med.ws.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.med.ws.controller.endpoint.SessionCreatedListener;

public class WebAppInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext container) {
		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfig.class);
		rootContext.addApplicationListener(new SessionCreatedListener());
		
		container.addListener(new HttpSessionEventPublisher());


		
		// Manage the lifecycle of the root application context
		container.addListener(new ContextLoaderListener(rootContext));

		// Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.register(DispatcherConfig.class);

		// Register and map the dispatcher servlet
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher",
				new DispatcherServlet(dispatcherContext));
		dispatcher.setAsyncSupported(true);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}