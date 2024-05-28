package com.src.methods;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.src.products.Product;
import com.src.uitl.Util;

public class FindbyProduct {
	public static void main(String[] args) {
		Session s = Util.getSession();
		Product product = s.get(Product.class, 2);
		s.save(product);
		System.out.println("p:"+product);
		s.close();
	}
}
