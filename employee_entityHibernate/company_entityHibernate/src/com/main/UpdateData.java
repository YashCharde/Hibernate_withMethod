package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Company;

public class UpdateData {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Company.class);
        
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int reg_id = 1100;
		
		Company c = ss.get(Company.class, reg_id);
		c.setCom_name("tata technology");
		c.setAdress("mumbai");
		
		ss.update(c);
		
		System.out.println("data updated succefully");
		tr.commit();
		ss.close();
	}
}
