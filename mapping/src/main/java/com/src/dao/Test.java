package com.src.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.src.entity.Member;
import com.src.entity.Product;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
				Member m = new Member();
				m.setFirst("radha");
				m.setLast("krishna");
				m.setAge(106);
				Product p = new Product();
				p.setFirst("radha");
				p.setLast("shashi");
				p.setAge(25);
				p.setM(m);
				s.save(p);
				s.save(m);
		
		ts.commit();
		s.close();
		sf.close();
	}
}
