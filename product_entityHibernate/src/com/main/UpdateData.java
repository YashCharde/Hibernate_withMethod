package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class UpdateData {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int sr_no = 100;
		Product p = ss.get(Product.class, 100);
		p.setProduct_name("Smartphone");

		ss.update(p);

		System.out.println("data updated succefully");
		
		tr.commit();
		ss.close();

	}
}
