package com.src.test;

import java.util.List;

import com.src.dao.EmployeDao;
import com.src.entity.Employe;

public class FindAll {
	public static void main(String[] args) {
		EmployeDao employeDao = new EmployeDao();
		@SuppressWarnings("static-access")
		List<Employe> Employes=employeDao.getlist();
		for (Employe s : Employes) {
			System.out.println("Employe: " + s.getFirst() + " " + s.getLast());
			System.out.println(s);
		}
	}
}