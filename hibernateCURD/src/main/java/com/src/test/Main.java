package com.src.test;

import com.src.dao.EmployeDao;
import com.src.entity.Employe;

public class Main {
	public static void main(String[] args) {
		EmployeDao employeDao = new EmployeDao();
		// Create a new student
		Employe employe = new Employe();
        employe.setFirst("Jo");
        employe.setLast("Doe");
        employe.setAge(26);
        employeDao.create(employe);

	}
	}

