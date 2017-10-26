package com.med.ws.config;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.lookup.DataSourceLookupFailureException;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.med.common.context.AppContext;
import com.med.common.utils.FileUtils;
import com.med.ws.controller.endpoint.DefaultInterceptor;
import com.med.ws.controller.endpoint.JWTVerifyInterceptor;
import com.med.ws.controller.endpoint.SingleSubmitInterceptor;
import com.med.ws.controller.endpoint.VersionInterceptor;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableWebMvc
@ComponentScan(basePackages = { "com.med" })
public class AppConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// Wiring the ApplicationContext into a static method
		AppContext.setApplicationContext(ctx);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SingleSubmitInterceptor()).addPathPatterns("/**");
		registry.addInterceptor(new DefaultInterceptor()).addPathPatterns("/**");
		registry.addInterceptor(new VersionInterceptor()).addPathPatterns("/*/app/**");
		registry.addInterceptor(new JWTVerifyInterceptor()).addPathPatterns("/private/**");
	}

	@Bean
	public RegisterSessionAuthenticationStrategy registerSessionAuthStr() {
		return new RegisterSessionAuthenticationStrategy(sessionRegistry());
	}
	@Bean
	public SessionRegistry sessionRegistry() {
		SessionRegistry sessionRegistry = new SessionRegistryImpl();
		return sessionRegistry;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws DataSourceLookupFailureException, IOException {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(this.dataSource());
		em.setPackagesToScan(new String[] { "com.med.ods" });
		em.setPersistenceUnitName("medJPAUnit");

		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());

		return em;
	}
	
//	@Bean
//	public LocalContainerEntityManagerFactoryBean aslEntityManagerFactory() throws DataSourceLookupFailureException, IOException {
//		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//		em.setDataSource(this.dataSourceALSView());
//		em.setPackagesToScan(new String[] { "com.med.ots" });
//		em.setPersistenceUnitName("medAslJPAUnit");
//
//		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		em.setJpaVendorAdapter(vendorAdapter);
//		em.setJpaProperties(additionalProperties());
//
//		return em;
//	}

	@Bean
//	@Primary
	public DataSource dataSource() throws DataSourceLookupFailureException, IOException {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		String env = System.getProperty("application.environment");
//		DataSource dataSource = dsLookup.getDataSource(System.getProperty("application.datasource.name." + env));
		DataSource ds = dsLookup.getDataSource("java:jboss/datasources/MsSqlDS");
		return ds;
	}
	
//	@Bean
//	public DataSource dataSourceALSView() throws DataSourceLookupFailureException, IOException {
//		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
//		dsLookup.setResourceRef(true);
//		String env = System.getProperty("application.environment");
////		DataSource dataSource = dsLookup.getDataSource(System.getProperty("application.datasource.name." + env));
//		DataSource ds = dsLookup.getDataSource("java:jboss/datasources/MsSqlDS");
//		return ds;
//	}
	

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("PUT", "DELETE", "GET", "POST", "OPTIONS", "HEAD")
				.allowedHeaders("Accept,Accept-Encoding", "Accept-Language", "Access-Control-Request-Method", "Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Authorization",
						"Connection","Unique-Token", "Content-Type", "Host", "Origin", "Referer", "Token-Id,User-Agent", "X-Requested-With", "enctype", "version")
				.allowCredentials(false).maxAge(3600);
	}

	@Bean
	public JpaTransactionManager transactionManager() throws DataSourceLookupFailureException, IOException {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(this.entityManagerFactory().getObject());

		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		return resolver;
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		MappingJackson2HttpMessageConverter jacksonMessageConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = jacksonMessageConverter.getObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
		// objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT,
		// true);
		converters.add(jacksonMessageConverter);
	}

	Properties additionalProperties() throws IOException {
		Properties properties = new Properties();
//		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.archive.autodetection", "class,hbm");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.show_sql", FileUtils.getEnvProperties("hibernate.show_sql"));
		properties.put("hibernate.use_sql_comments", FileUtils.getEnvProperties("hibernate.use_sql_comments"));
		properties.put("hibernate.event.merge.entity_copy_observer", "allow");
		return properties;
	}
}
