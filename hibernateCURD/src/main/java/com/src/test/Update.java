package com.src.test;

import com.src.dao.EmployeDao;
import com.src.entity.Employe;

public class Update{
	public static void main(String[] args) {
		EmployeDao employeDao = new EmployeDao();
		Employe retrievedStudent = employeDao.getEmploye(3);

		   // Update the student
        retrievedStudent.setFirst("john");
        employeDao.update(retrievedStudent);
	}
}