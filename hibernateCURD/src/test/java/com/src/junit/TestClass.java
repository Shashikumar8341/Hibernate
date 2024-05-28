package com.src.junit;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.src.dao.EmployeDao;
import com.src.entity.Employe;
import com.src.util.ConncetionUtil;

public class TestClass {
	public static EmployeDao dao;

	@Test
	public void setUp() {
		// Create the SessionFactory from hibernate.cfg.xml
//	        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
//	        Session session = sessionFactory.openSession();
		Session session = null;
		session = ConncetionUtil.getSession();
		session.close();
		System.out.println(session);
	}

//	@Test
//	public void add() {
//		EmployeDao employeDao = new EmployeDao();
//		Employe employe = new Employe();
//		employe.setFirst("Jo");
//		employe.setLast("Doe");
//		employe.setAge(26);
//		employeDao.create(employe);
//	}
	@Test
	public void update() {
		EmployeDao employeDao = new EmployeDao();
		Employe employe = employeDao.getEmploye(10);
//		employe.setFirst("Jacks");
	Assert.assertEquals("Jacks",employeDao.update(employe));
		
//	}
//	@Test
//	public void delete() {
//		EmployeDao employeDao = new EmployeDao();
//		Employe employe = employeDao.getEmploye(10);
//		employeDao.deletEmploye(employe.getId());
//		
	}

	private void assertEquals(String expected, Object update) {
		// TODO Auto-generated method stub
		
	}
}