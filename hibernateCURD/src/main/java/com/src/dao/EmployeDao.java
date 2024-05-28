package com.src.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.src.entity.Employe;

import java.util.List;

public class EmployeDao {

	private static SessionFactory sessionFactory;

	public EmployeDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	public void create(Employe employe) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employe);
		transaction.commit();
		session.close();
	}

	public Employe getEmploye(int id) {
		Session session = sessionFactory.openSession();
		Employe member = session.get(Employe.class, id);
		session.close();
		return member;
	}

	public static List<Employe> getlist() {
		Session session = sessionFactory.openSession();
		List<Employe> employe = session.createQuery("from Employe", Employe.class).list();
		session.close();
		return employe;
	}

	public void update(Employe employe) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(employe);
		transaction.commit();
		session.close();
	}

	public void deletEmploye(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employe employe = new Employe();
		employe.setId(9);
		session.delete(employe);
		transaction.commit();
		session.close();

	}
}
