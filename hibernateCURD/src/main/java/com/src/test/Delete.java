package com.src.test;

import com.src.dao.EmployeDao;
import com.src.entity.Employe;

public class Delete{
	public static void main(String[] args) {
		EmployeDao employeDao = new EmployeDao();
		Employe retrievedStudent = employeDao.getEmploye(9);
		employeDao.deletEmploye(retrievedStudent.getId());
		

	}
}