package com.rances.util;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.DatatypeConverter;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.rances.common.PropertiesLoader;

/**
 * Configuaracion de base de datos: En este caso se muestra como se configura con Hibernate.
 */
public class HibernateUtil {
	
	private static PropertiesLoader props;
	private static final SessionFactory sessionFactory;
	public static String usuario;
	public static String password;
	
	File conf = new File(props.getPropertyFile("CONF"));
	
	static {
		try {
			props = PropertiesLoader.getInstance();

			File conf = new File(props.getPropertyFile("CONF"));
			Configuration configuration = new Configuration().configure(conf
					.getAbsoluteFile());
			decodeUserAndPass(configuration);
			configuration.setProperty("hibernate.connection.password", decode(password));
			configuration.setProperty("hibernate.connection.username", decode(usuario));
			ServiceRegistry serviceRegistry =
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static  void decodeUserAndPass(Configuration configuration) {
		password = configuration.getProperty("hibernate.connection.password");
		usuario = configuration.getProperty("hibernate.connection.username");
	}
	
	private static String decode(String encodedToken) throws IOException {
		
		String decodedToken = null;
		decodedToken = new String(DatatypeConverter.parseBase64Binary(encodedToken));
		return decodedToken;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
