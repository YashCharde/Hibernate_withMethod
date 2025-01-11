package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Company;

public class GetSingleRecord {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Company.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
        
        int Reg_id = 1100;
        Company c1 = ss.get(Company.class, Reg_id);
        System.out.println(c1);
        
//        System.out.println("Reg_id: " + c.getReg_id());
//        System.out.println("Company Name: " + c.getCom_name());
//        System.out.println("Address: " + c.getAdress());
//     
        System.out.println("data fetch succefully");
        tr.commit();
        ss.close();
        
        
	}
}
