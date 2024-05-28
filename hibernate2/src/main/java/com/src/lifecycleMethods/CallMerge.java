package com.src.lifecycleMethods;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.src.products.Product;
import com.src.uitl.Util;

public class CallMerge {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
//	Product product = new Product(2, "ram", "sita", "ayodhya", new Date(1998 - 02 - 15));
		Product product = new Product();
		product.setIdproduct(1);
		product.setP_name("shashi");
		product.setP_packket("book");
		product.setP_address("ramagundam");
		product.setDate(new Date());
		session.save(product);
		transaction.commit();
		session.close();
	}
}
