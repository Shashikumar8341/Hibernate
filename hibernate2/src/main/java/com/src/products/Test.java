package com.src.products;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.src.uitl.Util;

public class Test {
	public static void main(String[] args) {
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfi.xml");
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction=session.beginTransaction();
////		Product product = new Product(1, "shashi", "book", "rdm", "1998-05-12");
//		Product product = new Product();
//		product.setIdproduct(1);
//		product.setP_name("shashi");
//		product.setP_packket("book");
//		product.setP_address("ramagundam");
//		product.setDate(new Date());
//		session.save(product);
//		transaction.commit();
//		session.close();
//		sessionFactory.close();
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		Product product = new Product(4, "ram", "sita", "ayodhya", Util.extractDate("15-02-1998"));
//	Product product = new Product();
//	product.setIdproduct(1);
//	product.setP_name("shashi");
//	product.setP_packket("book");
//	product.setP_address("ramagundam");
//	product.setDate(new Date());
		session.save(product);
		transaction.commit();
		session.close();
	}
}
