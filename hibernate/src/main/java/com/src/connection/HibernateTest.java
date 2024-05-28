package com.src.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.src.Member;
import com.src.Parson;

public class HibernateTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		Member member = new Member(8, "shiva", "parvati", 95);
//		session.save(member);
		Parson parson=new Parson();
		parson.setId(1);
		parson.setName("shashi");
		parson.setPhnumber(8341866042L);
		parson.setDate("1998-02-25");
		session.save(parson);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
