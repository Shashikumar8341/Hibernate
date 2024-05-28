package com.src.products;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.src.uitl.Util;

public class MemberTest {
	public static void main(String[] args) {

		Session session = Util.getSession();
		Transaction transaction = session.beginTransaction();
		Member m = new Member(9, "sri", "hari", 105);
		session.save(m);
		transaction.commit();
		session.close();
	}
}
