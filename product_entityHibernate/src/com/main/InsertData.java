package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

public class InsertData {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Product.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
        Product p = new Product();
         
           p.setSr_no(100);
           p.setProduct_name("mobile");
           p.setPrice(1000);
           p.setCategory("electronics");
           
           
        ss.save(p);
        tr.commit();
        
        System.out.println("data inserted .....");
	}

}
