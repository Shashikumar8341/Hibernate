package com.src.methods;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.src.products.Product;
import com.src.uitl.Util;

public class AddProducts {
	public static void main(String[] args) {
		Session s = Util.getSession();
		Transaction t = s.beginTransaction();
		Product product = new Product();
		product.setIdproduct(3);
		product.setP_name("shiva");
		product.setP_packket("note");
		product.setP_address("rdm");
		product.setDate(new Date());
		s.save(product);
		t.commit();
		s.close();

	}
}
