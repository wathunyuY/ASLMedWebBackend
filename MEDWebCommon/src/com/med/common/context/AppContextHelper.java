package com.med.common.context;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

public class AppContextHelper {
	private static ApplicationContext context;

	static {
		context = AppContext.getApplicationContext();
	}

	public static Connection getConnection() throws SQLException {
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		return dataSource.getConnection();
	}

	public static Map<String, Object> getBeansFromContext() {
		System.out.println(context);
		return context.getBeansWithAnnotation(Service.class);
	}
}
