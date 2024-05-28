package com.src.uitl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
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

	/**
	 * @param dateText
	 */
	public static Date extractDate(String dateText) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date date = dateFormat.parse(dateText);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
