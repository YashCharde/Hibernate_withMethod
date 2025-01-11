package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Company;

public class InsertData {
   public static void main(String[] args) {
	

       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       cfg.addAnnotatedClass(Company.class);
       SessionFactory sf = cfg.buildSessionFactory();
       Session ss = sf.openSession();
       Transaction tr = ss.beginTransaction();
       
       Company c = new Company();
       c.setReg_id(1100);
       c.setCom_name("techMahindra");
       c.setAdress("pune");
       
       ss.persist(c);
       tr.commit();
       
     
       
       System.out.println("data added...");
   }
}