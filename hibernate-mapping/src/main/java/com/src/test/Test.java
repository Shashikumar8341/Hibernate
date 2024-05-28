package com.src.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.src.entity.Address;
import com.src.entity.Branch;
import com.src.entity.College;
import com.src.entity.Coures;
import com.src.entity.Student;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tn = s.beginTransaction();
		Address a = new Address();
		a.setArea("ramagundam");

		Branch b1 = new Branch();
		b1.setName("btech");
		Branch b = new Branch();
		b.setName("degree");
		List<Branch> branchs = List.of(b1, b);
		College c = new College();
		c.setName("SRCH");

		Coures cu = new Coures();
		cu.setName("civil");
		Coures co = new Coures();
		co.setName("ece");
		List<Coures> coures = List.of(cu, co);
		Student st = new Student();
		st.setName("shashi");
		st.setAddress(a);
		st.setCollege(c);
		st.setBranchs(branchs);
		st.setCouress(coures);
		s.save(st);
		tn.commit();
		s.close();
		sf.close();
	}
}
