package com.med.common.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class AppContext {

	private static ApplicationContext context;

	public static void setApplicationContext(ApplicationContext applicationContext) {
		context = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}

	public static void refresh() {
		((ConfigurableApplicationContext) context).refresh();
	}
}
