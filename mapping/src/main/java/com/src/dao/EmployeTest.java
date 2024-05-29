package com.src.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.src.entity.Employe;
import com.src.entity.Member;
import com.src.entity.Product;

public class EmployeTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		Employe e = new Employe();
		e.setId(2);
		e.setFirst("baby");
		e.setLast("kumar");
		e.setAge(30);
		s.save(e);
		Employe e2 = new Employe();
		e2.setId(3);
		e2.setFirst("hudbi");
		e2.setLast("shaym");
		e2.setAge(35);
		s.save(e2);
		ts.commit();
		s.close();
		sf.close();
	}
}
