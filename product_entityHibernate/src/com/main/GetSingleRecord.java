package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class GetSingleRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
        
		
		int sr_no = 100;
		Product p = ss.get(Product.class, sr_no);
		System.out.println(p);
		
//		System.out.println("product_name : "+p.getProduct_name());
//		System.out.println("price : "+p.getPrice());
//		System.out.println("category : "+p.getPrice());
//		
		System.out.println("data fatche succefully");
		
		tr.commit();
		ss.close();
	
	}
}
