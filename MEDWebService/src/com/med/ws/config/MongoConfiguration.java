package com.med.ws.config;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {

		Context initCtx;
		// return "tumed";
		// return "medtu_test";
		String env = System.getProperty("application.environment");
		return System.getProperty("application.mongo.db."+env);
	}

	@Override
	public Mongo mongo() throws Exception {
		String env = System.getProperty("application.environment");
		Context initCtx = new InitialContext();
		MongoClient mc = (MongoClient) initCtx.lookup("java:global/MyMongoClient");
		System.out.println(mc);
		Mongo mongo = 
				(MongoClient) initCtx.lookup("java:global/MyMongoClient");
//				new MongoClient(new ServerAddress(System.getProperty("application.mongo.host."+env),Integer.parseInt(System.getProperty("application.mongo.port"))),
//                Collections.singletonList(MongoCredential.createCredential(System.getProperty("application.mongo.db.username"),System.getProperty("application.mongo.db.name"),System.getProperty("application.mongo.db.password").toCharArray())));
		return mongo;
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.med.mdb.repo";
	}
}
