package com.src.methods;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.src.products.Product;
import com.src.uitl.Util;

public class DeleteProduct {
	public static void main(String[] args) {
		Session s = Util.getSession();
		Transaction t = s.beginTransaction();
		Product product = new Product();
		product.setIdproduct(1);
		s.delete(product);
		t.commit();
		s.close();
	}
}
