package com.src.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConncetionUtil {
	private static SessionFactory sessionFactory = null;
	static {
		try {

			Configuration configuration = new Configuration();
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Session getSession() {
		return sessionFactory.openSession();

	}

	public static void main(String[] args) {
		System.out.println(getSession());
	}

}
