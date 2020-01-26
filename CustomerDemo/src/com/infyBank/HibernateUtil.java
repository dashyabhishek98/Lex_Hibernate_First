package com.infyBank;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration().configure("resource/Hibernate.cfg.xml");
		sessionFactory = cfg.buildSessionFactory();
		
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
