package com.src.criteria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.src.entity.Employe;

public class EmployeTest {
public static void main(String[] args) {
	Configuration cfg = new Configuration().configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	Transaction ts = s.beginTransaction();
    CriteriaBuilder criteriaBuilder = s.getCriteriaBuilder();
    CriteriaQuery<Employe> query = criteriaBuilder.createQuery(Employe.class);
    Root<Employe> employee = query.from(Employe.class);
    query.select(employee)
         .where(criteriaBuilder.between(employee.get(employee.getClass()), 25, 35));
    List<Employe> resultList = s.createQuery(query).getResultList();
    resultList.forEach(System.out::println);
}
}
